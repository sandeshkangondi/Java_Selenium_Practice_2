package simple;

import junit.framework.Test;
import junit.framework.TestSuite;

public class CalcTestSuite {

 public static Test suite() {
  TestSuite suite = new TestSuite("Test for Practice");
  //$JUnit-BEGIN$
  suite.addTestSuite(Testcalculator.class);
  //suite.addTestSuite(Testcalculator2.class);
  //$JUnit-END$
  return suite;
 }
}

// This supports only junit 3