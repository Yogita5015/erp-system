package com.example.shivam.erpsystem.Fragment;


import android.app.Activity;

import android.app.Dialog;
import android.os.Bundle;

import android.support.design.widget.FloatingActionButton;
import android.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.shivam.erpsystem.Adapter.CategoryAdapter;
import com.example.shivam.erpsystem.Adapter.CustomerAdapter;
import com.example.shivam.erpsystem.Model.CategoryModel;
import com.example.shivam.erpsystem.Model.CustomerModel;
import com.example.shivam.erpsystem.R;

import java.util.ArrayList;
import java.util.List;

public class CustomerFragment extends Fragment{
    private RecyclerView recyclerView;
    private CustomerAdapter adapter;
    private List<CustomerModel> albumList;
    EditText CustomerName,CustomerEmailId, CustomerAddress, CustomerMobileNo, CustomerGSTNo, CustomerPancarNo;
    TextView CustomerDetails;
    public CustomerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View customerfragment = inflater.inflate(R.layout.fragment_customer, container, false);
        CustomerName = customerfragment.findViewById(R.id.Add_Customer_Name);
        CustomerEmailId = customerfragment.findViewById(R.id.Add_Customer_EmailId);
        CustomerAddress = customerfragment.findViewById(R.id.Add_Customer_Address);
        CustomerMobileNo = customerfragment.findViewById(R.id.Add_Customer_Mobile_Number);
        CustomerGSTNo = customerfragment.findViewById(R.id.Add_Supplier_GST_Number);
        CustomerPancarNo = customerfragment.findViewById(R.id.Add_Customer_PAN_Card_Number);
       FloatingActionButton fab = (FloatingActionButton)customerfragment.findViewById(R.id.FabButton);fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog addcustomer=new Dialog(getActivity());
                addcustomer.setContentView(R.layout.customeraddlayout);

                addcustomer.show();

            }
        });

        recyclerView = customerfragment.findViewById(R.id.customerRecycler);
        albumList = new ArrayList<>();
        adapter = new CustomerAdapter(getActivity(), albumList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        CustomerModel customerModel = new CustomerModel(1, "yogita" ,47683 , "nagar",7673,3546);
        albumList.add(customerModel);
        customerModel = new CustomerModel(1, "yogita" ,47683 , "nagar",7673,3546);
        albumList.add(customerModel);
        customerModel = new CustomerModel(1, "yogita" ,47683 , "nagar",7673,3546);
        albumList.add(customerModel);
        customerModel = new CustomerModel(1, "yogita" ,47683 , "nagar",7673,3546);
        albumList.add(customerModel);
        customerModel = new CustomerModel(1, "yogita" ,47683 , "nagar",7673,3546);
        albumList.add(customerModel);
        return customerfragment;
    }

}




