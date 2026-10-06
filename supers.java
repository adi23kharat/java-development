class A{
  A(){
    System.out.println("In A");
  }
  A(int n){
    System.out.println("In A int");
  }
}
class B extends A{
  B(){
    super(3);
    System.out.println("In B");
  }
  B(int n){
   
    this();
    System.out.println("In B int");
  }
}

class supers {
  public static void main(String[] args) {
      B obj = new B(5);

  }
}
