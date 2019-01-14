package com.example.shivam.erpsystem;

public class InsertCategory {
    public CategoryModel[] getInvoices() {
        CategoryModel[] data = new CategoryModel[20];

        for(int i = 0; i < 20; i ++) {
            CategoryModel row = new CategoryModel();
            row.category_id = (i+1);
            row.category_name = "Demo";

            data[i] = row;
        }
        return data;

    }
}
