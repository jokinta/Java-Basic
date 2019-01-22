package files_read_and_write;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Jokinta\\IdeaProjects\\Thread\\src\\files_read_and_write\\Document"));
        BufferedWriter buffer = new BufferedWriter(new FileWriter("C:\\Users\\Jokinta\\IdeaProjects\\Thread\\src\\files_read_and_write\\Document", true));
        PrintWriter writer = new PrintWriter(buffer);
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            String[] parts = currentLine.split(" ");
            System.out.println(parts[0]);
            System.out.println(parts[1]);
            System.out.println(parts[2]);
            writer.println("Ivan Stoimenov 123217001");
            writer.close();

        }
    }
}
