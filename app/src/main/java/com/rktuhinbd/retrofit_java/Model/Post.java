
package com.rktuhinbd.retrofit_java.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Post {

    @SerializedName("product_id")
    @Expose
    private Integer productId;
    @SerializedName("product_name")
    @Expose
    private String productName;
    @SerializedName("product_price")
    @Expose
    private Integer productPrice;
    @SerializedName("product_isbn")
    @Expose
    private String productIsbn;
    @SerializedName("product_barcode")
    @Expose
    private String productBarcode;
    @SerializedName("product_created")
    @Expose
    private String productCreated;
    @SerializedName("product_updated")
    @Expose
    private String productUpdated;
    @SerializedName("productMaster_productAttribute_relation")
    @Expose
    private List<String> productMasterProductAttributeRelation = null;
    @SerializedName("productMaster_productManufacturer_relation")
    @Expose
    private List<ProductMasterProductManufacturerRelation> productMasterProductManufacturerRelation = null;
    @SerializedName("productMaster_productCategory_relation")
    @Expose
    private List<ProductMasterProductCategoryRelation> productMasterProductCategoryRelation = null;
    @SerializedName("productMaster_productPhoto_relation")
    @Expose
    private List<ProductMasterProductPhotoRelation> productMasterProductPhotoRelation = null;

    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public String getProductIsbn() {
        return productIsbn;
    }

    public String getProductBarcode() {
        return productBarcode;
    }

    public String getProductCreated() {
        return productCreated;
    }

    public String getProductUpdated() {
        return productUpdated;
    }

    public List<String> getProductMasterProductAttributeRelation() {
        return productMasterProductAttributeRelation;
    }

    public List<ProductMasterProductManufacturerRelation> getProductMasterProductManufacturerRelation() {
        return productMasterProductManufacturerRelation;
    }

    public List<ProductMasterProductCategoryRelation> getProductMasterProductCategoryRelation() {
        return productMasterProductCategoryRelation;
    }

    public List<ProductMasterProductPhotoRelation> getProductMasterProductPhotoRelation() {
        return productMasterProductPhotoRelation;
    }
}