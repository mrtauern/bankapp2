package com.example.demo.service;

import com.example.demo.model.GoldenCow;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<GoldenCow> cows;

    public GoldenCow findCow(String username){
        for (GoldenCow cow : cows) {
            if(cow.getName().equals(username)){
                return cow;
            }
        }
        return null;
    }

    public List<GoldenCow> findCows(String username){
        List<GoldenCow> cowResults = new ArrayList<>();
        for (GoldenCow cow : cows) {
            if(cow.getName().equals(username)){
                cowResults.add(cow);
            }
        }
        return cowResults;
    }

    @PostConstruct  // Java Spring vil kalde denne metode EFTER objektet er blevet instantieret
    private void initDataForTest(){
        cows = new ArrayList<>();
        GoldenCow goldenCow1 = new GoldenCow("Anna", 1, 2);
        GoldenCow goldenCow2 = new GoldenCow("Benny", 2, 24);
        GoldenCow goldenCow3 = new GoldenCow("Charlie", 3, 32);
        GoldenCow goldenCow4 = new GoldenCow("David", 4, 25);
        GoldenCow goldenCow5 = new GoldenCow("David", 5, 35);
        GoldenCow goldenCow6 = new GoldenCow("Anne", 6, 200);
        cows.add(goldenCow1);
        cows.add(goldenCow2);
        cows.add(goldenCow3);
        cows.add(goldenCow4);
        cows.add(goldenCow5);
        cows.add(goldenCow6);

    }
}
