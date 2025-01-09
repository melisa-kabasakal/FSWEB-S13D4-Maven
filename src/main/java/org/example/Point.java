package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public double distance(){
        return Math.sqrt((x * x) + (y * y));
    }
    public double distance(Point p){
        int distanceX = p.x - this.x;
        int distanceY = p.y - this.y;
        return  Math.sqrt((distanceX * distanceX) + (distanceY * distanceY));
    }

    public double distance(int a, int b){
        int distanceX = a - this.x;
        int distanceY = b-this.y;

        return  Math.sqrt((distanceX * distanceX) + (distanceY * distanceY));
    }
}
