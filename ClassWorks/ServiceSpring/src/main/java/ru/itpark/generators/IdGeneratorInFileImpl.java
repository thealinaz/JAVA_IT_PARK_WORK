package ru.itpark.generators;

import java.io.*;

public class IdGeneratorInFileImpl implements IdGenerator {

    private int lastGeneratedId;
    private String fileName;

    public IdGeneratorInFileImpl(String fileName) {
        this.fileName = fileName;

        try {
            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(fileName));
            String lastGeneratedIdFromFile = reader.readLine();
            lastGeneratedId = Integer.parseInt(lastGeneratedIdFromFile);
            reader.close();
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public int nextId() {
        lastGeneratedId = lastGeneratedId + 1;

        try {
            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter(fileName));
            writer.write(lastGeneratedId + "");
            writer.close();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        return lastGeneratedId;
    }
}
