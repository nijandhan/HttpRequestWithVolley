package com.nijandhan.network.testdoubles;

import com.nijandhan.network.HttpGetHandler;
import com.nijandhan.network.HttpGetResponseListener;

/**
 * Created by Nijandhan on 9/30/2015.
 * Description :
 */
public class DummyVolleyHttpGetRequest implements HttpGetHandler {

    public DummyVolleyHttpGetRequest(){
    }

    @Override
    public void setListener(HttpGetResponseListener listener) {
    }

    @Override
    public void execute(String url, String tag) {
    }

    @Override
    public void cancelRequest(String tag) {

    }

    @Override
    public void unregisterListener() {

    }
}
