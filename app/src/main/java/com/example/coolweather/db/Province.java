package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String provinceCode;
    private int provinceName;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getProvinceName() {
        return provinceName;
    }
    public void setProvinceName(int provinceName) {
        this.provinceName = provinceName;
    }
}
