package com.rae.goservice;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Police extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listPol = new String[] {"Polsek Sukajadi","Kantor Polisi Wanita","Poltabes Barelang","Polsek Tampan","Kantor Imigran Luar Negeri","Polresta Solok"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listPol));
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
            if (pilihan.equals("Polsek Sukajadi")) {
                a = new Intent(this, PolsekSukajadi.class);
            } else if (pilihan.equals("Kantor Polisi Wanita")) {
                a = new Intent(this, PolisiWanita.class);
            } else if (pilihan.equals("Poltabes Barelang"))
            {

            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}