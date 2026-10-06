class Calc{
  public int add(int n1,int n2){
    return n1+n2;
  }
}
class AdvCalc extends Calc{
  public int add(int n2){
    return n2;
  }
}

public class mOverride {
  public static void main(String[] args) {
      AdvCalc obj = new AdvCalc();
      System.out.println(obj.add(3,4));
      System.out.println(obj.add(3));
  }
}
