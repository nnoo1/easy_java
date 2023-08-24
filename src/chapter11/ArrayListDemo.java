package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    //
    List<String> cars = List.of("소나타", "아반테", "스캐퍼", "모닝"); //리스트 만들어주는 공장을 가지고 만듦
    List<String> list = new ArrayList<>(cars);
    Iterator<String> iterator = list.iterator();

    while (iterator.hasNext()) {
      System.out.print(iterator.next()+",");
    }
    System.out.println();

    //add 그냥 하면 맨 뒤
    list.add("소울");

    for (String car : list) {
      System.out.print(car + "-");
    }
    System.out.println();

    //add 자리 지정
    list.add(0, "뉴그랜저");
    System.out.println(list);

    //set
    list.set(5, "제네시스");
    System.out.println(list);


    //remove
    list.remove(5);
    System.out.println(list);
    list.remove(list.get(0));
    System.out.println(list);
    list.remove("아반테");
    System.out.println(list);

    System.out.println(list.size());

  }
}
