package miPrincipal;
public class Conjunto{
    static int M = 20;
    private Object cto[];
    private int cardinal;
    private int capacidad;
    //Operaciones
    public Conjunto(){
        cto = new Object[M];
        cardinal = 0;
        capacidad = M;
    }
    //determinar si el conjunto es vacio
    public boolean esVacio(){
        return cardinal  == 0;
    }
    //buscar si un elemento pertene al conjunti
    public boolean pertenece( Object elemento){
        int k=0;
        boolean encontrado = false;
        while (k<cardinal && !encontrado){
            encontrado = cto[k] == elemento; //Revisar esta linea
            k++;

        }
        return encontrado;
    }
    //añadir un elemento si no esta en el conjunto
    public Conjunto añadir(Object elemento){
        if (!pertenece(elemento)){
            /*
             * verificar su hay posiciones libres
             * 
             */
            if(cardinal == capacidad){
                Object nuevoCto[];
                nuevoCto = new Object[capacidad+M];
                for(int k=0;k<capacidad;k++){
                    nuevoCto[k]=cto[k];
                }
                cto = nuevoCto;
 
            }
            cto[cardinal++]=elemento;
            
        }
    }




}

