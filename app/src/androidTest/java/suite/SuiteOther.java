package suite;


import junit.framework.TestSuite;

import test.Login1;
import test.VersionCheck;

/**
 * Created by Administrator on 2019/3/27.
 */

public class SuiteOther {

    public static TestSuite getOtherSuit(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(VersionCheck.class);
        return suite;
    }
}
