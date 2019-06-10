package com.example.demo.controller;


import com.example.demo.graph.Graph;
import com.example.demo.graph.GraphResponseBody;
import com.example.demo.graph.GraphService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphController {

    @Autowired
    GraphService graphService;

    @PostMapping("/api/graph")
    public ResponseEntity<?> getGraph(){
        GraphResponseBody graphResponseBody = new GraphResponseBody();
        graphResponseBody.setVertices(graphService.vertices);
        graphResponseBody.setEdges(graphService.edges);
        graphResponseBody.setMsg("success");


        return ResponseEntity.ok(graphResponseBody);
    }
}
