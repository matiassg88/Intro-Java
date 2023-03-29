
package modelador;

/**
 *
 * @author Aldana Hereñu
 */
public class Rectangulo {
    private int base;
    private int altura;

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    
    
    
    public Rectangulo(){
    
}
    
    public int calcuSup(){
        return base*altura;
    }
    public int calcuPer(){
        return (base+altura)*2;
    }
    public void modelRect(){
         for(int i=0;i<altura;i++)
        {  
            for(int j=0;j<base;j++){
                if(i==0||i==(altura-1)||j==0||j==(base-1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
  
}
