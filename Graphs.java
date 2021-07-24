import java.util.*;

public class Graphs {

    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph();
        Map<String,Edge> edges = new HashMap<>();
        Vertex oradea = new Vertex(0,"Oradea");
        Vertex zerinci = new Vertex(0,"Zerinci");
        Vertex arad = new Vertex(0,"Arad");
        Vertex timisoara = new Vertex(0,"Timisoara");
        Vertex lugoj = new Vertex(0,"Lugoj");
        Vertex mehadia = new Vertex(0,"Mehadia");
        Vertex dobreta = new Vertex(0,"Dobreta");
        Vertex cralova = new Vertex(0,"Cralova");
        Vertex pitesti = new Vertex(0,"Pitesti");
        Vertex rimnicuviicea = new Vertex(0,"RimnicuViicea");
        Vertex sibiu = new Vertex(0,"Sibiu");
        Vertex fagaras = new Vertex(0,"Fagaras");
        Vertex bucharest = new Vertex(0,"Bucharest");
        Vertex glurgiu = new Vertex(0,"Glurgiu");
        Vertex urziceni = new Vertex(0,"Urziceni");
        Vertex vasiul = new Vertex(0,"Vasiul");
        Vertex iasi = new Vertex(0,"Iasi");
        Vertex neamt = new Vertex(0,"Neamt");
        Vertex hirsova = new Vertex(0,"Hirsova");
        Vertex eforie = new Vertex(0,"Eforie");
        Edge edgeOradeaZerinci = new Edge(oradea,zerinci,71);
        Edge edgeOradeaSibiu = new Edge(oradea,sibiu,151);
        Edge edgeZerinciArad = new Edge(zerinci,arad,75);
        Edge edgeAradSibiu = new Edge(arad,sibiu,140);
        Edge edgeAradTimisoara = new Edge(arad,timisoara,118);
        Edge edgeTimisoaraLugoj = new Edge(timisoara,lugoj,111);
        Edge edgeLugojMehadia = new Edge(lugoj,mehadia,70);
        Edge edgeMehadiaDobreta = new Edge(mehadia,dobreta,75);
        Edge edgeDobretaCralova = new Edge(dobreta,cralova,120);
        Edge edgeCralovaPitesti = new Edge(cralova,pitesti,138);
        Edge edgeSibiuRimnicuViicea = new Edge(sibiu,rimnicuviicea,80);
        Edge edgeRimnicuViiceaPitesti = new Edge(rimnicuviicea,pitesti,97);
        Edge edgeSibiuFagaras = new Edge(sibiu,fagaras,99);
        Edge edgeFagarasBucharest = new Edge(fagaras,bucharest,211);
        Edge edgePitestiBucharest = new Edge(pitesti,bucharest,101);
        Edge edgeGlurguiBucharest = new Edge(glurgiu,bucharest,90);
        Edge edgeBucharestUrziceni = new Edge(bucharest,urziceni,85);
        Edge edgeEforieHirsova = new Edge(eforie,hirsova,86);
        Edge edgeHirsovaUrziceni = new Edge(hirsova,urziceni,98);
        Edge edgeUrziceniVasiul = new Edge(urziceni,vasiul,142);
        Edge edgeVasiulIasi = new Edge(vasiul,iasi,92);
        Edge edgeIasiNeamt = new Edge(iasi,neamt,87);
        LinkedList<Edge> temp = new LinkedList<>();
        temp.add(edgeIasiNeamt);
        temp.add(edgeVasiulIasi);
        temp.add(edgeUrziceniVasiul);
        temp.add(edgeHirsovaUrziceni);
        temp.add(edgeEforieHirsova);
        temp.add(edgeBucharestUrziceni);
        temp.add(edgeGlurguiBucharest);
        temp.add(edgePitestiBucharest);
        temp.add(edgeFagarasBucharest);
        temp.add(edgeSibiuFagaras);
        temp.add(edgeRimnicuViiceaPitesti);
        temp.add(edgeSibiuRimnicuViicea);
        temp.add(edgeCralovaPitesti);
        temp.add(edgeDobretaCralova);
        temp.add(edgeMehadiaDobreta);
        temp.add(edgeLugojMehadia);
        temp.add(edgeTimisoaraLugoj);
        temp.add(edgeAradTimisoara);
        temp.add(edgeAradSibiu);
        temp.add(edgeZerinciArad);
        temp.add(edgeOradeaSibiu);
        temp.add(edgeOradeaZerinci);
        for (Edge e:temp) {
            edges.put(e.getFrom().getName().toUpperCase()+e.getTo().getName().toUpperCase(),e);
        }
        graph.setV(20);
        graph.setEdges(edges);
        graph.addVertex(oradea);
        graph.addVertex(cralova);
        graph.addVertex(bucharest);
        graph.addVertex(dobreta);
        graph.addVertex(sibiu);
        graph.addVertex(fagaras);
        graph.addVertex(arad);
        graph.addVertex(rimnicuviicea);
        graph.addVertex(hirsova);
        graph.addVertex(zerinci);
        graph.addVertex(pitesti);
        graph.addVertex(mehadia);
        graph.addVertex(lugoj);
        graph.addVertex(timisoara);
        graph.addVertex(glurgiu);
        graph.addVertex(neamt);
        graph.addVertex(iasi);
        graph.addVertex(vasiul);
        graph.addVertex(eforie);
        graph.addVertex(urziceni);
        graph.update();
        System.out.println(graph.toStringAdjacency());
//	    System.out.println(a.getEdges().containsKey("DC"));//There is no key for D to C but you are able to go
//        System.out.println(a.getEdges().containsKey("BA"));


