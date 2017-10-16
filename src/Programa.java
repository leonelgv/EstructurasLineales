import java.util.*;

public class Programa {
    private List<String> alumnos = new ArrayList<String>();
    private List<Alumnos> listaAlumnos = new ArrayList<Alumnos>();

    public void SumarValores(int n){
        // empty():         Regresa valor booleano true si la pila se encuentra
        //                  vacía.
        // push(item):      Introduce el objeto dentro de la pila.
        // pop():           Remueve el objeto de el tope de la pila
        // peek():          Muestra el objeto del tope de la pila sin extraerlo.
        // search(item):    Regresa un entero con la posición de el objeto
        //                  buscado o regresa un -1 si no se encuentra el objeto.
        Stack pila =new Stack();
        int suma = 0;
        int objeto = 0;
        do {
            pila.push(n%10);
            n = n / 10;
        } while (n>0);
        System.out.println(pila);
        do {
            objeto = (Integer) pila.pop();
            suma = suma + objeto;
        } while (!(pila.empty()));

        System.out.println(suma);
    }

    public void Invertir(int n){
        Queue<Integer> invierte = new LinkedList();
        int invertir = 0;
        do {
            invierte.add(n%10);
            n = n / 10;
        } while (n>0);
        //System.out.println("Cola llena: " + invierte);
        do {
            invertir = (invertir * 10 ) + invierte.poll();
        } while (invierte.peek() != null);
        System.out.println(invertir);
    }

    public void Listas(){
        alumnos.add("Edgar");
        alumnos.add("Ramiro");
        alumnos.add("Jorge");
        alumnos.add("Maria");
        alumnos.add("Pilar");

        System.out.println(alumnos);
        System.out.println("El tamaño de la lista es de: " + alumnos.size());
        System.out.println("El alumno de la lista número 2: " + alumnos.get(1));
        alumnos.remove("Ramiro");
        System.out.println(alumnos);
        for (int a=0;a<alumnos.size(); a++){
            System.out.println("El alumno " + (a+1) + " es: " + alumnos.get(a));
        }

        Iterator i = alumnos.iterator();
        int n=0;
        while(i.hasNext()){
            System.out.println("El alumno " + (n+1) + " es: " + i.next());
            n += 1;
        }
        System.out.println("¿Está en la lista el alumno Juan? " + alumnos.contains("Juan"));
        System.out.println("¿Está en la lista el alumno Jorge? " + alumnos.contains("Jorge"));
        alumnos.set(1,"Jorge Luis");
        System.out.println(alumnos);
        System.out.println(alumnos.subList(1, 3));
        alumnos.clear();
        System.out.println("El tamaño de la lista es de: " + alumnos.size());
        System.out.println("¿La lista está vacia? " + alumnos.isEmpty());
    }

    public void ListaAlumno(){
        listaAlumnos.add(new Alumnos("Edgar","Alejo","Santamaria"));
        listaAlumnos.add(new Alumnos("Ramiro","Rodriguez","Servin"));
        listaAlumnos.add(new Alumnos("Jorge Luis","Dominguez","Mata"));
        listaAlumnos.add(new Alumnos("Maria","Torres","Soto"));
        listaAlumnos.add(new Alumnos("Pilar","Baza","Echeverria"));

        for(int a=0;a<listaAlumnos.size();a++){
            System.out.println(listaAlumnos.get(a).getNombre() + " "
                    + listaAlumnos.get(a).getApellidoPaterno() + " "
                    + listaAlumnos.get(a).getApellidoMaterno());
        }

    }

    public static void main(String[] args) {
        Programa nuevo = new Programa();
        nuevo.ListaAlumno();

    }
}
