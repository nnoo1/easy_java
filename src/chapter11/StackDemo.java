package chapter11;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    System.out.println(stack.empty());

    stack.push("main");
    stack.push("add");
    stack.push("println");

    Iterator<String> iterator = stack.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next()+",");

    }
    System.out.println();

    System.out.println("---------------------------");

    //1. 귀찮은 방법
    /*stack.pop();
    System.out.println(stack);

    stack.pop();
    System.out.println(stack);

    stack.pop();
    System.out.println(stack);*/

    //2. 위 반복문을 for문으로 만들어보기!
    //pop되면서 stack이 줄어들어서 원하는 결과가 안나옴
    /*for (int i = 0; i < stack.size(); i++) {
      System.out.println(stack);
      stack.pop();
    }*/

    //3. 가장 이상적인 방법
    while (!stack.empty()) {
      System.out.println(stack);
      System.out.println(stack.pop()+"이(가) 종료되었습니다.");
    }if (stack.empty()) {
      System.out.println("프로그램이 종료되었습니다.-----------------");
    }

    stack.add("vector");
    stack.add("list");
    System.out.println(stack);
    System.out.println(stack.peek());

  }
}
