package assign3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import org.apache.commons.lang3.tuple.Pair;

public class FibonacciNumbers {

  private Map<Integer, Integer> fibonacciMap  = new HashMap<> ();
  
  public int fibonacciIterative( int position){
    Pair<Integer, Integer> initial = Pair.of(1, 1);
    return IntStream.rangeClosed(2, position)
                    .mapToObj(i -> Pair.of(i, 0)) 
                    .reduce(initial, (prev, ignore) -> Pair.of(prev.getRight(), prev.getLeft() + prev.getRight()))
                    .getRight();
  }
 

  public int fibonacciRecursive(int position){
    if(position == 0 || position == 1)
      return 1;
    else
      return fibonacciRecursive(position - 1) + fibonacciRecursive(position - 2);
  }
   

   public int fibonacciMemorizedRecursive(int position){
    if(position < 2)
      return 1;
    
    return fibonacciMap.computeIfAbsent(position, 
        thePosition -> fibonacciMemorizedRecursive(thePosition - 2) + fibonacciMemorizedRecursive(thePosition - 1));
      
  }  
}