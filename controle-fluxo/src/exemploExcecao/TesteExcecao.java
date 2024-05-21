package exemploExcecao;

public class TesteExcecao {
    public void metodo1() {
        try {
            metodo2();
        } catch (MinhaExcecao e) {
           System.out.println("ERRO: " + e.getMessage());  //irá imprimir "ERRO: Erro ao executar"
        } 
    }

    public void metodo2() throws MinhaExcecao{
        throw new MinhaExcecao("Erro ao executar");
    }
}
