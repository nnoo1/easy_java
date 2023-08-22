package chapter08;

public class ObjectMethodDemo {
  public static void main(String[] args) {
    Mouse mouse1 = new Mouse("Samsung");
    Mouse mouse2 = new Mouse("Samsung");
    System.out.println("mouse1==mouse2 ? "+(mouse1==mouse2));
    System.out.println("제조사가 같아 ? "+mouse1.equals(mouse2));
    System.out.println(mouse1.name);
    System.out.println(mouse2);

    Keyboard keyboard1 = new Keyboard("Samsung");
    Keyboard keyboard2 = new Keyboard("LG");
    System.out.println("제조사가 같아 ? "+keyboard1.equals(keyboard2));

    Class c = keyboard1.getClass();
    System.out.println(c.getName());
    System.out.println(c.getSimpleName());
    System.out.println(c.getTypeName());
    System.out.println(c.getPackage().getName());
  }
}

class Mouse {
  String name;
  public Mouse(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "제조사가" + name + "인 마우스입니다";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Mouse mouse) {
      if (this.name.equalsIgnoreCase(mouse.name)) {
        return true;
      }
    }return false;
  }
}



class Keyboard {
  String name;

  public Keyboard(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "제조사가" + name + "인 키보드입니다";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Keyboard keyboard){
      if (this.name.equalsIgnoreCase(keyboard.name)) {
        return true;
      }
    }
    return false;
  }
}