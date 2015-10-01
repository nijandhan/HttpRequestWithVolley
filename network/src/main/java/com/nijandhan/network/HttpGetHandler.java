package com.nijandhan.network;

/**
 * Created by Nijandhan on 9/29/2015.
 * Description :
 */
public interface HttpGetHandler {
    void setListener(HttpGetResponseListener listener);
    void execute(String url, String tag);
    void cancelRequest(String tag);
    void unregisterListener();
}
