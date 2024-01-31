package com.csc205.project1;
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftX(double n) {
        this.x += n;
    }

    public void shiftY(double n) {
        this.y += n;
    }

    public double distance(Point p2) {
        double xDiff = this.x - p2.x;
        double yDiff = this.y - p2.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public void rotate(double angle) {
        double xPrime = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        double yPrime = this.x * Math.sin(angle) + this.y * Math.cos(angle);
        this.x = xPrime;
        this.y = yPrime;
    }

    public String toString() {
        return "Point [x=" + this.x + ", y=" + this.y + "]";
    }
}
/* I used tabnine AI to assist with design and implement
a class Point that representing a Cartesian Plane*/


