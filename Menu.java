import java.util.Scanner;

public class Menu {
    public int Menuinterativo() {

    System.out.println("### Menu de opcoes ###");
    System.out.println("1. Inserir ");
    System.out.println("2. Deletar ");
    System.out.println("3. Exibir ");
    System.out.println("9. Sair ");

    System.out.println("\n");

    System.out.println("Digite uma opcao ");
    Scanner scanner = new Scanner(System.in);
    String ops = scanner.nextLine();
    
    System.out.println("\n");

    int op = Integer.parseInt(ops);

    return op;
    }
}
