import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PllStream {
  public static void main(String[] args) {
      int size = 10_00_0;
      List<Integer> nums = new ArrayList<>(size);

      Random ran = new Random();

      for(int i=1 ; i<=size ; i++){
        nums.add(ran.nextInt(100));
      }
     
      long startSeq = System.currentTimeMillis();
      int sum = nums.stream()
                .map(n->n*2)
                .mapToInt(i->i)
                .sum();
      long endSeq = System.currentTimeMillis();
                
      
      long startPara = System.currentTimeMillis();
      int sum2 = nums.parallelStream()
                .map(n->n*2)
                .mapToInt(i->i)
                .sum();
      long endPara = System.currentTimeMillis();
      
      System.out.println(sum + " " + sum2);
      System.out.println("Seq Time "+ (endSeq-startSeq));
      System.out.println("Parallel Time "+ (endPara-startPara));
  }
}
