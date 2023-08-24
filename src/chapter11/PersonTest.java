package chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*다음 프로그램과 실행 결과를 참고해 Person 클래스와 테스트 프로그램을 작성하시오.
• Person 클래스는 이름과 나이를 포함하며, 이름과 나이를 반환하도록
toString() 메서드를 오버라이딩한다.
• 객체를 중복 없이 저장하는 HashSet 컬렉션에 Person 객체를 추가한다.
HashSet은 원소의 중복 여부를 hashCode()와 equals() 메서드를 이용해 판단한다.
• 반복자를 사용해 HashSet 컬렉션 원소를 출력한다.
*/

public class PersonTest {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();
    set.add(new Person("김열공", 20));
    set.add(new Person("최고봉", 56));
    set.add(new Person("우등생", 16));
    set.add(new Person("나자바", 35));

    Iterator<Person> iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next() + "");
    }
    System.out.println();

    System.out.println(new Person("나자바", 35).hashCode());
    System.out.println(new Person("나자바", 35).hashCode());


    //동일한 객체 추가해보기
    set.add(new Person("나자바", 35));
    iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next() + " ");
    }
    System.out.println();
  }

}

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int hashCode() {
    return name.hashCode() + age;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (obj != null && obj instanceof Person person) {
      if (this.hashCode() == person.hashCode()) {
        return true;
      }
    }
    return false;
  }
}