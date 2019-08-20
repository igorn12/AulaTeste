package jogodado;

public class Principal {
    
    public static void main(String[] args) {
        Jogo jogo1 = new Jogo();
        jogo1.inserirJogadores();
        jogo1.inserirAposta();
        jogo1.lancarDado();
        jogo1.mostrarResultado();
        jogo1.mostrarVencedor();
    }
    
   
}
