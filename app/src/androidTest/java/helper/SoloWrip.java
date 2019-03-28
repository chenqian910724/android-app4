package helper;

import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

/**
 * Created by Administrator on 2019/3/26.
 */

public class SoloWrip {
    private Solo solo;

    public SoloWrip(Solo solo) {
        this.solo = solo;
    }

    public void clickOnView(View view) {
        Log.i("AUTO", "Click On View ：" + view.getId());
       // solo.waitForView(view, 1, 1000);
        solo.clickOnView(view);
        solo.sleep(1000);
    }

    public View getView(String id) {
        try{
            return solo.getView(id);
        }catch(Throwable th){
            return  null;
        }
    }

    public void enterText(EditText et, String st){
        solo.enterText(et,st);
    }
    public boolean  searchText(String st){
       return  solo.searchText(st,true);
    }

    public boolean  waitForText(String st, int Second){
        return  solo.waitForText(st,1,Second*1000);
    }
    public void sleep(){
        solo.sleep(1000);
    }
}
