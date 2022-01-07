package com.company;

public class AppConfi {
    private AppConfi(){

    }
    private static AppConfi obj=null;
    public static AppConfi getIntance() {
        if(obj==null){
            obj =new AppConfi();
        }
        return obj;
    }
}
