package miPrincipal;
public class AppPunto{

    public static void menu(){
        System.out.println("***********************************");
        System.out.println("     OPERACIONES CON PUNTO         ");
        System.out.println("***********************************");
        Punto p1 = new Punto(2,1);
        Punto p2 = new Punto(2,3);
        Punto p3 = new Punto(4,1);
        System.out.println("Punto 1 x="+p1.getX());
        System.out.println("Punto 1 y="+p1.getY());
        System.out.println("Punto 2 x="+p2.getX());
        System.out.println("Punto 2 y="+p2.getY());
        System.out.println("Punto 3 x="+p3.getX());
        System.out.println("Punto 3 y="+p3.getY());

    }
}