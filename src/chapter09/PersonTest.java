package chapter09;

public class PersonTest {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동", "111111");
    Person p2 = new Person("손흥민", "111111");

    if (p1.equals(p2)) {
      System.out.println("c1과 c2는 같다");
    } else System.out.println("c1과 c2는 다르다");

  }

}



class Person {
  String name;
  String id;

  public Person(String name, String id) {
    this.name = name;
    this.id = id;
  }

  public boolean equals(Person person) {
    if (this.id.equals(person.id)) {
      return true;
    }else
      return false;

  }
}