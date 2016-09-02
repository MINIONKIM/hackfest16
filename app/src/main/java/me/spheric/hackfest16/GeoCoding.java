package me.spheric.hackfest16;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by minion on 16. 9. 1..
 */
public class GeoCoding {

    OkHttpClient client = new OkHttpClient();

    public void Parsejson (String jsonStr) {

        AppController appc = new AppController();

        try {
            JSONObject Jobj = new JSONObject(jsonStr);
            Jobj = Jobj.getJSONObject("result");
            JSONArray Jarr = Jobj.getJSONArray("items");
            Jobj = Jarr.getJSONObject(0);
            Jobj = Jobj.getJSONObject("point");

            appc.SetdCoord(Jobj.getDouble("x"),Jobj.getDouble("y"));

        }catch(JSONException e){
            e.printStackTrace();
        }
    }


    public void GeoCode(String addr) throws Exception {

        Request request = new Request.Builder()
                .url("https://openapi.naver.com/v1/map/geocode?query=" + addr + "&encoding=utf-8&coord=latlng")
                .header("User-Agent", "OkHttp Headers.java")
                .addHeader("Host", "openapi.naver.com")
                .addHeader("User-Agent", "curl/7.43.0")
                .addHeader("Accept", "OK")
                .addHeader("Content-Type", "application/json")
                .addHeader("X-Naver-Client-Id", "L1zn6k7sIpeU6YtuEGO_")
                .addHeader("X-Naver-Client-Secret", "KMDLnKLhbm")

                .get()
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

                Headers responseHeaders = response.headers();
                for (int i = 0, size = responseHeaders.size(); i < size; i++) {
                    System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
                }

                Parsejson(response.body().string());
            }


        });
    }
}
