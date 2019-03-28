package page;

import android.view.View;

import helper.SoloWrip;


/**
 * Created by Administrator on 2019/3/27.
 */

public class PageSetting {
    private SoloWrip solo;
    private View about;

    public PageSetting(SoloWrip solo) {
        this.solo = solo;
    }
    public  void initViews(){
        about =solo.getView("net.oschina.app:id/rl_about");

    }
    public  void clickAbout(){
        solo.clickOnView(about);
    }
}
