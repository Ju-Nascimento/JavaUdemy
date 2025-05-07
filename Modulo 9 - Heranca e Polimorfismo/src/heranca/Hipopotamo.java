package heranca;

public class Hipopotamo extends Animal{
    private int forcaMordida;

    public void setForcaMordida (int forcaMordida){
        this.forcaMordida = forcaMordida;
    }
    public int getForcaMordida(){
        return forcaMordida;
    }
    public void entrarNaAgua(){
        System.out.println("Se refrescando...");
    }
}