        Vertex from = dobreta;//Change here to use
        Vertex to = neamt;


        System.out.println(isValidPath(from,to,graph) ? ("You can go to "+to.getName()+" from "+from.getName()+".\n") : ("You can't go to "+to.getName()+" from "+from.getName()+"!\n"));
        LinkedList<Vertex> result = reArrange(to,findAnyPath(from,to,graph));
        int count = 0;
        for (Vertex v : result) {
            if(count != result.size()-1) System.out.print(v.getName()+" => ");
            else System.out.print(v.getName() + "\n");
            ++count;
        }
    }

    public static LinkedList<Vertex> findPossibleWays(Vertex s,DirectedGraph graph) {
        LinkedList<Vertex> edgs = new LinkedList<>();
        for (int i = 0;i<graph.getV();++i) {
            Vertex temp = null;
            if (!Objects.isNull(graph.getEdges().get(s.getName().toUpperCase()+graph.getVertices().get(i).getName().toUpperCase())))
                temp = graph.getEdges().get(s.getName().toUpperCase()+graph.getVertices().get(i).getName().toUpperCase()).getTo();
            if (!Objects.isNull(temp)) {
                edgs.add(temp);
            }
        }
        return edgs;
    }

    public static LinkedList<Vertex> reArrange(Vertex u, LinkedList<Vertex> path) {
        int count = 0;
        for (Vertex v: path) {
            if (!v.equals(u)) {
                ++count;
            }else{
                break;
            }
        }
        int size = path.size();
        for (int i = count+1; i < size; ++i) {
            path.removeLast();
        }
        return path;
    }

    public static LinkedList<Vertex> findAnyPath(Vertex s,Vertex u, DirectedGraph graph) {
        if (!isValidPath(s,u,graph)) {
            return new LinkedList<Vertex>();
        }
        LinkedList<Vertex> paths = new LinkedList<>();
        LinkedList<Vertex> edges = findPossibleWays(s,graph);
        paths.add(s);
        for (Vertex v: edges) {
            if (isValidPath(v,u,graph)) paths.addAll(findAnyPath(v,u,graph));
        }
        for (int i = 0;i<paths.size()-1;++i) {
            boolean con = graph.getEdges().containsKey(paths.get(i).getName().toUpperCase()+paths.get(i+1).getName().toUpperCase());
            if (!con) {
                paths.remove(i+1);
            }
        }
        return paths;
    }

    public static boolean isValidPath(Vertex s,Vertex u,DirectedGraph graph) {
        HashSet<Vertex> set = new HashSet<>();
        LinkedList<Vertex> edgs = new LinkedList<>();
        boolean solvable = false;
        ArrayList<Boolean> solvables = new ArrayList<>();
        for (int i = 0;i<graph.getV();++i) {
            Vertex temp = null;
            if (!Objects.isNull(graph.getEdges().get(s.getName().toUpperCase()+graph.getVertices().get(i).getName().toUpperCase())))
                temp = graph.getEdges().get(s.getName().toUpperCase()+graph.getVertices().get(i).getName().toUpperCase()).getTo();
            if (!Objects.isNull(temp)) {
                edgs.add(temp);
            }
        }
        if (s.equals(u)) {
            solvable = true;
        }else {
            for (Vertex v:edgs) {
                if (!s.equals(u)) {
                    solvables.add(isValidPath(v,u,graph));
                }
            }
        }
        if (solvables.contains(true)) {
            solvable = true;
        }
        return solvable;
    }
}


