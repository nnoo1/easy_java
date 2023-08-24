package chapter11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    q.add("바나나");
    q.add("사과");
    q.add("배");
    System.out.println(q.element());

    while (!q.isEmpty()) {
      System.out.println(q.remove()+"가 삭제 됨");
    }

//    q.remove();  //에러 남. 안나게 하려면 예외처리 필요
//    q.element();  //에러 남. 안나게 하려면 예외처리 필요

  }
}
