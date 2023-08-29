package Dwopractice1;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.SkipException;

public class NewTest {
	
  @Test(dataProvider = "dp1",priority=0)
  public void testCase1(int ActualData) {
	  Integer ExpectedData=10;
	  Assert.assertEquals(ActualData, ExpectedData);
  }

  @DataProvider(name="dp1")
  public Object[] dp1() {
   Object[] data=new Object[] {10};
   return data;
  }
  
  @Test(dataProvider = "dp2",priority=1)
  public void testCase2(int ActualData) {
	  Integer ExpectedData=20;
	  Assert.assertEquals(ActualData, ExpectedData);
  }

  @DataProvider(name="dp2")
  public Object[] dp2() {
	  Object[] data=new Object[] {20};
	   return data;
  }
  
  @Test(dataProvider = "dp3",priority=2)
  public void testCase3(int ActualData,int ExpectedData) {
	  Assert.assertEquals(ActualData, ExpectedData);
  }

  @DataProvider(name="dp3")
  public Object[][] dp3() {
	  Object[][] datavalue=new Object[][] {{25,25}};
      return datavalue;
  }
  
  @Test(dataProvider = "dp4",priority=3)
  public void testCase4(int ActualData,int ExpectedData) {
	  Assert.assertEquals(ActualData, ExpectedData);
  }

  @DataProvider(name="dp4")
  public Object[][] dp4() {
	  Object[][] datavalue=new Object[][] {{28,28}};
      return datavalue;
  }
  
  @Test(dataProvider = "dp5",priority=4)
  public void testCase5(int ActualData) {
	  Integer ExpectedData=20;
	  Assert.assertEquals(ActualData, ExpectedData);
  }

  @DataProvider(name="dp5")
  public Object[] dp5() {
	  Object[] data=new Object[] {40};
	   return data;
  }
  
  @Test(dataProvider = "dp6",priority=5)
  public void testCase6(int ActualData) {
	  Integer ExpectedData=40;
	  Assert.assertEquals(ActualData, ExpectedData);
  }

  @DataProvider(name="dp6")
  public Object[] dp6() {
	  Object[] data=new Object[] {60};
	   return data;
  }
  
  @Test(dataProvider = "dp7",priority=6)
  public void testCase7(int ActualData,int ExpectedData) {
	  Assert.assertEquals(ActualData, ExpectedData);
  }

  @DataProvider(name="dp7")
  public Object[][] dp7() {
	  Object[][] datavalue=new Object[][] {{25,50}};
      return datavalue;
  }
  
  @Test(dataProvider = "dp8",priority=7)
  public void testCase8(int ActualData,int ExpectedData) {
	  Assert.assertEquals(ActualData, ExpectedData);
  }

  @DataProvider(name="dp8")
  public Object[][] dp8() {
	  Object[][] datavalue=new Object[][] {{70,80}};
      return datavalue;
  }
  @Test(dataProvider = "dp9",priority=8)
  public void testCase9(String ActualData) {
	  Integer ExpectedData=null;
	  if(ExpectedData!=null){
	Assert.assertEquals(ActualData, ExpectedData);}
	  else {
		  throw new SkipException("testCase9 Skipped");
	  }
	  
  }

  @DataProvider(name="dp9")
  public Object[] dp9() {
	  Object[] data=new Object[] {"hello"};
	   return data;
  }
  
  @Test(dataProvider = "dp10",priority=9)
  public void testCase10(String ActualData) {
	  Integer ExpectedData=null;
	  if(ExpectedData!=null){
	Assert.assertEquals(ActualData, ExpectedData);}
	  else {
		  throw new SkipException("testCase10 Skipped");
	  }
  }

  @DataProvider(name="dp10")
  public Object[] dp10() {
	  Object[] data=new Object[] {"hi"};
	   return data;
  }
}
