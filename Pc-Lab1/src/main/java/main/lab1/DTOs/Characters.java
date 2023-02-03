package main.lab1.DTOs;

import java.util.ArrayList;

public class Characters {
    private String category;
    private ArrayList<String> characters;
    private int ordering;
    private String nconst;
    private String tconst;

    public String getCategory() {
        return category;
    }

    public ArrayList<String> getCharacters() {
        return characters;
    }

    public int getOrdering() {
        return ordering;
    }

    public String getNconst() {
        return nconst;
    }

    public String getTconst() {
        return tconst;
    }

    @Override
    public String toString() {
        return "Characters{" +
                "category='" + category + '\'' +
                ", characters=" + characters +
                ", ordering=" + ordering +
                ", nconst='" + nconst + '\'' +
                ", tconst='" + tconst + '\'' +
                '}';
    }
}
