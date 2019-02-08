
package com.example.userprofile.models.retrive_data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("ID")
    @Expose
    private Integer iD;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("Phone")
    @Expose
    private String phone;
    @SerializedName("Gender")
    @Expose
    private String gender;
    @SerializedName("ProfilePic")
    @Expose
    private Object profilePic;
    @SerializedName("AuthStatus")
    @Expose
    private String authStatus;
    @SerializedName("LastAction")
    @Expose
    private String lastAction;
    @SerializedName("MakeDate")
    @Expose
    private String makeDate;
    @SerializedName("LastUpdateDate")
    @Expose
    private Object lastUpdateDate;
    @SerializedName("MakeBy")
    @Expose
    private Object makeBy;
    @SerializedName("UpdatedBy")
    @Expose
    private Object updatedBy;

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Object getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(Object profilePic) {
        this.profilePic = profilePic;
    }

    public String getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }

    public String getLastAction() {
        return lastAction;
    }

    public void setLastAction(String lastAction) {
        this.lastAction = lastAction;
    }

    public String getMakeDate() {
        return makeDate;
    }

    public void setMakeDate(String makeDate) {
        this.makeDate = makeDate;
    }

    public Object getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Object lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Object getMakeBy() {
        return makeBy;
    }

    public void setMakeBy(Object makeBy) {
        this.makeBy = makeBy;
    }

    public Object getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Object updatedBy) {
        this.updatedBy = updatedBy;
    }

}
