package chapter09;

//오브젝트, eaquals o
public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(3);

    System.out.println(c1);
    System.out.println(c2);

    if (c1.equals(c2)) {
      System.out.println("c1과 c2는 같다");
    }else System.out.println("c1과 c2는 다르다");

  }
}

class Circle {
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

//  //오버로딩으로 하는 방법
//  public boolean equals(Circle circle) {
//    if (this.radius == circle.radius) {
//      return true;
//    }
//    return false;
//  }

  //오버라이딩으로 하는 방법(다운캐스팅)
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Circle circle) {
      if (circle != null && this.radius == circle.radius) {
        return true;
      }
    }
    return false;
  }
}