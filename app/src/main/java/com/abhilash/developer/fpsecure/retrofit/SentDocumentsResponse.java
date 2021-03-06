package com.abhilash.developer.fpsecure.retrofit;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Abhilash on 19-09-2017
 */

public class SentDocumentsResponse implements Serializable {
    private boolean success;
    private ArrayList<SentDocument> data;

    public boolean isSuccess() {
        return success;
    }

    public ArrayList<SentDocument> getData() {
        return data;
    }
}
