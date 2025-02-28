import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int op = 0;
        Scanner scanner = new Scanner(System.in);

        while (op != 9) {
            
            Menu menu = new Menu();
            op = menu.Menuinterativo();

            switch (op) {
                case 1:
                Inserir inserir = new Inserir();
                inserir.Inserindo();
                    break;
                case 2:
                Deletar deletar = new Deletar();
                deletar.Deletando();
                    break;
            }
        }
        scanner.close();
    }
}

