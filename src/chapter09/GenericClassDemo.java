package chapter09;

import java.util.ArrayList;

public class GenericClassDemo {
  public static void main(String[] args) {

    //제너릭 타입 : 선언할 때 타입결정하지 않고, 사용할 때 타입을 결정하는 타입
    ArrayList<Boricha> arrayListBoricha = new ArrayList<>();
    arrayListBoricha.add(new Boricha());
//    arrayListBoricha.add(new Beer()); //보리차만 담을 수 있다고 미리 걸러줌(에러)
    ArrayList<Beer> arrayListBeer = new ArrayList<>();
    arrayListBeer.add(new Beer());
//    arrayListBeer.add(new Boricha()); //비어만 담을 수 있음



    Cup c = new Cup();  //raw타입 제너릭이  소용없음 ?37처럼 해야한다?
    c.setBeverage(new Boricha());
    if (c.getBeverage() instanceof Boricha) {
      Boricha boricha = (Boricha) c.getBeverage();
    } else if (c.getBeverage() instanceof Beer) {
      Beer beer = (Beer) c.getBeverage();
    }

    c.setBeverage(new Beer());
//    Beer beer = (Beer) c.getBeverage();
    Boricha bori = (Boricha) c.getBeverage();
    bori.drink();

    c.setBeverage(new Beverage());
    Beer bev = (Beer)c.getBeverage(); //타입한정 후 추가
//    c.setBeverage(new Object());  //error 51에 extends Beverage추가해서(타입한정?)
//    beer = (Beer) c.getBeverage();


    Cup<Boricha> borichaCup = new Cup();
    borichaCup.setBeverage(new Boricha());
    Boricha beverage = borichaCup.getBeverage();  //ctrl alt v

    Cup<Beer> beerCup = new Cup<>();
    beerCup.setBeverage(new Beer());
//    beer = beerCup.getBeverage(); //????????????머지 멀 어떻게 해야하지

  }
}


class Beverage {}

class Boricha extends Beverage {
  void drink() {
    System.out.println("어린아이만 마실 수 있다.");
  }
}

class Beer extends Beverage{
  void cheers() {
    System.out.println("어른만 마실 수 있다");
  }
}

class Cup<T extends Beverage> { //타입한정 추가 extends Beverage
    private T beverage;

    public T getBeverage() {
      return beverage;
    }
    public void setBeverage(T beverage) {
      this.beverage = beverage;
    }
  }


