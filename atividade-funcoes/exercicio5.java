public class Jogo {
    private int vidaJogador;
    private int vidaInimigo;

    public Jogo(int vidaJogador, int vidaInimigo) {
        this.vidaJogador = vidaJogador;
        this.vidaInimigo = vidaInimigo;
    }

    private int atacar(int vidaAtual, int dano, String nome) {
        vidaAtual -= dano;

        if (vidaAtual <= 0) {
            System.out.println(nome + " perdeu!");
            return 0;
        } else {
            System.out.println("Vida do " + nome + ": " + vidaAtual);
            return vidaAtual;
        }
    }

    public void atacarJogador(int dano) {
        vidaJogador = atacar(vidaJogador, dano, "Jogador");
    }

    public void atacarInimigo(int dano) {
        vidaInimigo = atacar(vidaInimigo, dano, "Inimigo");
    }

    public int getVidaJogador() {
        return vidaJogador;
    }

    public int getVidaInimigo() {
        return vidaInimigo;
    }
}