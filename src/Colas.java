import java.util.LinkedList;
import java.util.Queue;

public class Colas {

    
    public static void main(String[] args) {
        /*Creamos la Cola Indicando el tipo de dato*/
        Queue<Integer> cola=new LinkedList();
        /*Insertamos datos*/
        cola.offer(3);
        cola.add(14);
        cola.offer(12);
        cola.add(7);
        cola.offer(10);
        /*Impresion de la Cola llena con los datos*/
        System.out.println("Cola llena: " + cola);
        /*Estructura repetitiva para desencolar*/
        while(cola.poll()!=null){//Desencolamos y el valor se compara con null
            System.out.println(cola.peek());//Muestra el nuevo Frente
        }
        /*Muestra null debido a que la cola ya esta vacia*/
        System.out.println(cola.peek());
    }
}
