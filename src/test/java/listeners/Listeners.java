package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	    public void onStart(ITestContext context) {	
		System.out.println("onStart method started");
	}

	
	    public void onTestStart(ITestResult result) {
			System.out.println("New Test Started" +result.getName());
		}
		
	    public void onTestSuccess(ITestResult result) {
			System.out.println("Passed test case is " +result.getName());
		}

		public void onTestFailure(ITestResult result) {
			System.out.println("Failed test case is " +result.getName());
		}

		public void onTestSkipped(ITestResult result) {
			System.out.println("SkippedTest case is " +result.getName());
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}
		
		public void onFinish(ITestContext context) {
			System.out.println("onFinish method started");
		}

}
