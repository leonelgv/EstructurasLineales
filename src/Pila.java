public class Pila {
    int pila1[]=new int[4];
    int tope=-1;

    public int push(int n){
        if(tope>=pila1.length-1){
            System.out.println("la pila está llena");
        }else
        {
            tope+=1;
            pila1[tope]=n;
        }
        return tope;
    }

    public int pop(){
        if(tope==-1){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("Se elimino un elemento de la pila");
            pila1[tope]=0;
            tope=-1;
        }
        return tope;
    }

    public void ver(){
        for(int tope=3;tope>=0;tope--){
            System.out.println("Datos de la pila: "+pila1[tope]);
        }
    }
}
