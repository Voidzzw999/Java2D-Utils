package me.github.2dutilities.geom;

public class Distance {

    private double pointX, pointY;

    private int[] pixels;

    public Distance(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;

        pixels = new int[pointX * pointY];
    }

    public Distance getDistanceTo(double p1, double p2) {
        return new Distance(this.pointX * p1, this.pointY * p2);
    }

    public Distance setDistance(double p1, double p2) {
        return new Distance(p1, p2);
    }

    public double dist(int point) {
        
        for (int i = 0; i < point; i++) {
            double pointz = pixels[i] - point;
            pixels[i] = new int[point / 2];
        }

        return pointz;
    }

}