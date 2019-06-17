
package com.rktuhinbd.retrofit_java.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductMasterProductManufacturerRelation {

    @SerializedName("manufacturer_id")
    @Expose
    private Integer manufacturerId;
    @SerializedName("manufacturer_name")
    @Expose
    private String manufacturerName;

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

}
