package com.sunnyit.logincomponent;

import android.app.Application;

import com.sunnyit.zjhlibrary.IAppComponent;
import com.sunnyit.zjhlibrary.ServiceFactory;

public class LoginApplication extends Application implements IAppComponent {

    private static Application application;

    private static Application getApplication() {
        return application;
    }

    @Override
    public void initialize(Application application) {
        ServiceFactory.getInstance().setmILoginService(new LoginService());
    }
}
