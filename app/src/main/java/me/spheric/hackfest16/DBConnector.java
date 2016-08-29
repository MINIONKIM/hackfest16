package me.spheric.hackfest16;

import android.os.AsyncTask;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by minion on 16. 8. 26..
 */
public class DBConnector {

    String ecode;
    String url_putdata = "http://spheric.me/putd.php";
    String url_newtable = "http://spheric.me/mktable.php";

    double dx, dy, cx, cy;

    DBConnector(String _ecode, double _dx, double _dy, double _cx, double _cy)
    {
        ecode = _ecode;
        dx = _dx;
        dy = _dy;
        cx = _cx;
        cy = _cy;
    }

    class AsyncUpstream extends AsyncTask<String, Integer, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... urls) {
            try {
                String postData = "?" + "name=" + ecode + "&time=" + "0" + "&" + "dx=" + dx + "&" + "dy=" + dy + "&" + "cx=" + cx + "&" + "cy=" + cy;

                String _URL = url_putdata+postData;
                System.out.println(_URL);

                URL url = new URL(_URL);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                System.out.println(conn.getResponseCode());

            } catch (Exception e) {
                e.printStackTrace();
            }

            return "success";
        }
    }
    class AsyncCreateTable extends AsyncTask<String, Integer, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... urls) {
            try {
                String postData = "?" + "name=" + ecode;

                String _URL = url_newtable+postData;
                System.out.println(_URL);

                URL url = new URL(_URL);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                System.out.println(conn.getResponseCode());

            } catch (Exception e) {
                e.printStackTrace();
            }

            return "success";
        }
    }
    class AsyncDownstream extends AsyncTask<String, Integer, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... urls) {
            try {
                String postData = "?" + "name=" + ecode;

                String _URL = url_newtable+postData;
                System.out.println(_URL);

                URL url = new URL(_URL);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                System.out.println(conn.getResponseCode());

            } catch (Exception e) {
                e.printStackTrace();
            }

            return "success";
        }
    }

}
