import java.util.ArrayList;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        // Add 3 tasks
        System.out.println("===== ADD TASKS =====");

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Task " + (i + 1) + ": ");

            try {
                BufferedReader input =
                        new BufferedReader(new InputStreamReader(System.in));

                String task = input.readLine();
                tasks.add(task);

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        // Display tasks
        System.out.println();
        System.out.println("===== TASK LIST =====");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        // Save tasks to task.txt
        try {
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("task.txt"));

            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }

            writer.close();

            System.out.println();
            System.out.println("Tasks saved successfully.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Read tasks from file
        System.out.println();
        System.out.println("===== TASKS LOADED FROM FILE =====");

        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader("task.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}