
package com.rktuhinbd.retrofit_java.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductMasterProductPhotoRelation {

    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("image_type")
    @Expose
    private String imageType;
    @SerializedName("ref_productId")
    @Expose
    private Integer refProductId;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public Integer getRefProductId() {
        return refProductId;
    }

    public void setRefProductId(Integer refProductId) {
        this.refProductId = refProductId;
    }

}
