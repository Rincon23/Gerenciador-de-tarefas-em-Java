import java.util.Scanner;

public class Menu {
    public int Menuinterativo() {

    System.out.println("### Menu de opcoes ###");
    System.out.println("1. Inserir ");
    System.out.println("2. Deletar ");
    System.out.println("9. Sair ");

    System.out.println("Digite uma opcao ");
    Scanner scanner = new Scanner(System.in);
    String ops = scanner.nextLine();
    
    int op = Integer.parseInt(ops);

    return op;
    }
}
