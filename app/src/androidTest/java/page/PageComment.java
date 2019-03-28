package page;


import helper.SoloWrip;

/**
 * Created by Administrator on 2019/3/27.
 */

public class PageComment {
    private SoloWrip solo;
    public PageComment(SoloWrip solo) {
        this.solo = solo;
    }
    public boolean  searchText(String text){
        return solo.searchText(text);
    }
    public boolean  waitForhText(String text, int i){
        return solo.waitForText(text,i);
    }
}
