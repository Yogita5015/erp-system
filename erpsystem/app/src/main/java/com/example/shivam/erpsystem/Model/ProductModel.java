package com.example.shivam.erpsystem.Model;

public class ProductModel {
    private int ProductId;
    private String ProductName;
    private String CategoryName;
    private String ProductUnit;
    private int ProductMRP;
    private int ProductTAX;
    private int ProductPurchasePrice;
    private int ProductSalesPrice;

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getProductUnit() {
        return ProductUnit;
    }

    public void setProductUnit(String productUnit) {
        ProductUnit = productUnit;
    }

    public int getProductMRP() {
        return ProductMRP;
    }

    public void setProductMRP(int productMRP) {
        ProductMRP = productMRP;
    }

    public int getProductTAX() {
        return ProductTAX;
    }

    public void setProductTAX(int productTAX) {
        ProductTAX = productTAX;
    }

    public int getProductPurchasePrice() {
        return ProductPurchasePrice;
    }

    public void setProductPurchasePrice(int productPurchasePrice) {
        ProductPurchasePrice = productPurchasePrice;
    }

    public int getProductSalesPrice() {
        return ProductSalesPrice;
    }

    public void setProductSalesPrice(int productSalesPrice) {
        ProductSalesPrice = productSalesPrice;
    }

    public float getProductDiscount() {
        return ProductDiscount;
    }

    public void setProductDiscount(float productDiscount) {
        ProductDiscount = productDiscount;
    }

    public float getProductNumber() {
        return ProductNumber;
    }

    public void setProductNumber(float productNumber) {
        ProductNumber = productNumber;
    }

    private float ProductDiscount;
    private float ProductNumber;


    public ProductModel(int productId, String productName, String categoryName, String productUnit, int productMRP, int productTAX, int productPurchasePrice, int productSalesPrice, float productDiscount, float productNumber) {
        ProductId = productId;
        ProductName = productName;
        CategoryName = categoryName;
        ProductUnit = productUnit;
        ProductMRP = productMRP;
        ProductTAX = productTAX;
        ProductPurchasePrice = productPurchasePrice;
        ProductSalesPrice = productSalesPrice;
        ProductDiscount = productDiscount;
        ProductNumber = productNumber;
    }



}