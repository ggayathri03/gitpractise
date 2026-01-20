package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TestCalculator {
  Calculator obj;
  @BeforeAll
  public static void beforeAll() {
	  System.out.println("before all test cases");
  }
  @AfterAll
  public static void afterAll() {
	  System.out.println("after all test cases");
  }
  @BeforeEach
  public void beforeEach() {
	  System.out.println("before each test method");
	  obj=new Calculator();
  }
  @AfterEach
  public void afterEach() {
	  System.out.println("after each test method");
	  obj=null;
  }
  
  @Test
  @Timeout(value=5,unit=TimeUnit.SECONDS)
  public void testAdd() {
	  System.out.println("test add method");
	  assertEquals(20,obj.add(10, 10));
  }
  @Test
  public void testSub() {
	  System.out.println("test sub method");
	  assertEquals(0,obj.sub(10, 10));
  }
  @Test
  public void testMul() {
	  System.out.println("test Mul method");
	  assertEquals(100,obj.mul(10, 10));
  }
  @Test
  public void testListNames() {
	  System.out.println("test list data");
	  List<String> names=Arrays.asList("Rohit","dhoni","kholi","cris");
	  assertEquals(4,obj.ListNames(names).size());
  }
  @Test
  public void testGreetUser() {
	  System.out.println("test greetuser method");
  }
}
