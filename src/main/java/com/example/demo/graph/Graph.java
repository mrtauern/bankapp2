package com.example.demo.graph;

import java.util.HashMap;
import java.util.Map;

public class Graph<T> {

    public Map<T, Map<T, Integer>> adjencyList = new HashMap<>();

    public void addEdge(Edge<T> edge){
        addEdge(edge.v1, edge.v2, edge.weight);
    }

    private void addEdge(T v1, T v2, int Weight){
        if(adjencyList.containsKey(v1)){
            adjencyList.put(v1, new HashMap<>());
        }
        adjencyList.get(v1).put(v2, Weight);

        if(adjencyList.containsKey(v2)){
            adjencyList.put(v2, new HashMap<>());
        }
        adjencyList.get(v2).put(v1, Weight);
    }
}
