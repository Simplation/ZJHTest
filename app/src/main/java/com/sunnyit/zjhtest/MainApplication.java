package com.sunnyit.zjhtest;

import android.app.Application;

import com.sunnyit.zjhlibrary.AppConfig;
import com.sunnyit.zjhlibrary.IAppComponent;


public class MainApplication extends Application implements IAppComponent {
    @Override
    public void onCreate() {
        super.onCreate();

        initialize(this);
    }

    @Override
    public void initialize(Application application) {
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof IAppComponent) {
                    ((IAppComponent) object).initialize(this);
                }

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
