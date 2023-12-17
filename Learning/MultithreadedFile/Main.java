package Learning.MultithreadedFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Adder extends Thread {
    private String inFile, outFile;

    public Adder(String inFile, String outFile) {
        this.inFile = inFile;
        this.outFile = outFile;
    }

    public void run() {
        try {
            int total = 0;
            String line = null;

            try (BufferedReader reader = Files.newBufferedReader(Paths.get(inFile))) {
                while ((line = reader.readLine()) != null)
                    total += Integer.parseInt(line);
            }

            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outFile))) {
                writer.write("Total: " + total);
            }
        } catch (IOException e) {
            // Handle IOException (e.g., print an error message)
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String[] inFiles = {
        "Learning\\MultithreadedFile\\file1.txt",
         "Learning\\MultithreadedFile\\file2.txt",
          "Learning\\MultithreadedFile\\file3.txt",
           "Learning\\MultithreadedFile\\file4.txt", 
           "Learning\\MultithreadedFile\\file5.txt",
            "Learning\\MultithreadedFile\\file6.txt"};
        String[] outFiles = {
            "Learning\\MultithreadedFile\\file1.out.txt",
             "Learning\\MultithreadedFile\\file2.out.txt",
              "Learning\\MultithreadedFile\\file3.out.txt",
               "Learning\\MultithreadedFile\\file4.out.txt",
                "Learning\\MultithreadedFile\\file5.out.txt",
                 "Learning\\MultithreadedFile\\file6.out.txt"};

        for (int i = 0; i < inFiles.length; i++) {
            Adder adder = new Adder(inFiles[i], outFiles[i]);
            adder.start();
        }
    }
}