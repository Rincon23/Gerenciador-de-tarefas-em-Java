import java.io.BufferedWriter; //Para usar o scanner
import java.io.FileWriter; //Para Salvar os dados
import java.io.IOException; //Para Salvar os dados
import java.util.Scanner; //Para Salvar os dados

public class Inserir {
    public void Inserindo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o nome da tarefa: ");
        String nome = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Tarefas.txt", true))) {
            writer.write(nome);
            writer.newLine();
        }   catch (IOException e) {
                e.printStackTrace();
            }
                System.out.println("\n");
                System.out.println("Tarefa gravada no arquivo");
    }
}