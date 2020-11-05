/**
 Autores:Tomás Duque y Juan Felipe Ortiz**/
import java.util.ArrayList;
import java.util.LinkedList;

public class GrafoAL extends Grafo {
    LinkedList<Par<Integer, Integer>>  Listas[];

    public GrafoAL(int size) {
        super(size);
        Listas = new LinkedList[size];
    }

    public void addArc(int source, int destination, int weight) {
        if( Listas[source] == null){
            Listas[source] = new LinkedList<Par<Integer, Integer>>();
        }
        Listas[source].add(new Par(destination, weight));
    }

    public ArrayList<Integer> getSuccessors(int vertex){
        LinkedList< Par<Integer, Integer> > destinos =  Listas[vertex];
        ArrayList<Integer> sucesores = new ArrayList<>();
        if(destinos.isEmpty())return sucesores;
        for(int i = 0; i < destinos.size(); i++){
            sucesores.add(destinos.get(i).first);
        }
        return sucesores;
    }

    public int getWeight(int source, int destination) {
        //ArrayList<LinkedList< Pair<Integer, Integer> >> arregloDeListas;
        LinkedList< Par<Integer, Integer> > destinos =  Listas[source];
        for (int i = 0; i < destinos.size(); i++)
            if (destinos.get(i).first == destination)
                return destinos.get(i).second;
        return -1;
    }
}