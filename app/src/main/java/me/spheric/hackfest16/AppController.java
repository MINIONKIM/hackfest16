package me.spheric.hackfest16;

import android.app.Application;

/**
 * Created by minion on 16. 8. 28..
 */
public class AppController extends Application {

    String lcode = "ICN";
    int sn = 0;

    public void SetSN(int _sn) {
        sn = _sn;
    }
    public int GetSN() {
        return sn;
    }
    public void SetLCode(String _lcode){
        lcode = _lcode;
    }
    public String GetLCode(){
        return lcode;
    }


}
