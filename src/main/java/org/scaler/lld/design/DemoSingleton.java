package org.scaler.lld.design;

public class DemoSingleton {

    private static DemoSingleton demoSingleton = null;

    private DemoSingleton(){

    }

    public static synchronized DemoSingleton getDemoSingleton() {
        if(demoSingleton == null)
            demoSingleton = new DemoSingleton();
        return demoSingleton;
    }

    public String getWhatEverYouSend(String str){
        return str;
    }
}
