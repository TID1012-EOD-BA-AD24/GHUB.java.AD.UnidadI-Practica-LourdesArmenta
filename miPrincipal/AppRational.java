package miPrincipal;
public class AppRational{
    public static void menu() throws PosicionIlegalException{
        System.out.println("***********************************");
        System.out.println(" OPERACIONES CON NUMERO RACIONALES ");
        System.out.println("***********************************");
        Rational r1 = new Rational(5,4);
        Rational r2 = new Rational(2,3);
        Rational r = new Rational();
        r = r1.add(r1, r2);
        System.out.println("El resultado de la suma = "+r);
        Rational r4 = new Rational();
        r4 = r1.mult(r1, r2);
        System.out.println("El resultado de la multiplicacion = "+r4);
        Rational r3 = new Rational(7,3);
        System.out.println("El resultado de la comparacion es "+r.equal(r3, r));

        System.out.println();

        //Rational r5 = new Rational(2,0); // No es posible un racional con denominador
        Rational r5 = new Rational(2,3);
        Rational r6 = new Rational(3,2); // cero
        System.out.println("Racional r5="+r5);
        System.out.println("El resultado de la suma de r5+r6 = "+r5.add(r5,r6));
        System.out.println("El resultado de la mult de r5*r6 = "+r5.mult(r5,r6));
    }
}