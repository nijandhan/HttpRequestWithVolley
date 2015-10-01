package com.nijandhan.network;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by Nijandhan on 9/29/2015.
 * Description :
 */
public class VolleyHttpGetRequest implements HttpGetHandler,Response.ErrorListener, Response.Listener<String> {

    private RequestQueue queue;
    private HttpGetResponseListener mListener;

    public VolleyHttpGetRequest(Context context){
        queue = Volley.newRequestQueue(context);
    }

    @Override
    public void setListener(HttpGetResponseListener listener){
        mListener = listener;
    }

    @Override
    public void execute(String url, String tag){
        StringRequest stringRequest =  new StringRequest(Request.Method.GET,url,VolleyHttpGetRequest.this,VolleyHttpGetRequest.this);
        stringRequest.setTag(tag);
        queue.add(stringRequest);
    }

    @Override
    public void cancelRequest(String tag){
        queue.cancelAll(tag);
    }

    @Override
    public void unregisterListener(){
        mListener = null;
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        if(mListener != null)
            mListener.onError(error.getMessage());
    }

    @Override
    public void onResponse(String response) {
        if(mListener != null)
            mListener.onResponse(response);
    }


}
