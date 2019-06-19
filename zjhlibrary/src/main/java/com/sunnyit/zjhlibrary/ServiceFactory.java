package com.sunnyit.zjhlibrary;


public class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();
    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    private ILoginService mILoginService;
    private IMineService mMineService;

    public ILoginService getmILoginService() {
        return mILoginService;
    }

    public void setmILoginService(ILoginService mILoginService) {
        if (mILoginService == null) {
            this.mILoginService = new EmptyLoginService();
        } else {
            this.mILoginService = mILoginService;
        }
    }

    public IMineService getmMineService() {
        return mMineService;
    }

    public void setmMineService(IMineService mMineService) {
        this.mMineService = mMineService;
    }
}
