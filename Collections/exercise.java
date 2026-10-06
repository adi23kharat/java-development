import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class students implements Comparable<students>{
  int age;
  String name;

    public students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
       return "students [age=" +age+", name="+name+"]";
    }

    @Override 
    public int compareTo(students that){
      if(this.age > that.age)
          return 1;
      else
        return -1;
    }



}


public class exercise {
  public static void main(String[] args) {

      Comparator<students> com = (i,j) ->  i.name.length() >j.name.length() ? 1:-1; 
      
      List<students> studs = new ArrayList<>();
      studs.add(new students(21, "Adi"));
      studs.add(new students(23, "Mohit"));
      studs.add(new students(30, "Abhinanadan"));
      studs.add(new students(25, "Shradhha"));

      Collections.sort(studs,com);

      for(students s: studs ){
        System.out.println(s);
      }
      


  }
}
