package com.example.shivam.erpsystem.Fragment;

import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.shivam.erpsystem.Adapter.ProductAdapter;
import com.example.shivam.erpsystem.Model.ProductModel;
import com.example.shivam.erpsystem.R;

import java.util.ArrayList;
import java.util.List;


public class ProductFragment extends Fragment {
    private RecyclerView recyclerView;
    private ProductAdapter adapter;
    private List<ProductModel> productModelList;
    EditText ProductName, ProductUnit, CategoryName, ProductMRP, ProductTAX, ProductPurchasePrice, ProductSalesPrice, ProductDiscount, ProductNumber;


    public ProductFragment() {
        // Required empty public constructor
    }
 @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     View productfragment = inflater.inflate(R.layout.fragment_product, container, false);
     ProductName = productfragment.findViewById(R.id.Add_Product_Name);
     ProductUnit = productfragment.findViewById(R.id.Add_Product_Unit);
     CategoryName = productfragment.findViewById(R.id.Add_Category_Name);
     ProductMRP = productfragment.findViewById(R.id.Add_Product_MRP);
     ProductTAX = productfragment.findViewById(R.id.Add_Product_Tax);
     ProductPurchasePrice = productfragment.findViewById(R.id.Add_Product_Purchase_Price);
     ProductSalesPrice = productfragment.findViewById(R.id.Add_Product_Sales_Price);
     ProductDiscount = productfragment.findViewById(R.id.Add_Product_Discount);
     ProductNumber = productfragment.findViewById(R.id.Add_Product_Number);
     FloatingActionButton fab = (FloatingActionButton)productfragment.findViewById(R.id.ProductFabButton);fab.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Dialog addproduct=new Dialog(getActivity());
             addproduct.setContentView(R.layout.productaddlayout);

             addproduct.show();

         }
     });
     recyclerView = productfragment.findViewById(R.id.productRecycler);
     productModelList = new ArrayList<>();
     adapter = new ProductAdapter(getActivity(), productModelList);
     recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
     recyclerView.setHasFixedSize(true);
     recyclerView.setItemAnimator(new DefaultItemAnimator());
     recyclerView.setAdapter(adapter);
     ProductModel productModel = new ProductModel(1, "yogita" ,"ddv","kg",8758876,325655664,7665676,76788,78,56);
     productModelList.add(productModel);
     productModel = new ProductModel(1, "yogita" ,"ddv","kg",7566,325655664,7665676,76788,78,56);
     productModelList.add(productModel);
     productModel = new ProductModel(1, "yogita" ,"ddv","kg",56,324,676,76788,78,56);
     productModelList.add(productModel);
     productModel = new ProductModel(1, "yogita" ,"ddv","kg",876,325655664,7665676,76788,78,56);
     productModelList.add(productModel);
     productModel = new ProductModel(1, "yogita" ,"ddv","kg",758876,325655664,7665676,76788,78,56);
     productModelList.add(productModel);
     return productfragment;
 }

}



