package com.nijandhan.network.testdoubles;

import com.nijandhan.network.GoogleApiResponseListener;

/**
 * Created by Nijandhan on 9/30/2015.
 * Description :
 */
public class HttpGetListenerMock implements GoogleApiResponseListener {
    public boolean isSuccess;
    public String response;
    public String error;

    public HttpGetListenerMock(){
    }

    @Override
    public void onGoogleApiSuccessResponse(String response) {
        isSuccess = true;
        this.response = response;
    }

    @Override
    public void onGoogleApiErrorResponse(String error) {
        isSuccess = false;
        this.error = error;
    }
}
