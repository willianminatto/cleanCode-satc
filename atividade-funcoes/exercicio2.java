class EstatisticasTime {
    String nome;
    int gols;
    int posseBola;
    int chutes;
    int faltas;
    int cartoesAmarelos;
    int cartoesVermelhos;

    public EstatisticasTime(String nome, int gols, int posseBola, int chutes, int faltas, int cartoesAmarelos, int cartoesVermelhos) {
        this.nome = nome;
        this.gols = gols;
        this.posseBola = posseBola;
        this.chutes = chutes;
        this.faltas = faltas;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartoesVermelhos = cartoesVermelhos;
    }
}

class Partida {
    EstatisticasTime casa;
    EstatisticasTime visitante;

    public Partida(EstatisticasTime casa, EstatisticasTime visitante) {
        this.casa = casa;
        this.visitante = visitante;
    }
}

public class GerenciadorPartida {

    public void registrarPartida(Partida partida) {
        System.out.println("Partida Registrada:");
        System.out.println(partida.casa.nome + " " + partida.casa.gols + " x " + partida.visitante.gols + " " + partida.visitante.nome);
        System.out.println("Posse de Bola: " + partida.casa.posseBola + "% - " + partida.visitante.posseBola + "%");
        System.out.println("Chutes: " + partida.casa.chutes + " - " + partida.visitante.chutes);
        System.out.println("Faltas: " + partida.casa.faltas + " - " + partida.visitante.faltas);
        System.out.println("Cartões Amarelos: " + partida.casa.cartoesAmarelos + " - " + partida.visitante.cartoesAmarelos);
        System.out.println("Cartões Vermelhos: " + partida.casa.cartoesVermelhos + " - " + partida.visitante.cartoesVermelhos);
    }

    public void gerarRelatorio(Partida partida) {
        String vencedor = partida.casa.gols > partida.visitante.gols
                ? partida.casa.nome
                : (partida.casa.gols < partida.visitante.gols ? partida.visitante.nome : "Empate");

        System.out.println("=== Relatório da Partida ===");
        System.out.println("Vencedor: " + vencedor);
        System.out.println("Posse de Bola: " + partida.casa.posseBola + "% - " + partida.visitante.posseBola + "%");
        System.out.println("Total de Chutes: " + (partida.casa.chutes + partida.visitante.chutes));
        System.out.println("Total de Faltas: " + (partida.casa.faltas + partida.visitante.faltas));
        System.out.println("Total de Cartões: " + (
                partida.casa.cartoesAmarelos + partida.visitante.cartoesAmarelos +
                partida.casa.cartoesVermelhos + partida.visitante.cartoesVermelhos
        ));
    }

    public static void main(String[] args) {
        EstatisticasTime casa = new EstatisticasTime("Time A", 2, 55, 10, 15, 3, 1);
        EstatisticasTime visitante = new EstatisticasTime("Time B", 1, 45, 8, 12, 2, 0);

        Partida partida = new Partida(casa, visitante);

        GerenciadorPartida gerenciador = new GerenciadorPartida();
        gerenciador.registrarPartida(partida);
        gerenciador.gerarRelatorio(partida);
    }
}