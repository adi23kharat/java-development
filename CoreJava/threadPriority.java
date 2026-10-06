class A implements Runnable{

  public void run(){
    for(int i=0 ; i<5 ; i++){
      System.out.println("hi");
      try {
          Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class B implements Runnable{

  public void run(){
    for(int i=0 ; i<5 ; i++){
      System.out.println("hello");
      try {
          Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class threadPriority {
  public static void main(){
    
    A obj = new A();
    B obj2 = new B();

    Thread t1 = new Thread(obj);
    Thread t2 = new Thread(obj2);

    t1.start();
    // try {
    //     Thread.sleep(1);
    // } catch (InterruptedException e) {
    //   e.printStackTrace();
    // }
    t2.start();


  }
}
