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
import android.widget.ImageButton;

import com.example.shivam.erpsystem.Adapter.CategoryAdapter;
import com.example.shivam.erpsystem.Model.CategoryModel;
import com.example.shivam.erpsystem.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {


    private RecyclerView recyclerView;
    private CategoryAdapter adapter;
    private List<CategoryModel> categoryModelList;
    EditText categoryName;
    ImageButton addNewCategory,cancelCategory;
    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View catefragment=inflater.inflate(R.layout.fragment_category, container, false);
        FloatingActionButton fab = (FloatingActionButton)catefragment.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog addcategory=new Dialog(getActivity());
                addcategory.setContentView(R.layout.categoryaddlayout);

                categoryName=view.findViewById(R.id.addcategotyName);
                addNewCategory=view.findViewById(R.id.addNewCategory);
                cancelCategory=view.findViewById(R.id.cancelCategory);

                addcategory.show();

            }
        });
        recyclerView = catefragment.findViewById(R.id.categoryRecycler);
        categoryModelList = new ArrayList<>();
        adapter = new CategoryAdapter(getActivity(), categoryModelList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        CategoryModel categoryModel=new CategoryModel("1","Demome");
        categoryModelList.add(categoryModel);
        categoryModel=new CategoryModel("2","Demoby");
        categoryModelList.add(categoryModel);
        categoryModel=new CategoryModel("2","Demoby");
        categoryModelList.add(categoryModel);
        categoryModel=new CategoryModel("2","Demoby");
        categoryModelList.add(categoryModel);
        categoryModel=new CategoryModel("2","Demoby");
        categoryModelList.add(categoryModel);
        categoryModel=new CategoryModel("2","Demoby");
        categoryModelList.add(categoryModel);
        return catefragment;
    }




}
