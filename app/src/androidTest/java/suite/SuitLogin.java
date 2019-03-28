package suite;


import junit.framework.TestSuite;

import test.Logion;

/**
 * Created by Administrator on 2019/3/27.
 */

public class SuitLogin {
    public SuitLogin() {
    }

    public static TestSuite getLoginSuit() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(Logion.class);
        return suite;
    }

}
