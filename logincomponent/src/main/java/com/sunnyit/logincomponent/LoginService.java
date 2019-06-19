package com.sunnyit.logincomponent;

import android.content.Context;
import android.content.Intent;

import com.sunnyit.zjhlibrary.ILoginService;


public class LoginService implements ILoginService {
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }
}
