package jogodado;

public class Jogador {
    private String name;
    private int aposta;

    public Jogador(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAposta() {
        return aposta;
    }
    public void setAposta(int aposta) {
        this.aposta = aposta;
    }
}
