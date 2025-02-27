import java.io.BufferedWriter; //Para usar o scanner
import java.io.FileWriter; //Para Salvar os dados
import java.io.IOException; //Para Salvar os dados
import java.util.Scanner; //Para Salvar os dados

public class Inserir {
    public void inserindo() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o nome da tarefa: ");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome);

        scanner.close();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Tarefas.txt"))) {
            writer.write("Nome da tarefa adicionada: " + nome);
            writer.newLine();
        }   catch (IOException e) {
                e.printStackTrace();
            }
                System.out.println("Tarefa gravada no arquivo");
    }
}