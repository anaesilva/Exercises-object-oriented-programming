import entity.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Minha mente e eu";
        livro.autor = "Ana";
        livro.anoLancamento = 2023;

        System.out.println("Nome do livro = " + livro.nome);
    }
}