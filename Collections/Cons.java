
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

class Cons{
  public static void main(String[] args) {
    
    List<Integer> nums = Arrays.asList(3,4,6,7,4);

    Function<Integer,Integer> fun = n-> n*2;

      // int result = nums.stream()
      //     .filter(n-> n%2==0)
      //     .map(fun)
      //     .reduce(0,(c,e)-> c+e);

      Stream<Integer> s1 = nums.parallelStream()
                            .filter(n->n%2==0)
                            .sorted();

      s1.forEach(n->System.out.println(n));


    
      //  Once you use it you cannot use again

      //
  }
}