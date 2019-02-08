
package com.example.userprofile.models.userProfileRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserRequest {

    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Data")
    @Expose
    private Data data;
    @SerializedName("Status")
    @Expose
    private Boolean status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
