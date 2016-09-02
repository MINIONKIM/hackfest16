package me.spheric.hackfest16;

import android.app.Application;
import android.content.Context;

/**
 * Created by minion on 16. 8. 28..
 */
public class AppController extends Application {

    String lcode = "ICN";
    String jsonStr = "";
    int sn = 0;

    Context ctx;

    double fLat = 0.0;
    double fLon = 0.0;

    double dLat = 0.0;
    double dLon = 0.0;

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

    public void SetCtx(Context _ctx) { ctx = _ctx; }
    public Context GetCtx() { return ctx; }

    public void SetfCoord(double _fLat, double _fLon) {
        fLat = _fLat;
        fLon = _fLon;
    }
    public double getfLat() {
        return fLat;
    }
    public double getfLon() {
        return fLon;
    }

    public void SetdCoord(double _dLat, double _dLon) {
        dLat = _dLat;
        dLon = _dLon;
    }
    public double getdLat() {
        return dLat;
    }
    public double getdLon() {
        return dLon;
    }


}
