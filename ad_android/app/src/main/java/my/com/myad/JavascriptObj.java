package my.com.myad;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/7/29.
 */
public class JavascriptObj {

    Handler handler;

    public JavascriptObj(Handler handler) {
        this.handler = handler;
    }

    @JavascriptInterface
    public void showBut() {
        Message message=new Message();
        message.what=0;
        handler.sendMessage(message);
    }

    @JavascriptInterface
    public void popupPhoto() {
        Message message=new Message();
        message.what=1;
        handler.sendMessage(message);
    }



}
