package com.nijandhan.network;

/**
 * Created by Nijandhan on 9/29/2015.
 * Description :
 */
public interface HttpGetResponseListener {
    void onResponse(String response);
    void onError(String error);
}
