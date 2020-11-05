import java.util.LinkedList;
/**
 * Write a description of class BFS here.
 *
 * @author Tomás Duque y Juan Felipe Ortiz
 * @version (1)
 */
public class BFS {
    public static boolean hayCaminoBFS(Grafo g, int origen, int destino){
        boolean[] visitados = new boolean[g.size];
        LinkedList<Integer> siguientes = new LinkedList<>();
        return hayCaminoAuxBFS(g, origen, destino, siguientes, visitados);
    }

    public static boolean hayCaminoAuxBFS(Grafo g, int origen, int destino, LinkedList<Integer> siguientes, boolean[] visitados){
        siguientes.add(origen);
        while(!siguientes.isEmpty()){
            int posicion = siguientes.poll();
            visitados[posicion] = true;
            if(posicion == destino){
                return true;
            }

            for(int vecino : g.getSuccessors(posicion)){
                if(!visitados[vecino]){
                    siguientes.add(vecino);
                }
            }
        }
        return false;
    }
}