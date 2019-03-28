package page;

import android.widget.TextView;

import helper.SoloWrip;


/**
 * Created by Administrator on 2019/3/27.
 */

public class PageAbout {
    private SoloWrip solo;
    private TextView versionTextView;

    public PageAbout(SoloWrip solo) {

        this.solo = solo;
    }

    public void initViews() {
        versionTextView = (TextView) solo.getView("net.oschina.app:id/tv_version_name");
    }

    public String getVersion() {

        return versionTextView.getText().toString();
    }
}
