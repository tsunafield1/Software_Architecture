package com.solid.Isp;
// 63010022 Glit Rungrojkijkul
public class Shape {
    private int width;
    private int height;
    
    Shape() {
    }

    Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public int getArea()
    {
        return width * height;
    }
}
