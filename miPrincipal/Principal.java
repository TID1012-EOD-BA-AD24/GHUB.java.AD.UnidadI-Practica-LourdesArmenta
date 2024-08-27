package miPrincipal;

public class Principal {
    public String getGreeting() {
        return "Hola Mundo!";
    }

    public static void main(String[] args) {
        //System.out.println(new Principal().getGreeting());
        Rational r1 = new Rational(5,3);
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



    }
}