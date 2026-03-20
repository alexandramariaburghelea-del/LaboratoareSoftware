package lab3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("in.txt");
            List<String> lines = Files.readAllLines(path);
            List<String> rezultat = new ArrayList<>();

            System.out.println(" a)");
            for (String line : lines) {
                String mod = line + "\n";
                System.out.print(mod);
                rezultat.add(mod);
            }
            for (String line : lines) {
                String mod = line.replace(".", ".\n");
                System.out.println(mod);
                rezultat.add(mod);
            }
            Path outPath = Paths.get("out.txt");
            Files.write(outPath, rezultat);

            System.out.println("\nFisierul out.txt a fost scris!");

        }catch (IOException e) {
        e.printStackTrace();
    }

    }
}
