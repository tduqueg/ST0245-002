/**
 Autores:Tomás Duque y Juan Felipe Ortiz**/
import java.util.ArrayList;



public class GrafoAM extends Grafo {
    int[][] matriz;
    public GrafoAM(int size) {
        super(size);
        matriz = new int[size][size];
    }
    public void addArc(int source, int destination, int weight) {
        matriz[source][destination] = weight;
    }
    public ArrayList<Integer> getSuccessors(int vertex) {
        ArrayList<Integer> successor = new ArrayList();
        for (int i = 0; i <size; i++)
            if (matriz[vertex][i] != 0)
                successor.add(i);
        return successor;
    }
    public int getWeight(int source, int destination) {
        return matriz[source][destination];
    }
}