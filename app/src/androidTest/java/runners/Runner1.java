package runners;

import android.test.InstrumentationTestRunner;



import junit.framework.TestSuite;

import suite.SuitLogin;
import suite.SuiteOther;

/**
 * Created by Administrator on 2019/3/27.
 */

public class Runner1 extends InstrumentationTestRunner {
    @Override
    public TestSuite getAllTests() {
        TestSuite suite = new TestSuite();
        suite.addTest(SuitLogin.getLoginSuit());
        suite.addTest(SuiteOther.getOtherSuit());
        return  suite;
    }
}
