package com.nijandhan.network;

import com.nijandhan.network.testdoubles.DummyVolleyHttpGetRequest;
import com.nijandhan.network.testdoubles.HttpGetListenerMock;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Nijandhan on 9/30/2015.
 * Description :
 */
public class GoogleApiRequestTest {

    HttpGetListenerMock httpGetListenerMock;
    GoogleApiRequest googleApiRequest;

   public GoogleApiRequestTest(){
       httpGetListenerMock = new HttpGetListenerMock();
       googleApiRequest = new GoogleApiRequest(new DummyVolleyHttpGetRequest(), httpGetListenerMock);
   }

    @Test
    public void testOnResponse(){
        googleApiRequest.onResponse("success");
        assertEquals(true, httpGetListenerMock.isSuccess);
        assertEquals("success", httpGetListenerMock.response);
    }

    @Test
    public void testOnError(){
        googleApiRequest.onError("failure");
        assertEquals(false, httpGetListenerMock.isSuccess);
        assertEquals("failure", httpGetListenerMock.error);
    }

}
