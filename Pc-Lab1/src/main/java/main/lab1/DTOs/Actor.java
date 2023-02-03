package main.lab1.DTOs;

public class Actor {

    private String knownForTitles;
    private String ncosnt;
    private String primaryName;

    private float rating;

    public String getKnownForTitles() {
        return knownForTitles;
    }

    public String getNcosnt() {
        return ncosnt;
    }

    public String getPrimaryName() {
        return primaryName;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float ratting) {
        this.rating = ratting;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "knownForTitles='" + knownForTitles + '\'' +
                ", ncosnt='" + ncosnt + '\'' +
                ", primaryName='" + primaryName + '\'' +
                '}';
    }
}
