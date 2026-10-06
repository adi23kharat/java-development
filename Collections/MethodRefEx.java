
class students{
  private int age;
  private String name;
  public students( String name) {
    
    this.name = name;
  }
  @Override 
  public String toString(){
    return name+" " +age;
  }

  
}

public class MethodRefEx {
  public static void main(String[] args) {
      
    // List<String> names = Arrays.asList("Adi","Mohan","Gauro","Mike");

    // List<students> studs = new ArrayList<>();

    // for(String name : names){
    //   studs.add(new students(0, name));
    // }

    // studs = names.stream()
    //         .map(n-> new students(5,n))
    //         .toList();

    //  studs = names.stream()
    //           .map(students :: new)
    //           .toList();

    // studs.forEach(n->System.out.println(n));
    int i=0;
    var y=8;

    var obj = new students("hj");
    System.out.println(obj);
    
    
  }
}
