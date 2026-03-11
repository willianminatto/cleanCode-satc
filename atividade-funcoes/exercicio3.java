public class FilmeService {

    public void listarFilmesDisponiveis() {
        System.out.println("Listando apenas filmes disponíveis para locação...");
    }

    public void listarTodosFilmes() {
        System.out.println("Listando todos os filmes do catálogo...");
    }

    public void marcarFilmeDisponivel(String titulo) {
        System.out.println("O filme \"" + titulo + "\" agora está disponível para locação.");
    }

    public void marcarFilmeIndisponivel(String titulo) {
        System.out.println("O filme \"" + titulo + "\" foi marcado como indisponível.");
    }

    public static void main(String[] args) {
        FilmeService service = new FilmeService();

        service.listarFilmesDisponiveis();
        service.listarTodosFilmes();

        service.marcarFilmeDisponivel("Inception");
        service.marcarFilmeIndisponivel("Matrix");
    }
}