class Vertex {
    public int value;
    public Map<String,Edge> edges;
    public String name;
    Vertex(int value,Map<String,Edge> edges) {
        this.value = value;
        this.edges = edges;
    }
    Vertex(int value) {
        this.value = value;
        this.edges = null;
    }
    Vertex(int value,String name) {
        this.value = value;
        this.edges = null;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEdges(Map<String,Edge> edges) {
        this.edges = edges;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Map<String,Edge> getEdges() {
        return edges;
    }

    public int getValue() {
        return value;
    }
}

class Edge {
    public Vertex from;
    public Vertex to;
    public double weight;
    Edge(Vertex from,Vertex to,double weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public Vertex getFrom() {
        return from;
    }

    public Vertex getTo() {
        return to;
    }

    public void setFrom(Vertex from) {
        this.from = from;
    }

    public void setTo(Vertex to) {
        this.to = to;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class DirectedGraph {
    public int V;
    public int E;
    public ArrayList<Vertex> vertices = new ArrayList<>(0);
    Map<String,Edge> edges = new HashMap<>();
    public Map<Vertex,LinkedList<Vertex>> adjacency = new HashMap<>();
    DirectedGraph() {}
    DirectedGraph(int V,int E) {
        this.V = V;
        this.E = E;
    }
    DirectedGraph(int V,int E,ArrayList<Vertex> vertices,ArrayList<Edge> edges,Map<Vertex,LinkedList<Vertex>> adjacency) {
        this.V = V;
        this.E = E;
        this.vertices = vertices;
        this.adjacency = adjacency;
    }

    public void setEdges(Map<String, Edge> edges) {
        this.edges = edges;
    }

    public Map<String, Edge> getEdges() {
        return edges;
    }

    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
        vertices.get(vertices.size()-1).setEdges(edges);
    }
    public void update() {
        this.V = vertices.size();
        for (int i = 0;i<V;++i) {
            LinkedList<Vertex> temp = new LinkedList<>();
            for (int a = 0;a<V;++a) {
                String s = vertices.get(i).getName().toUpperCase()+vertices.get(a).getName().toUpperCase();
                //System.out.println(s);
                Edge e = vertices.get(i).getEdges().get(s);
                if (!Objects.isNull(e)) {
                    //You can check this StdOut if there is a problem
                    //System.out.println(e.getFrom().getName()+e.getTo().getName());
                    temp.add(e.getTo());
                }
            }
            adjacency.put(vertices.get(i),temp);
        }
    }
    public Map<Vertex,LinkedList<Vertex>> getAdjacency() {
        return adjacency;
    }

    public ArrayList<Vertex> getVertices() {
        return vertices;
    }

    public int getE() {
        return E;
    }

    public int getV() {
        return V;
    }

    public void setV(int v) {
        V = v;
    }

    public void setE(int e) {
        E = e;
    }

    public void setAdjacency(Map<Vertex,LinkedList<Vertex>> adjacency) {
        this.adjacency = adjacency;
    }

    public void setVertices(ArrayList<Vertex> vertices) {
        this.vertices = vertices;
    }

    public String toStringAdjacency() {
        String s = "";
        for (Vertex v:adjacency.keySet()) {
            int count = 0;
            String space = "";
            int length = (v.name+" "+v.getValue()).length();
            for (int i = 0;i<length+24;++i) {
                space += " ";
            }
            for (Vertex vAlt:adjacency.get(v)) {
                if (count == 0) {
                    s += "Node Name: " + v.getName() + " " + " Node Value: " + v.value +" => " + "Node Name: " + vAlt.getName() + " " + " Node Value: " + vAlt.getValue() + " Weight: "+vAlt.getEdges().get(v.getName().toUpperCase()+vAlt.getName().toUpperCase()).getWeight() + "\n";
                }else {
                    s += space + " => " + "Node Name: " + vAlt.getName() + " " + " Node Value: " + vAlt.getValue() + " Weight: "+vAlt.getEdges().get(v.getName().toUpperCase()+vAlt.getName().toUpperCase()).getWeight() + "\n";
                }
                ++count;
            }
        }
        return s;
    }
}
