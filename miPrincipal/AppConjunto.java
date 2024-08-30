package miPrincipal;
public class AppConjunto{
    public static void menu(){
        System.out.println("***********************************");
        System.out.println("     OPERACIONES CON CONJUNTO ");
        System.out.println("***********************************");
        Conjunto A = new Conjunto();
        if (A.esVacio())
           System.out.println("El conjunto A esta vacio");
        System.out.println("El conjunto A tiene "+A.getCardinal());
        //Añadir elementos
        Integer ele = 4;
        A.añadir(ele);
        ele = 7;
        A.añadir(ele);
        ele = 2;
        A.añadir(ele);
        ele = 5;
        A.añadir(ele);
        ele = 7;
        A.añadir(ele);
        System.out.println("El conjunto A tiene "+A.getCardinal()+" elementos");
        //Crear otro conjunto
        Conjunto B = new Conjunto();
        ele = 6;
        B.añadir(ele);
        ele = 3;
        B.añadir(ele);
        ele = 5;
        B.añadir(ele);
        System.out.println("El conjunto B tiene "+B.getCardinal()+" elementos");
        
        





    }
}