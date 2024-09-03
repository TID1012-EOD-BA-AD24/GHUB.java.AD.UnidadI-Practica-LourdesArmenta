package miPrincipal;
import java.util.Scanner;

public class Principal {
    public String getGreeting() {
        return "Hola Mundo!";
    }

    public static void main(String[] args) throws PosicionIlegalException {
        //System.out.println(new Principal().getGreeting());
        Scanner consola = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("***********************************");
            System.out.println(" MENU DE TIPOS DE DATOS ABSTRACTOS ");
            System.out.println("***********************************");
            System.out.println(" 1) Rational");
            System.out.println(" 2) Matriz");
            System.out.println(" 3) Conjunto");
            System.out.println(" 4) Persona");
            System.out.println(" 5) Fecha");
            System.out.println(" 6) Cadena");
            System.out.println(" 7) Numerote");
            System.out.println(" 8) Cuenta Cheque");
            System.out.println(" 9) Punto");
            System.out.println("10) Triangulo");
            System.out.println("11) Poligono");
            System.out.println();
            System.out.println(" 0) SALIR");
            System.out.print("Seleccione Opcion:");
            opc= consola.nextInt();
            switch (opc) {
                case 1:
                   AppRational.menu();
                   break;
                case 2:
                case 3:
                   AppConjunto.menu();
                   break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                   AppPunto.menu();
                   break;
                case 10:
                case 11:
                case 0:
                   System.out.println("Hasta Luego");
                   consola.close();
                   break;
                default:
                    System.out.println("Opcion incorrecta, intente de nuevo");
            }
        }while (opc !=0);
    }
}