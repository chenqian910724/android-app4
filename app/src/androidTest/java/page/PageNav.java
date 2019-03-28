package page;

import android.view.View;

import helper.SoloWrip;


/**
 * Created by Administrator on 2019/3/27.
 */

public class PageNav {
    private SoloWrip solo;
    private View newTab ,tweetTab ,addTab,exproTab,myTab;


    public PageNav(SoloWrip solo) {
        this.solo = solo;
    }
    public  void initViews(){
        newTab=solo.getView("net.oschina.app:id/nav_item_news");
        tweetTab= solo.getView("net.oschina.app:id/nav_item_tweet");
        addTab= solo.getView("net.oschina.app:id/nav_item_tweet_pub");
        exproTab =solo.getView("net.oschina.app:id/nav_item_explore");
        myTab = solo.getView("net.oschina.app:id/nav_item_me");
    }
    public void clickNewsTab(){
        solo.clickOnView(newTab);
    }
    public void clickTweetTab(){
        solo.clickOnView(tweetTab);
    }
    public void clickAddTab(){
        solo.clickOnView(addTab);
    }
    public void clickExproTab(){
        solo.clickOnView(exproTab);
    }
    public void clickMyTab(){

        solo.clickOnView(myTab);

    }

}
