package chapter11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    q.offer("바나나");
    q.offer("사과");
    q.offer("배");
    System.out.println(q.peek()); //peek으로 바꾸기

    while (!q.isEmpty()) {
      System.out.println(q.poll()+"가 삭제 됨");  //poll로 바꾸기
    }
    System.out.println(q.peek()); //에러 안남
    System.out.println(q.poll()); //에러 안남

  }
}
