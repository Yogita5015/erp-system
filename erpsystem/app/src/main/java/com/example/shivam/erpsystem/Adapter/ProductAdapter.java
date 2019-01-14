package com.example.shivam.erpsystem.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.shivam.erpsystem.Model.CategoryModel;
import com.example.shivam.erpsystem.Model.ProductModel;
import com.example.shivam.erpsystem.R;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {

    private Context mContext;
    private List<ProductModel> ProductModelList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView ProductId, ProductName, ProductUnit, CategoryName, ProductMRP, ProductTAX, ProductPurchasePrice, ProductSalesPrice, ProductDiscount, ProductNumber;
        Button Edit, Delete;

        public MyViewHolder(View view) {
            super(view);
            ProductId = view.findViewById(R.id.TextViewProductId);
            ProductName = view.findViewById(R.id.Product_Name);
            CategoryName = view.findViewById(R.id.Category_Name);
            ProductUnit = view.findViewById(R.id.Product_Unit);
            ProductMRP = view.findViewById(R.id.Product_MRP);
            ProductTAX = view.findViewById(R.id.Product_Tax);
            ProductPurchasePrice = view.findViewById(R.id.Product_Purchase_Price);
            ProductSalesPrice = view.findViewById(R.id.Product_Sales_Price);
            ProductDiscount = view.findViewById(R.id.Product_Discount);
            ProductNumber = view.findViewById(R.id.Product_Number);

        }

    }

    public ProductAdapter(Context mContext, List<ProductModel> ProductModelList) {
        this.mContext = mContext;
        this.ProductModelList = ProductModelList;
    }
    @Override
    public ProductAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.addandshowproductlayout, parent, false);

        return new ProductAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ProductModel productModel=ProductModelList.get(position);
        holder.ProductId.setText(String.valueOf(productModel.getProductId()));
        holder.ProductName.setText(productModel.getProductName());
        holder.CategoryName.setText(productModel.getCategoryName());
        holder.ProductUnit.setText(String.valueOf(productModel.getProductUnit()));
        holder.ProductMRP.setText(String.valueOf(productModel.getProductMRP()));
        holder.ProductTAX.setText(String.valueOf(productModel.getProductTAX()));
        holder.ProductPurchasePrice.setText(String.valueOf(productModel.getProductPurchasePrice()));
        holder.ProductSalesPrice.setText(String.valueOf(productModel.getProductSalesPrice()));
        holder.ProductDiscount.setText(String.valueOf(productModel.getProductDiscount()));
        holder.ProductNumber.setText(String.valueOf(productModel.getProductNumber()));

    }


    @Override
    public int getItemCount() {
        return ProductModelList.size();
    }
}
