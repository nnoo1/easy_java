package chapter09;

import java.util.ArrayList;

public class GenericInheritanceDemo {
  public static void main(String[] args) {
    ArrayList<Beer> a1 = new ArrayList<>();
    ArrayList<Boricha> a2 = new ArrayList<>();
    ArrayList<Beverage> a3 = new ArrayList<>();
    a3.add(new Beverage());
    a3.add(new Beer());
    a3.add(new Boricha());
    Beer beaverage = (Beer) a3.get(1);
    System.out.println(beverageTest(a3));

//    beverageTest(a2); 두 ArrayList의 경우 상속관계?없다?


  }

  static boolean beverageTest(ArrayList<Beverage> array) {
    return true;
  }


}
