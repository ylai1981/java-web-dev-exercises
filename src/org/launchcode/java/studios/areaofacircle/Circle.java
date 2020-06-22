package org.launchcode.java.studios.areaofacircle;

public class Circle {
    public static Double getArea(Double radius) {
        double area;

        area = Math.PI * Math.pow(radius,2);
        return area;
    }
}
