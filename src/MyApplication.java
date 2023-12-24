//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import models.Point;
import models.Shape;

public class MyApplication {
    public MyApplication() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\IdeaProjects\\ASSIGNMENT 1\\src\\source");
        Scanner sc = new Scanner(file);
        ArrayList<Point> pointArrayList = new ArrayList();

        while(sc.hasNextLine()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            pointArrayList.add(new Point(x, y));
        }

        Shape shape = new Shape(pointArrayList);
        System.out.println("Perimeter is: " + shape.Perimeter());
        System.out.println("Average side is: " + shape.AverageSide());
        System.out.println("The Longest side is: " + shape.longSide());
    }
}
