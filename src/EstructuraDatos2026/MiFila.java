
package EstructuraDatos2026;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author alumnog
 */
public class MiFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // cola oxxo instanciada e inicializada
       Queue<String> colaOxxo = new LinkedList<>();
       
       // offer: aqregar un elemento a la cola
       colaOxxo.offer("Maria");
       colaOxxo.offer("Pepe");
       colaOxxo.offer("Juan");
       colaOxxo.offer("Ana");
       colaOxxo.offer("Carlos");
       
       // peek: muestra el siguiente en la cola
       System.out.println("Siguiente: ");
       System.out.println(colaOxxo.peek());
       
       // poll: saca a el siguiente en la cola
       System.out.println("Atendido: ");
       System.out.println(colaOxxo.poll());
       
       // size: cantidad de elementos en la cola
       System.out.println("\nQuedan: " + colaOxxo.size());
       
       // isEmpty: verifica si la cola esta vacia
       System.out.println("\nEsta vacia? " + colaOxxo.isEmpty());
       System.out.println(colaOxxo);
    }
    
}
