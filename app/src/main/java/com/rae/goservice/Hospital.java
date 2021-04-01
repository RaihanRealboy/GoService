package com.rae.goservice;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Hospital extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listRS = new String[] {"Rumah Sakit Awal Bros","Rumah Sakit Budi Kemuliaan","Rumah Sakit Harapan Bunda","RS Tampan","Rumah Sakit Ummi","Rumah Sakit Pondok Indah"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listRS));
    }
    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Rumah Sakit Awal Bros")) {
                a = new Intent(this, RSAwalBross.class);
            } else if (pilihan.equals("Rumah Sakit Budi Kemuliaan")) {
                a = new Intent(this, RSBudiKemuliaan.class);
            } else if (pilihan.equals("Rumah Sakit Harapan Bunda"))
            {

            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}