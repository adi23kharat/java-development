// class students{
//   public int id;
//   public String name;

//     public students(int id,String name) {
//       this.id = id;
//       this.name = name;
//     }

//     public String toString(){

//       return id+" "+name;

//     }

    


// }

record students(int id,String name) {

  // students(){

  //   this(0," ");
  //   // System.out.println("hi");

  // }
  students(int id , String name){
    if(id == 0)
          throw new IllegalArgumentException("id cannot be 0");
    this.id = id;
    this.name = name;
  }
}

public class RecordEx {
  public static void main(String[] args) {
      students s1 = new students(1, "aditya");
      students s2 = new students(1, "aditya");

      students s3 = new students(0,"name ");

      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);

      System.out.println(s1.equals(s2));

  }
}
