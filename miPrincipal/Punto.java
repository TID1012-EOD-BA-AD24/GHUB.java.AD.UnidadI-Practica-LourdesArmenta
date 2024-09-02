package miPrincipal;
public class Punto {
    private int x,y,z;
    String dimension;
    public Punto(int coorx,int coory){
        this.x=coorx;
        this.y=coory;
    }
    public Punto(int coorx,int coory,int coorz){
        this.x = coorx;
        this.y = coory;
        this.z = coorz;
    }
    public Punto() {
        this.x = 0;
        this.y = 0;
    }
    public int getX(){
        return x;
    }
    public int getY() {
        return y;
    
    }
    public int getZ() {
        return z;
    
    }
    public String getDimension() {
        return dimension;
    
    }
    public void setX(int valor){
        this.x = valor;
    }
    
    public void setY(int valor)
    {
        this.y = valor;
    }
    public void setZ(int valor)
    {
        this.z = valor;
    }
    public void setDimension(String valor){
         this.dimension = valor;
    }
}
   