package org.william.service;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class PhoneBookService {
    HashMap<String, String> person = new HashMap<String, String>();
    Path path = Paths.get("src/org/william/contacts", "contacts.txt");

    // public void addPerson(String addName, String addCellphone) {
    //     person.put(addName, addCellphone);
    // }

    // public String getPerson() {
    //             person.forEach((k, v) -> {
    //         System.out.println(k + " " + v);
    //     });
    // }

    public void writeTxt() throws IOException {
        try (FileWriter fileWriter = new FileWriter(String.valueOf(path))) {
            for (Map.Entry<String, String> entry : person.entrySet()) {
                fileWriter.write(entry.getKey() + " " + entry.getValue() +"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
