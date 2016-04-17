package ru.stqa.sandbox;

/**
 * Created by Evolve Computing on 4/16/2016.
 */
public class Point {
  public double x;
  public double y;

  public static double distance(Point p1, Point p2) {
    double dx = p2.x-p1.x;
    double dy = p2.y-p1.y;
    return Math.sqrt(dx*dx+dy*dy);
  }
  public double distance (Point p ){
    double dx = this.x-p.x;
    double dy = this.y-p.y;
    return Math.sqrt(dx*dx+dy*dy);
  }

public Point (double x, double y) {
  this.x = x;
  this.y = y;
}
}
