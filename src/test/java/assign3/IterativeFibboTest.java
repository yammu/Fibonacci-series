package assign3;

public class IterativeFibboTest extends FibboTestCases{
  
  @Override
  public int invokeFibonacci(int value) {
    return getFibonacciNumbers().fibonacciIterative(value);
  }
}
