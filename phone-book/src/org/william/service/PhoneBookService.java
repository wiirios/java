package org.william.service;
import java.util.HashMap;

public class PhoneBookService {
    HashMap<String, String> person = new HashMap<String, String>();

    public void addPerson(String addName, String addCellphone) {
        person.put(addName, addCellphone);
    }

    public String getPerson() {
                person.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}
