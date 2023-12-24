//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package models;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double dist_to(Point next) {
        double deltX = next.x - this.x;
        double deltY = next.y - this.y;
        return Math.sqrt(deltX * deltX + deltY * deltY);
    }
}
