package ru.com.arcadelauncher.entity;

import org.codehaus.jackson.annotate.JsonProperty;

public class Code {

    @JsonProperty("id")
    private int id;

    @JsonProperty("code")
    private String code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
