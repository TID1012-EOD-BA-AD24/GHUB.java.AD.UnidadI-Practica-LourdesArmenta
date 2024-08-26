package miPrincipal;
public class Rational{
    private int r[] = new int[2];

    public Rational(){
        this.r[0] = 1;
        this.r[1] = 1;
    }

    public Rational(int[] r) {
        this.r = r;
    }

    public int getNumerador(){
        return r[0];
    }

    public int getDenominador(){
        return r[1];
    }

    public void setNumerador(int a){
        r[0] = a;
    }

    public void setDenominador(int b){
        r[1]=b;
    }
    
    public Rational add(Rational a, Rational b){
        Rational x = new Rational();
        x.setNumerador(a.getDenominador()* b.getNumerador() + b.getDenominador() * b.getNumerador());
        x.setDenominador(a.getDenominador()*b.getDenominador());
        return x;
                   
    }

    

    
    
    

   
    



}