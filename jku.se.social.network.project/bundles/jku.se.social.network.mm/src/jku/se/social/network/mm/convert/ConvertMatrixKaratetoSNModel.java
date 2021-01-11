package jku.se.social.network.mm.convert;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import jku.se.social.network.mm.SocialNetwork.Person;
import jku.se.social.network.mm.SocialNetwork.Relationship;
import jku.se.social.network.mm.SocialNetwork.SocialNetwork;
import jku.se.social.network.mm.SocialNetwork.impl.SocialNetworkFactoryImpl;

public class ConvertMatrixKaratetoSNModel implements IApplication {
	
	//Zachary Karate Club
	public static String KARATE_ZACHARY_CLUB = "resources/zachary-matrix.dat";
	public static int KARATE_ZACHARY_ROWS= 34;
	public static int KARATE_ZACHARY_COLUMS = 34;
	public static String PROJECT_PATH = ConvertMatrixKaratetoSNModel.class.getProtectionDomain().getCodeSource().getLocation().getPath();
	
	//Zachary EMF Model
	public static String ZACHARY_EMF_MODEL = "resources/zachary.socialnetwork";
	
	@Override
	public Object start(IApplicationContext context) throws Exception {		
		int [][] karateClubMatrix = getKarateClubMatrix();
		convertKarateMatrix2Model(karateClubMatrix);		
		System.out.println("Finish Conversion to EMF Model");
		return null;
	}
	
	public void convertKarateMatrix2Model(int[][] karateClubMatrix) {
		SocialNetwork sn = SocialNetworkFactoryImpl.eINSTANCE.createSocialNetwork();
		sn.setName("Zachary Karate Club");
		createPersons(sn,karateClubMatrix.length);
		createRelations(sn,karateClubMatrix);
		Resource karateClubResource = createSNKarateModel();
		karateClubResource.getContents().add(sn);
		try {
			karateClubResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void createRelations(SocialNetwork sn, int[][] karateClubMatrix) {
		for (int i = 1; i < karateClubMatrix.length; i++) {
			Person currentPerson = sn.getPersons().get(i);
			for (int j = 0; j < i; j++) {
				int existTie = karateClubMatrix[i][j];
				if (existTie == 1) {
					Person targetPerson = sn.getPersons().get(j);
					Relationship relation = SocialNetworkFactoryImpl.eINSTANCE.createRelationship();
					relation.setSource(currentPerson);
					relation.setTarget(targetPerson);
					sn.getRelationships().add(relation);
				}					
			}
		}
	}

	public static void createPersons(SocialNetwork sn, int length) {
		for (int i = 0; i < length; i++) {
			Person person = SocialNetworkFactoryImpl.eINSTANCE.createPerson();
			person.setName(Integer.toString(i));
			sn.getPersons().add(person);
		}		
	}

	public static Resource createSNKarateModel() {
		ResourceSet reset = new ResourceSetImpl();
		Resource karateClubResource = reset.createResource(URI.createFileURI(PROJECT_PATH + ZACHARY_EMF_MODEL));
		return karateClubResource;
	}
	
	public static int[][] getKarateClubMatrix() {		
		int [][] karateClubMatrix = new int[KARATE_ZACHARY_ROWS][KARATE_ZACHARY_COLUMS];
		try {
			Scanner sc = new Scanner(new BufferedReader(new FileReader(PROJECT_PATH + KARATE_ZACHARY_CLUB)));
			while(sc.hasNextLine()) {
				for (int i=0; i< karateClubMatrix.length; i++) {
		            String[] line = sc.nextLine().trim().split(" ");
		            for (int j=0; j< line.length; j++) {
		            	karateClubMatrix[i][j] = Integer.parseInt(line[j]);
		            }
		         }
			}			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}		
		return karateClubMatrix;
	}

	@Override
	public void stop() {
		// Do nothing
	}

}
