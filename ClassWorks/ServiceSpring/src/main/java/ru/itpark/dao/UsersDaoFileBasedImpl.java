package ru.itpark.dao;

import ru.itpark.generators.IdGenerator;
import ru.itpark.models.User;

import java.io.*;
import java.util.LinkedList;

public class UsersDaoFileBasedImpl implements UsersDao {

    private String fileName;
    private IdGenerator idGenerator;

    public UsersDaoFileBasedImpl(String fileName, IdGenerator idGenerator) {
        this.fileName = fileName;
        this.idGenerator = idGenerator;
    }

    public int save(User model) {
        int newId = idGenerator.nextId();
        model.setId(newId);

        String modelAsString = model.toString();

        try {
            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter(fileName, true));

            writer.write(modelAsString);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        return newId;
    }

    public User find(int id) {
        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String currentHumanAsString = reader.readLine();

            while (currentHumanAsString != null) {
                String currentHumanAsStringArray[]
                        = currentHumanAsString.split(" ");

                int humanId
                        = Integer.parseInt(currentHumanAsStringArray[0]);

                if (humanId == id) {
                    User foundedHuman = new User(
                            humanId,
                            currentHumanAsStringArray[1],
                            Integer.parseInt(currentHumanAsStringArray[2])
                    );
                    reader.close();
                    return foundedHuman;
                }

                currentHumanAsString = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

        return null;
    }

    public void update(User model) {

    }

    public void delete(int id) {

    }

    public LinkedList<User> findAll() {
        return null;
    }
}
