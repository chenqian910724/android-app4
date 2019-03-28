package page;

import android.widget.ImageView;

import helper.SoloWrip;


/**
 * Created by Administrator on 2019/3/27.
 */

public class PageMyTab {
    private SoloWrip solo;
    private ImageView imageView,settingImageBtn;

    public PageMyTab(SoloWrip solo) {
        this.solo = solo;
    }
    public void initViews() {
        imageView = (ImageView) solo.getView("net.oschina.app:id/iv_portrait");
        settingImageBtn = (ImageView) solo.getView("net.oschina.app:id/iv_logo_setting");
    }
    public void clickLoginIcon(){
       solo.clickOnView(imageView);
    }
    public void clickSettingsIcon(){
        solo.clickOnView(settingImageBtn);
    }
}
