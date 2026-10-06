class Human{
  static String name;
  int no;
  static {
      name = "MAdan";
      System.out.println("in Static "+name);
  }
}

public class staticss {
  public static void main(String[] args) throws ClassNotFoundException{
      Class.forName("Human");
  }
}
