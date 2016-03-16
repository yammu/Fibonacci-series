package assign3;

public class RecursiveFibboTest extends FibboTestCases {
 
  @Override
  public int invokeFibonacci(int value) {
    return  getFibonacciNumbers().fibonacciRecursive(value);
  }
}

  
 
