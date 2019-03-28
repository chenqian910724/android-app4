package page;

import android.widget.Button;
import android.widget.EditText;

import helper.SoloWrip;


/**
 * Created by Administrator on 2019/3/26.
 */

public class PageLogin {
    private SoloWrip solo;
    private EditText nameET,PWDet;
    private Button loginBtn;
    public PageLogin(SoloWrip solo) {
        this.solo = solo;
    }
    public void initViews(){
        nameET= (EditText) solo.getView("net.oschina.app:id/et_username");
        PWDet=(EditText) solo.getView("net.oschina.app:id/et_password");
        loginBtn = (Button) solo.getView("net.oschina.app:id/btn_login");
    }
     public  void enterName(String name){
        solo.enterText(nameET,name);
    }

    public  void enterPwd(String pwd){
        solo.enterText(PWDet,pwd);
    }
    public void clickLoginBtn(){
        solo.clickOnView(loginBtn);
    }
    public void clearNameEditText(){
        solo.clickOnView(nameET);
    }
    public void clearPwdEditText(){
        solo.clickOnView(PWDet);
    }
    public void login(String s, String ss){
        clearNameEditText();
        enterName(s);
        clearPwdEditText();
        enterPwd(ss);
        clickLoginBtn();
    }

}
