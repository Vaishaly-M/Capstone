package com.example.storedata;

public class DataClass {

    private final String dataTitle;
    private final String dataDesc;
    private final String dataLang;
    private final String dataImage;
    private String key;
    public String getKey() {
        return key; }

    public void setKey(String key) { this.key = key; }
    public String getDataTitle() {
        return dataTitle;
    }
    public String getDataDesc() {
        return dataDesc;
    }
    public String getDataLang() {
        return dataLang;
    }
    public String getDataImage() {
        return dataImage;
    }
    public DataClass(String dataTitle, String dataDesc, String dataLang, String dataImage) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.dataLang = dataLang;
        this.dataImage = dataImage;
    }
}
