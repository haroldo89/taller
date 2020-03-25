

package logica;

public class Calculadora {
    
    private Bola bolita;
    private int w, h;
    
    private float n1, n2;

    public Calculadora() {
        bolita = new Bola();
    }

    public Bola getBolita() {
        return bolita;
    }
        
   
    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }
    
    public float suma(){
        return n1 + n2;
    }
    
    public float dividir() throws DivisionCeroException{
        if(n2 == 0){
            throw new DivisionCeroException("Error! El segundo operador es 0!");
        }else{
            return n1 / n2;
        }
    }
}
