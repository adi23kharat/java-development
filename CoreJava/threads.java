class A extends Thread
{
  public void run(){
    for(int i=0 ; i<10 ; i++){
      System.out.println("hi");
    }
  }
}

class B extends Thread{
  public void run(){
    for(int i=0 ; i<10 ; i++){

      System.out.println("Hello");
    }
  }
}



class threads{
   public static void main(String[] args) {
    A obj = new A();
    B obj2 = new B();

    obj.start();
    obj2.start();

  }
}