import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Estante {
    ArrayList<String> estante;

    public Estante() {
        this.estante = new ArrayList<String>();
    }

    void registrarLivro(String titulo) {
        this.estante.add(titulo);
    }

    void removerLivro(String titulo) {
        this.estante.remove(titulo);
    }
}

public class GerenciamentoLivro extends Estante {
    public GerenciamentoLivro() {
        this.estante = new ArrayList<String>();
    }

    @Override
    void registrarLivro(String titulo) {
        this.estante.add(titulo);
    }

    @Override
    void removerLivro(String titulo) {
        this.estante.remove(titulo);
    }

    public ArrayList<String> getEstante() {
        return this.estante;
    }

    public void setCadastrarLivro(String titulo) {
        if (!this.estante.contains(titulo)) {
            registrarLivro(titulo);
        } else {
            System.out.println(titulo + ": Esse título já está cadastrado.");
        }
    }

    public void setRemoverLivro(Scanner sc) {
        String titulo;
        System.out.println(this.getEstante());
        System.out.println("Digite o título a ser retirado: ");

        sc.nextLine();
        titulo = sc.nextLine();

        if (this.estante.contains(titulo)) {
            removerLivro(titulo);
            System.out.println(titulo +": Retirado com sucesso");
        }
    }


    public void cadastrarLivro(Scanner sc) {
        int op = 0;
        String titulo;

        System.out.println("Escreva o titulo");
        sc.nextLine();
        titulo = sc.nextLine();

        this.setCadastrarLivro(titulo);

        do {
            System.out.println("1 - Adicionar outro título \t\t 2 - Ver estante  \n9 - Sair ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Escreva o titulo");
                    sc.nextLine();
                    titulo = sc.nextLine();
                    this.setCadastrarLivro(titulo);
                    break;
                case 2:
                    System.out.println(this.getEstante());
                    break;

                default: return;
            }

        } while (op != 9);
    }

}
