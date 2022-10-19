package com.solid.Isp;
// 63010022 Glit Rungrojkijkul
public class Square extends Shape {

    private int side;
    Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide(){
        return side;
    }

    @Override
    public int getArea(){
        return side * side;
    }
}
