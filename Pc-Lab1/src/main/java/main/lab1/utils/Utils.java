package main.lab1.utils;

import com.google.gson.Gson;
import main.lab1.DTOs.Actor;
import main.lab1.DTOs.MainActors;
import main.lab1.DTOs.Movie;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {
    public static MainActors requestMainActors(String link){
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(new URI(link)).build();
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            MainActors mainActors = gson.fromJson(response.body(), MainActors.class);

            return mainActors;
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }catch (Exception e){
            return new MainActors();
        }
    }

    public static Movie requestMovie(String link){
        HttpResponse<String> response =null;
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(new URI(link)).build();
            HttpClient httpClient = HttpClient.newHttpClient();
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            Movie movie = gson.fromJson(response.body(), Movie.class);
            return movie;
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }catch (Exception e){
            return new Movie();
        }
    }

    public static Actor requestActors(String link){
        HttpResponse<String> response =null;
        try {
            HttpRequest request = HttpRequest.newBuilder().uri(new URI(link)).build();
            HttpClient httpClient = HttpClient.newHttpClient();
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            Actor actor = gson.fromJson(response.body(), Actor.class);
            return actor;
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }catch (Exception e){
            return new Actor();
        }
    }

    public static ArrayList<String> readFile(String path, int size){
        String line = "";
        String splitBy = "\t";
        List<String> titles = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null && size > 0) {
                titles.add(line.substring(1, line.length() -1));
                size--;
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return (ArrayList<String>) titles;
    }


    public static void csvWriter(HashMap<String, Float> map, String path) throws IOException {
        String eol = System.getProperty("line.separator");

        try (Writer writer = new FileWriter(path)) {
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                writer.append(entry.getKey())
                        .append(',')
                        .append(entry.getValue().toString())
                        .append(eol);
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }
}
