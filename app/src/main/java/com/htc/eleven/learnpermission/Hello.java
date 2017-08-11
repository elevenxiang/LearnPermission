package com.htc.eleven.learnpermission;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by eleven on 17-8-11.
 */

public class Hello {

    // below permission also need register in AndroidManifest.xml.
    public static final String PERMISSION_SAY_HELLO = "com.htc.eleven.learnpermission.permission.sayhello";

    public static void sayHello(Context context){

        int checkResult = context.checkCallingOrSelfPermission(PERMISSION_SAY_HELLO);
        if(checkResult != PackageManager.PERMISSION_GRANTED) {
            throw new SecurityException("执行 sayHello 需要有 " + PERMISSION_SAY_HELLO + "权限 !");
        }

        System.out.println("执行 sayHello 成功 !");

    }
}
