package assign3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public abstract class FibboTestCases {
  
  private FibonacciNumbers fibonacciNumbers; 

  public FibonacciNumbers  getFibonacciNumbers(){
    return fibonacciNumbers;
  }
  
  @Before
  public void setUp( ) {
    fibonacciNumbers = new FibonacciNumbers();
  }
  
  public abstract int invokeFibonacci(int value);

  @Test
  public void FibboSeriesAtPositionZeroIsOne() {
    assertEquals(1, invokeFibonacci(0));
  }

  @Test
  public void FibboSeriesAtPositionFirstIsOne() {
    assertEquals(1, invokeFibonacci(1));
  }

  @Test
  public void FibboSeriesAtPositionSecondIsTwo() {
    assertEquals(2, invokeFibonacci(2));
  }

  @Test
  public void FibboSeriesAtPositionFifthIsEight() {
    assertEquals(8, invokeFibonacci(5));
  }

  @Test
  public void FibboSeriesAtPositionSeventhIsTwentyOne() {
    assertEquals(21, invokeFibonacci(7));
  }
}
