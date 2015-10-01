package com.nijandhan.network;

import android.content.Context;

/**
 * Created by Nijandhan on 9/30/2015.
 * Description :
 */
public class Network {

    public static HttpGetHandler getHttpGetHandler(Context context){
        return new VolleyHttpGetRequest(context);
    }
}
