package test;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;


import com.robotium.solo.Solo;

import net.oschina.app.AppStart;

/**
 * Created by Administrator on 2019/3/27.
 */

public class Login1 extends ActivityInstrumentationTestCase2 {
    private Solo solo;
    private View myTab;
    public Login1() {
        super(AppStart.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        //做一些初始化的操作
        solo = new Solo(getInstrumentation(),getActivity());
    }
    public void testName() throws Exception {
        //做测试
        myTab = solo.getView("net.oschina.app:id/nav_item_me");
        solo.clickOnView(myTab);
        solo.sleep(6000);
    }
    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }
}
