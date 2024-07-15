package TestngListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("This is test scanerio: OnTestStart"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("This is test scanerio : OnTestSuccess"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("This is test scanerio: OnTestFailure"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("This is test scanerio: OnTestSkipped"+result.getName());
	}
	

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("This is test scanerio :onTestFailedButWithinSuccessPercentage"+result.getName());
	}

	
	

}
