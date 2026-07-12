package com.wipro.automobile.ship;

public class Compartment {
    int height;
    int width;
    int breadth;
    
    public Compartment(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }
    
    public String toString() {
        return "Height: " + height + " Width: " + width + " Breadth: " + breadth;
    }
}