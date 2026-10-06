class Human{
  private int age;
  private String name;

  public void setAge(int age,Human h){
    Human h1 = h;
    h1.age = age;
  }

  public int getAge(){
    return age;
  }
}


class encapsulation{
  public static void main(String[] args) {
    Human h = new Human();
    h.setAge(20,h);
    System.out.println(h.getAge());

  }
}