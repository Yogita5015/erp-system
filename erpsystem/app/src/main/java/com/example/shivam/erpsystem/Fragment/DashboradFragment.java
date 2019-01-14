package com.example.shivam.erpsystem.Fragment;


import android.app.Fragment;
import android.os.Bundle;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shivam.erpsystem.Adapter.PieChartAdapter;
import com.example.shivam.erpsystem.Model.ProgressModel;
import com.example.shivam.erpsystem.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboradFragment extends Fragment {

    private RecyclerView recyclerView;
    private PieChartAdapter pieChartAdapter;
    private List<ProgressModel> ProgressList;
    public DashboradFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_dashborad, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);

        ProgressList = new ArrayList<>();
        pieChartAdapter= new PieChartAdapter(getActivity(), ProgressList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(pieChartAdapter);
        ProgressModel a = new ProgressModel(20,100,"20");
        ProgressList.add(a);

        a = new ProgressModel(40,100,"40");
        ProgressList.add(a);

        a = new ProgressModel(60,100,"60");
        ProgressList.add(a);
        a = new ProgressModel(80,100,"80");
        ProgressList.add(a);

        a = new ProgressModel(100,100,"100");
        ProgressList.add(a);
        return view;
        }

}
