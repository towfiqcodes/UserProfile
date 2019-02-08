
package com.example.userprofile.models.userProfileResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;

public class UserResponse {

    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Data")
    @Expose
    private HashMap<String, Object>Data=new HashMap<String, Object>();
    @SerializedName("Status")
    @Expose
    private Boolean status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HashMap<String,Object> getData() {
        return Data;
    }

    public void setData( String name, Object value) {
        Data.put(name,value);
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
