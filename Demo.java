class A{
  public int mark;
  public String toString(){
   return "hello world";
  }
  public boolean equals(A obj){
    return this.mark == obj.mark ? true: false;
  }

}
class Demo {
  public static void main(String args[]){

    A obj = new A();
    obj.mark = 30;

    A obj1 = new A();
    obj1.mark = 30;
    boolean s = obj1.equals(obj);
    System.out.println(s);
  }

}
