package heranca;

public class Main {
    public static void main(String[] args) {

        Panda panda = new Panda();

        panda.setNome("Dragão Guerreiro");
        panda.setIdade(15);
        panda.subirArvore();

        panda.dados();

        Hipopotamo motomoto = new Hipopotamo();
        motomoto.setNome("MotoMoto");
        motomoto.setIdade(18);
        motomoto.entrarNaAgua();
        
        motomoto.dados();

    }
}
