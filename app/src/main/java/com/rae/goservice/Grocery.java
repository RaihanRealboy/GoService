package com.rae.goservice;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Grocery extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listGcr = new String[] {"Giant Plaza Sudirman","Hoot Place","Nagoya Hill","Plaza Andalas","Transmart Pekanbaru","Pasar Rakyat"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listGcr));
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
            if (pilihan.equals("Giant Plaza Sudirman")) {
                a = new Intent(this, GiantPlaza.class);
            } else if (pilihan.equals("Hoot Place")) {
                a = new Intent(this, HootPlace.class);
            } else if (pilihan.equals("Nagoya Hill"))
            {

            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}