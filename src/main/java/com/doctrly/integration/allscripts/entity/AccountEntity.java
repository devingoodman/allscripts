package com.doctrly.integration.allscripts.entity;

import java.math.BigInteger;

//@Entity
//@Table(name = "account", catalog = "")
public class AccountEntity {
    private BigInteger id;
    private String name;
    private Integer apiCallLimit;

    //@Id
    //@GeneratedValue(generator = "shortUid")
    //@GenericGenerator(name = "shortUid", strategy = "com.up72.msi.util.ShortUUIDIncrementGenerator")
    //@Column(name = "id", unique = true, nullable = false, insertable = true, updatable = true, length = 19)
    //public java.lang.Long getId() {

    //@Id
    //@Column(name = "id")
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }

    //@Basic
    //@Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //@Basic
    //@Column(name = "api_call_limit")
    public Integer getApiCallLimit() {
        return apiCallLimit;
    }
    public void setApiCallLimit(Integer apiCallLimit) {
        this.apiCallLimit = apiCallLimit;
    }

}
