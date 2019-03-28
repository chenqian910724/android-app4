package test;


import helper.BasicTestCase;

/**
 * Created by Administrator on 2019/3/27.
 */

public class Logion extends BasicTestCase {
     public void testName(){
         helper.getPageNav().clickMyTab();
         helper.getPageMyTab().clickLoginIcon();
         helper.getPageLogin().login("hellowword","123456");
        // assertTrue(helper.getPageComment().searchText("用户名或口令错"));
     }


}
