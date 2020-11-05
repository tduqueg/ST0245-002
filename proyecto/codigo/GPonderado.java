

/**
 * Write a description of class GPonderado here.
 * 
 * @author Juan Felipe Ortiz / Tomas Duque Giraldo
 * @version 1
 */
public class GPonderado {
        public float calcularElGiniPonderado(String[][] laMatrizDelNodoDeLaIzquierda, String[][] laMatrizDelNodoDeLaDerecha){
        float elGiniDeLaMatrizDeLaIzquierda = sacarElGiniDeUnaMatriz(laMatrizDelNodoDeLaIzquierda);
        float elGiniDeLaMatrizDeLaDerecha = sacarElGiniDeUnaMatriz(laMatrizDelNodoDeLaDerecha);
        float elGiniPonderado = (elGiniDeLaMatrizDeLaIzquierda*laMatrizDelNodoDeLaIzquierda.length +
                elGiniDeLaMatrizDeLaDerecha*laMatrizDelNodoDeLaDerecha.length) /  (laMatrizDelNodoDeLaIzquierda.length + laMatrizDelNodoDeLaDerecha.length);
        return elGiniPonderado;
    }
}