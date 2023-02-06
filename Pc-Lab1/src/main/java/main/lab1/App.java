package main.lab1;

import main.lab1.DTOs.Actor;
import main.lab1.DTOs.Movie;
import main.lab1.DTOs.MainActors;
import main.lab1.utils.Utils;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Semaphore;

public class App {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime();
        String path = "../data/actors.txt";
        int size = 1000;

        Actor actor = Utils.requestActors("http://150.165.15.104:8002/actor/nm1179580");
        System.out.println(actor);

        Movie movie = Utils.requestMovie("http://150.165.15.104:8002/title/tt7825208");
        System.out.println(movie);

        MainActors mainActors  = Utils.requestMainActors("http://150.165.15.104:8002/main_actors/tt7825208");
        System.out.println(mainActors);


        // try {
        //     Utils.csvWriter(actorsRatting, "result.csv");
        // } catch (IOException e) {
        //     throw new RuntimeException(e);
        // }
        System.out.println("\n--------------------------------------------------" +
                "\nTotal execution time in millis: " + ((System.nanoTime() - startTime)/1000000));
    }
}

