# social-network-quantum-comp

The repository includes 3 different algorithms for community detection in social networks.
All of the proposed algorithms optimize for a maximum modularity as it has been defined by Newman et al. [1].\
Within the quantum annealing approach (QA1) the problem is solved by the D-Wave Hybrid Solver Service. Here, quantum as well as classical solvers are utilized and 
a direct addressing of discrete quadratic problems is supported.\
Due to the lower number of qubits in gate-based devices, such a direct encoding of discrete problems (e.g. via one-hot encoding) 
is not possible for sufficient problem sizes, which makes heuristics a necessity.\
The first gate-based hybrid algorithm (GB1) iteratively itentifies the strongest community in a graph, with the modularity per node as the underlying metric.
For binary community detection within this approach, the quantum local search (QLS) algorithm is used [2]. Once the strongest community is detected, it is stored
and the according nodes are deleted from the original graph before the procedure repeats for the remaining nodes.
It  is  assumed  that  the  algorithm  works  best  for  graphs  with  heterogeneous community structure, because of the logic of iteratively detecting
communities based on their connectivity.\
The second gate based algorithm (GB2) applies a recursive version of QLS [2] to the graph, whereas in every recursion an according attribute value is stored for
every node. Once the graph has been separated in 2^x groups in this way, the maximum modularity can then be obtained by searching in the power set of the identified
groups (e.g. by a brute-force search). In this implementation the simple way of just looking at different recursion levels has been used.
It  is  assumed  that  the  algorithm  works  best  for  graphs  with 2^x communities.
 
 
 
References:\
[1] Aaron Clauset, Mark E. J. Newman, and Cristopher Moore. “Finding community structure in very large networks”. In:Physical review. E, Statistical, nonlinear, and soft matter physics 70.6 Pt 2 (2004), p. 066111.issn: 1539-3755.doi:10.1103/PhysRevE.70.066111.\
[2] Ruslan Shaydulin et al. “A Hybrid Approach for Solving OptimizationProblems  on  Small  Quantum  Computers”.  In:Computer52.6  (2019),pp. 18–26.issn: 0018-9162.doi:10.1109/MC.2019.290894.

# Installation from the sources

Requirements:
- Eclipse 2020-09 (4.17.0)
- Sirius 6.3.4
- Java 9

Import the plugins from [Bundles](jku.se.social.network.project/bundles/)

Example:

To test our tool, you may test the example of the Zackary-Club.

Import in a runtime environment the [Zackary Club Project](samples/zachary.karate.club/)

*Generate NextworkX*
Right Click over the *.socialnetwork->Generate NetworkX
*Generate Deployment*
Right Click over the *.qcdeployment->Generate JupiterExecution

