import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deletar{
    public void Deletando() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o nome da tarefa que deseja deletar?: ");
        String NomeDeletado = scanner.nextLine();

        List<String> linhas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("Tarefas.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (!linha.contains(NomeDeletado)) {
                    linhas.add(linha);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Tarefas.txt"))) {
            for (String linha : linhas) {
                writer.write(linha);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Tarefa deletada do arquivo");
    }
}