import java.util.Arrays;
import java.util.List;


public class OptionalEx {
  public static void main(String[] args) {
      
    List<String> names = Arrays.asList("Aditya","Mohan","Maddy","Lucky");

    String name = names.stream()
                      .filter(str-> str.contains("M"))
                      .findFirst()
                      .orElse("Not found");
    
    System.out.println(name);
    

  }
}
