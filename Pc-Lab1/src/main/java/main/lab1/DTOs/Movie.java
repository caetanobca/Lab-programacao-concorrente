package main.lab1.DTOs;

import java.util.ArrayList;

public class Movie {
    private String tconst;
    private String startYear;
    private String runtimeMinutes;
    private String primaryTitle;
    private int numVotes;
    private String genres;
    private float averageRating;

    @Override
    public String toString() {
        return "Movie{" +
                "tconst='" + tconst + '\'' +
                ", startYear='" + startYear + '\'' +
                ", runtimeMinutes='" + runtimeMinutes + '\'' +
                ", primaryTitle='" + primaryTitle + '\'' +
                ", numVotes=" + numVotes +
                ", genres='" + genres + '\'' +
                ", averageRating=" + averageRating +
                '}';
    }

    public String getTconst() {
        return tconst;
    }

    public String getStartYear() {
        return startYear;
    }

    public String getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public int getNumVotes() {
        return numVotes;
    }

    public String getGenres() {
        return genres;
    }

    public float getAverageRating() {
        return averageRating;
    }
}
