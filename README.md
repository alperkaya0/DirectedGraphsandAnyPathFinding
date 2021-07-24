# DirectedGraphsandAnyPathFinding
Directed Graphs, Any Path Finding,Path Validating + Romania Cities

Vertecies and edges relations are like given:

![Relationships Visualising](https://github.com/alperkaya0/DirectedGraphsandAnyPathFinding/blob/main/35662691-7d0dbc72-06e7-11e8-942c-4718f079bb8f.png)

Text Form:

Node Name: Bucharest  Node Value: 0 => Node Name: Urziceni  Node Value: 0 Weight: 85.0 <br/>
Node Name: Fagaras  Node Value: 0 => Node Name: Bucharest  Node Value: 0 Weight: 211.0 <br/>
Node Name: Pitesti  Node Value: 0 => Node Name: Bucharest  Node Value: 0 Weight: 101.0 <br/>
Node Name: RimnicuViicea  Node Value: 0 => Node Name: Cralova  Node Value: 0 Weight: 146.0 <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;=> Node Name: Pitesti  Node Value: 0 Weight: 97.0 <br/>
Node Name: Oradea  Node Value: 0 => Node Name: Sibiu  Node Value: 0 Weight: 151.0 <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;=> Node Name: Zerinci  Node Value: 0 Weight: 71.0 <br/>
Node Name: Sibiu  Node Value: 0 => Node Name: Fagaras  Node Value: 0 Weight: 99.0 <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;=> Node Name: RimnicuViicea  Node Value: 0 Weight: 80.0 <br/>
Node Name: Vasiul  Node Value: 0 => Node Name: Iasi  Node Value: 0 Weight: 92.0 <br/>
Node Name: Cralova  Node Value: 0 => Node Name: Pitesti  Node Value: 0 Weight: 138.0 <br/>
Node Name: Eforie  Node Value: 0 => Node Name: Hirsova  Node Value: 0 Weight: 86.0 <br/>
Node Name: Mehadia  Node Value: 0 => Node Name: Dobreta  Node Value: 0 Weight: 75.0 <br/>
Node Name: Lugoj  Node Value: 0 => Node Name: Mehadia  Node Value: 0 Weight: 70.0 <br/>
Node Name: Glurgiu  Node Value: 0 => Node Name: Bucharest  Node Value: 0 Weight: 90.0 <br/>
Node Name: Urziceni  Node Value: 0 => Node Name: Vasiul  Node Value: 0 Weight: 142.0 <br/>
Node Name: Arad  Node Value: 0 => Node Name: Sibiu  Node Value: 0 Weight: 140.0 <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;=> Node Name: Timisoara  Node Value: 0 Weight: 118.0 <br/>
Node Name: Zerinci  Node Value: 0 => Node Name: Arad  Node Value: 0 Weight: 75.0 <br/>
Node Name: Dobreta  Node Value: 0 => Node Name: Cralova  Node Value: 0 Weight: 120.0 <br/>
Node Name: Hirsova  Node Value: 0 => Node Name: Urziceni  Node Value: 0 Weight: 98.0 <br/>
Node Name: Timisoara  Node Value: 0 => Node Name: Lugoj  Node Value: 0 Weight: 111.0 <br/>
Node Name: Iasi  Node Value: 0 => Node Name: Neamt  Node Value: 0 Weight: 87.0 <br/>
