import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exibir {
    public void ExibirTarefas() {
        System.out.println("Lista de Tarefas:");

        try (BufferedReader reader = new BufferedReader(new FileReader("Tarefas.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println("- " + linha); // Exibe a tarefa no console
            }
            System.out.println("\n");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo.");
            e.printStackTrace();

        }
    }
}
