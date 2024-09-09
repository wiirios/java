package org.william.service;

import java.util.HashMap;

public class BallotBoxService {
    HashMap<String, Integer> candidate = new HashMap<>();

    public void addCandidate() {
        candidate.put("DONALD", 0);
        candidate.put("JOE", 0);
    }

    public void voteCandidate(String nameCandidate) {
        int value = candidate.get(nameCandidate);

        candidate.put(String.valueOf(nameCandidate), value + 1);
    }

    public void getCandidate() {
        candidate.forEach((k , v) -> {
            System.out.println(k + " " + v);
        });
    }
}
