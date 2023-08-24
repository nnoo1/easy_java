package chapter11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
  public static void main(String[] args) {
    Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");

    Iterator<String> iterator = list.iterator();  //list.iterator ctrl+alt+v
    while (iterator.hasNext()) {
      System.out.print(iterator.next()+"-");
    }
    System.out.println();

    iterator = list.iterator();  //iterator는 1회성이라 한 번 더 만들어 준 다음에 해야함
    while (iterator.hasNext()) {
      System.out.print(iterator.next()+"-");
    }
    System.out.println();

  }
}
