package com.example.shivam.erpsystem;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class DashboardActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ExpandableListAdapter expandableListAdapter;
    ExpandableListView expandableListView;
    List<DashboardActivityModel> headerList = new ArrayList<>();
    HashMap<DashboardActivityModel, List<DashboardActivityModel>> childList = new HashMap<>();



    private RecyclerView recyclerView;
    private PieChartAdapter pieChartAdapter;
    private List<ProgressModel> ProgressList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        ProgressList = new ArrayList<>();
        pieChartAdapter= new PieChartAdapter(this, ProgressList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

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
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        expandableListView = findViewById(R.id.expandableListView);
        prepareMenuData();
        populateExpandableList();


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void prepareMenuData() {

        DashboardActivityModel menuModel = new DashboardActivityModel("Dashboard", true, false); //Menu of Android Tutorial. No sub menus
        headerList.add(menuModel);

        if (!menuModel.hasChildren) {
            childList.put(menuModel, null);
        }

        menuModel = new DashboardActivityModel("Master", true, true); //Menu of Java Tutorials
        headerList.add(menuModel);
        List<DashboardActivityModel> childModelsList = new ArrayList<>();
        DashboardActivityModel childModel = new DashboardActivityModel("Category", false, false);
        childModelsList.add(childModel);

        childModel = new DashboardActivityModel("Product", false, false);
        childModelsList.add(childModel);

        childModel = new DashboardActivityModel("Customer", false, false);
        childModelsList.add(childModel);

        childModel = new DashboardActivityModel("Supplier", false, false);
        childModelsList.add(childModel);

        childModel = new DashboardActivityModel("Account", false, false);
        childModelsList.add(childModel);

        childModel = new DashboardActivityModel("Tax Details", false, false);
        childModelsList.add(childModel);

        childModel = new DashboardActivityModel("Unit Details", false, false);
        childModelsList.add(childModel);


        if (menuModel.hasChildren) {
            Log.d("API123","here");
            childList.put(menuModel, childModelsList);
        }

         menuModel = new DashboardActivityModel("Purchase Order", true, false); //Menu of Android Tutorial. No sub menus
        headerList.add(menuModel);

        if (!menuModel.hasChildren) {
            childList.put(menuModel, null);
        }

         menuModel = new DashboardActivityModel("Sales Bill", true, false); //Menu of Android Tutorial. No sub menus
        headerList.add(menuModel);

        if (!menuModel.hasChildren) {
            childList.put(menuModel, null);
        }


         menuModel = new DashboardActivityModel("Quotation", true, false); //Menu of Android Tutorial. No sub menus
        headerList.add(menuModel);

        if (!menuModel.hasChildren) {
            childList.put(menuModel, null);
        }



        childModelsList = new ArrayList<>();
        menuModel = new DashboardActivityModel("Payment", true, true); //Menu of Python Tutorials
        headerList.add(menuModel);
        childModel = new DashboardActivityModel("Receipts", false, false);
        childModelsList.add(childModel);

        childModel = new DashboardActivityModel("Purchase Voucher", false, false);
        childModelsList.add(childModel);

        childModel = new DashboardActivityModel("Expense Voucher", false, false);

        childModelsList.add(childModel);
        if (menuModel.hasChildren) {
            childList.put(menuModel, childModelsList);
        }

        childModelsList = new ArrayList<>();
        menuModel = new DashboardActivityModel("Reports", true, true); //Menu of Python Tutorials
        headerList.add(menuModel);
        childModel = new DashboardActivityModel("Reports Daily Transaction", false, false);
        childModelsList.add(childModel);

        childModel = new DashboardActivityModel("Purchase Report", false, false);
        childModelsList.add(childModel);

        childModel = new DashboardActivityModel("Sales Report", false, false);

        childModelsList.add(childModel);

        childModel = new DashboardActivityModel("Stock Report", false, false);
        childModelsList.add(childModel);

        childModel = new DashboardActivityModel("Account Report", false, false);
        childModelsList.add(childModel);

        childModel = new DashboardActivityModel("Quotation Report", false, false);

        childModelsList.add(childModel);

        childModel = new DashboardActivityModel("Tax Report", false, false);

        childModelsList.add(childModel);
        if (menuModel.hasChildren) {
            childList.put(menuModel, childModelsList);
        }
        menuModel = new DashboardActivityModel("Manage Leads", true, false); //Menu of Android Tutorial. No sub menus
        headerList.add(menuModel);

        if (!menuModel.hasChildren) {
            childList.put(menuModel, null);
        }
        menuModel = new DashboardActivityModel("Follow Up", true, false); //Menu of Android Tutorial. No sub menus
        headerList.add(menuModel);

        if (!menuModel.hasChildren) {
            childList.put(menuModel, null);
        }
    }

    private void populateExpandableList() {

        expandableListAdapter = new ExpandableListAdapter(this, headerList, childList);
        expandableListView.setAdapter(expandableListAdapter);

        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                if (headerList.get(groupPosition).isGroup) {
                    if (!headerList.get(groupPosition).hasChildren) {
                    }
                }

                return false;
            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                if (childList.get(headerList.get(groupPosition)) != null) {
                    String model = childList.get(headerList.get(groupPosition)).get(childPosition).menuName;
                    switch (model) {
                             case "Category":
                                 Toast.makeText(getApplicationContext(),"gsgdfj",Toast.LENGTH_LONG).show();
                    }

                }

                return false;
            }
        });
    }
}
