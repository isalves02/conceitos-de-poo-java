import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        GerenciamentoLivro gerenciamentoLivro = new GerenciamentoLivro();

        do {
            System.out.println("######### Gerenciador de Biblioteca ##############");
            System.out.println("Digite uma opção");
            System.out.println("1 - Listar titulos \t\t 2- Adicionar titulo \n3 - Retirar livro \t\t 9 - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println(gerenciamentoLivro.getEstante());
                    break;
                case 2:
                    gerenciamentoLivro.cadastrarLivro(sc);
                    break;
                case 3:
                    gerenciamentoLivro.setRemoverLivro(sc);
                    break;
                default:
                    System.out.println("Sistema finalizado!");
                    return;
            }

        } while (op!=9);

    }

}