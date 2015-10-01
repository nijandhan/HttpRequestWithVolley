package com.nijandhan.network;

/**
 * Created by Nijandhan on 9/29/2015.
 * Description :
 */
public interface GoogleApiResponseListener {
    void onGoogleApiSuccessResponse(String response);
    void onGoogleApiErrorResponse(String error);
}
