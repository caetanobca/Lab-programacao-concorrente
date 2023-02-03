package main.lab1.DTOs;

import java.util.ArrayList;

public class MainActors {
    private String tconst;
    private ArrayList<Characters> actors;

    public String getTconst() {
        return tconst;
    }

    public ArrayList<Characters> getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return "MainActors{" +
                "tconst='" + tconst + '\'' +
                ", actors=" + actors +
                '}';
    }
}

