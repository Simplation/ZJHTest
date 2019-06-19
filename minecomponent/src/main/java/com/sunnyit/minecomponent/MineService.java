package com.sunnyit.minecomponent;

import android.content.Context;
import android.content.Intent;

import com.sunnyit.zjhlibrary.IMineService;

public class MineService implements IMineService {
    @Override
    public void launch(Context context, String targetClass) {
        Intent intent = new Intent(context, MineActivity.class);
        context.startActivity(intent);
    }
}
