package helper;


import page.PageAbout;
import page.PageComment;
import page.PageLogin;
import page.PageMyTab;
import page.PageNav;
import page.PageSetting;

/**
 * Created by Administrator on 2019/3/27.
 */

public class Helper {
    private SoloWrip solo;
    PageLogin pageLogin;
    PageComment pageComment;
    PageMyTab pageMyTab;
    PageNav pageNav;
    PageAbout pageAbout;
    PageSetting pageSetting;
    public Helper( SoloWrip solo) {
        this.solo = solo;
    }

    /*
    * 获取LoginPage 的方法
    *
    * */
    public PageLogin getPageLogin() {
        if (pageLogin ==null){
          pageLogin = new PageLogin(solo);
        }
        pageLogin.initViews();
        return pageLogin;
    }

    public PageComment getPageComment() {
        if (pageComment ==null){
            pageComment = new PageComment(solo);
        }
        return pageComment;
    }

    public PageMyTab getPageMyTab() {
        if (pageMyTab ==null){
   pageMyTab = new PageMyTab(solo);
        }
        pageMyTab.initViews();
        return pageMyTab;
    }
    public PageNav getPageNav() {
        if (pageNav ==null){
            pageNav = new PageNav(solo);
        }
        pageNav.initViews();
        return pageNav;
    }
    public PageAbout getPageAbout() {
        if (pageAbout ==null){
            pageAbout = new PageAbout(solo);
        }
        pageAbout.initViews();
        return pageAbout;
    }
    public PageSetting getPageSetting() {
        if (pageSetting ==null){
            pageSetting = new PageSetting(solo);
        }
        pageSetting.initViews();
        return pageSetting;
    }


}
