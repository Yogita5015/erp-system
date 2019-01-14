package com.example.shivam.erpsystem.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.shivam.erpsystem.Model.CustomerModel;
import com.example.shivam.erpsystem.R;

import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.MyViewHolder> {

    public Context mContext;
    private List<CustomerModel> albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView CustomerID, CustomerName,CustomerEmailId, CustomerAddress, CustomerMobileNo, CustomerGSTNo, CustomerPancarNo;

        public MyViewHolder(@NonNull View view) {
            super(view);
            CustomerID = (TextView) view.findViewById(R.id.TextViewCustomerId);
            CustomerName = (TextView) view.findViewById(R.id.TextViewCustomerName);
            CustomerAddress = (TextView) view.findViewById(R.id.TextViewCustomerAddress);
            CustomerMobileNo = (TextView) view.findViewById(R.id.TextViewCustomerContact);
            CustomerGSTNo = (TextView) view.findViewById(R.id.TextViewCustomerGSTNo);
            CustomerPancarNo = (TextView) view.findViewById(R.id.TextViewCustomerPANNo);
            CustomerEmailId=(TextView)view.findViewById(R.id.TextViewCustomerEmail);

        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.addandshowcustomerlayout, parent, false);

        return new MyViewHolder(itemView);
    }
    public CustomerAdapter(Context mContext, List<CustomerModel> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        CustomerModel album = albumList.get(position);
        holder.CustomerID.setText(String.valueOf(album.getId()));
        holder.CustomerName.setText(album.getName());
        holder.CustomerEmailId.setText(String.valueOf(album.getMobileNo()));
        holder.CustomerMobileNo.setText(String.valueOf(album.getMobileNo()));
        holder.CustomerAddress.setText(album.getAddress());
        holder.CustomerGSTNo.setText(String.valueOf(album.getGSTno()));
        holder.CustomerPancarNo.setText(String.valueOf(album.getPANCardNo()));


        }

    @Override
    public int getItemCount() {
        return albumList.size();
    }
}