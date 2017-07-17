package com.example.java;

import java.util.ArrayList;

/**
 * Created by moonh on 2017-07-17.
 */
public class Vertex {

    private int stateNumber;
    private ArrayList<Vertex> adjacencyList;

    public Vertex(int stateNumber) {
        this.stateNumber = stateNumber;
        this.adjacencyList = new ArrayList<>();
    }

    public int getStateNumber() {
        return stateNumber;
    }

    public ArrayList<Vertex> getAdjacencyList() {
        return adjacencyList;
    }

    public boolean isFinal() {
        return stateNumber==100;
    }
}