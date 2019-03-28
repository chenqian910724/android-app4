package helper;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import net.oschina.app.AppStart;

/**
 * Created by Administrator on 2019/3/27.
 */

public class BasicTestCase extends ActivityInstrumentationTestCase2 {
    private Solo solo1;
    private SoloWrip solo;
    protected Helper helper;

    public BasicTestCase() {
        super(AppStart.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        solo1 = new Solo(getInstrumentation(), getActivity());
        solo = new SoloWrip(solo1);
        helper = new Helper(solo);
    }

    @Override
    public void tearDown() throws Exception {
        solo1.finishOpenedActivities();
        super.tearDown();
    }
}
