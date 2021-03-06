package com.flutterwave.rave.models.request;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

/**
 * Created by Shittu on 19/12/2016.
 */

public abstract class BaseRequestData {

    @SerializedName("PBFPubKey")
    private String PBFPubKey;
    private String amount;
    private String email;
    @SerializedName("IP")
    private String IP;

    @SerializedName("txRef")
    private String txRef;
    private String country;
    private String currency;

    @SerializedName("firstname")
    private String firstName;

    @SerializedName("lastname")
    private String lastName;

    private String narration;
    private List<Map<String, Object>> meta;

    public BaseRequestData(String PBFPubKey, String amount, String email, String IP, String txRef,
                           String country, String currency, String firstName, String lastName,
                           String narration, List<Map<String, Object>> meta) {
        this.PBFPubKey = PBFPubKey;
        this.amount = amount;
        this.email = email;
        this.IP = IP;
        this.txRef = txRef;
        this.country = country;
        this.currency = currency;
        this.firstName = firstName;
        this.lastName = lastName;
        this.narration = narration;
        this.meta = meta;
    }

    public String getPBFPubKey() {
        return PBFPubKey;
    }

    public String getamount() {
        return amount;
    }

    public String getemail() {
        return email;
    }

    public String getIP() {
        return IP;
    }

    public String gettxRef() {
        return txRef;
    }

    public String getcountry() {
        return country;
    }

    public List<Map<String, Object>> getmeta() {
        return meta;
    }

    public String getnarration() {
        return narration;
    }

    public String getlastname() {
        return lastName;
    }

    public String getfirstname() {
        return firstName;
    }

    public String getcurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("PBFPubKey", PBFPubKey)
                .add("amount", amount)
                .add("email", email)
                .add("IP", IP)
                .add("txRef", txRef)
                .add("country", country)
                .add("currency", currency)
                .add("firstName", firstName)
                .add("lastName", lastName)
                .add("narration", narration)
                .add("meta", meta)
                .toString();
    }
}
