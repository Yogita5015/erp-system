package com.example.shivam.erpsystem.Fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shivam.erpsystem.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SalesBillFragment extends Fragment {


    public SalesBillFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sales_bill, container, false);
    }

}
