package ru.stqa.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("Valeriy");

    Square s = new Square(5);

    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);

    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    Point p1 = new Point(5, 7);
    Point p2 = new Point(10, 14);
    System.out.println("Дитанция между двумя точками  =  " + Point.distance(p1,p2) );
    System.out.println("Дитанция между двумя точками  =  " + p2.distance(p1) );

  }


  private static void hello(String somebody) {

    System.out.println("Hello, " + somebody + "!");
  }



}