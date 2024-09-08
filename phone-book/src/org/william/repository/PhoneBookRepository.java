package org.william.repository;

import org.william.service.PhoneBookService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;

public class PhoneBookRepository{
    Path path = Paths.get("src/org/william/contacts", "contacts.txt");
    PhoneBookService phoneBookService = new PhoneBookService();

    public void createFile() throws IOException {
        try {
            Files.createFile(path);
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exist");
        }
    }

    public void writeFile() throws IOException {
        try (FileWriter fileWriter = new FileWriter(String.valueOf(path))) {
            fileWriter.write(String.valueOf(phoneBookService.getPerson()));
            System.out.println("Success");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
