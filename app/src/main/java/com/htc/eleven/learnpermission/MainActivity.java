package com.htc.eleven.learnpermission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView wv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hello.sayHello(this);

        wv = (WebView) findViewById(R.id.wv);

        // only when we add internet permission in AndroidManifest.xml, then it will show websit content, or it failed to show anything.
        wv.loadUrl("http://www.jikexueyuan.com");
    }
}
