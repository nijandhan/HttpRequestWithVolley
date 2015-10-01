package com.nijandhan.network;


/**
 * Created by Nijandhan on 9/29/2015.
 * Description :
 */
public class GoogleApiRequest implements HttpGetResponseListener {

    private String url ="http://www.google.com";
    private static final String API_REQUEST_TAG = "google_api";
    private GoogleApiResponseListener mListener;
    private HttpGetHandler mHttpGetHandler;

    public GoogleApiRequest(HttpGetHandler httpGetHandler,GoogleApiResponseListener listener){
        mListener = listener;
        mHttpGetHandler = httpGetHandler;
        mHttpGetHandler.setListener(GoogleApiRequest.this);
        mHttpGetHandler.execute(url, API_REQUEST_TAG);
    }

    public void cancel(){
        mHttpGetHandler.cancelRequest(API_REQUEST_TAG);
        destroy();
    }

    public void destroy(){
        mHttpGetHandler.unregisterListener();
        mListener = null;
    }

    @Override
    public void onResponse(String response) {
        if(mListener != null)
            mListener.onGoogleApiSuccessResponse(response);
        destroy();
    }

    @Override
    public void onError(String error) {
        if(mListener != null)
            mListener.onGoogleApiErrorResponse(error);
        destroy();
    }
}
