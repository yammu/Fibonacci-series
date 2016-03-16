package assign3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MemorizedFibboTest extends FibboTestCases{

  @Override
  public int invokeFibonacci(int value) {
    return  getFibonacciNumbers().fibonacciMemorizedRecursive(value);
  }
  
  public long computeTime(Runnable code) {
    long startTime = System.nanoTime();
    code.run();
    return System.nanoTime() - startTime;
  }
  
  @Test
  public void MemorisedVersionFasterThanRecursiveVersion()
  {       
    long recursiveTime = computeTime(() -> getFibonacciNumbers().fibonacciRecursive(40));
    long memorizedTime = computeTime(() -> getFibonacciNumbers().fibonacciMemorizedRecursive(40));
    assertTrue(recursiveTime > 10 * memorizedTime);
  }
}
