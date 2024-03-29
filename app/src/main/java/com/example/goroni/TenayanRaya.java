package com.example.goroni;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TenayanRaya extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] ListAction = new String[]{"Call Center", "Driving Direction", "Info di Google", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListAction));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);

    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;

            if (pilihan.equals("Call Center")) {
                String nomortel = "tel:07614840924";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            } else if (pilihan.equals("Driving Direction")) {
                String lokasirs = "https://maps.app.goo.gl/MeoajzV7K3qAHH8R8";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));

            } else if (pilihan.equals("Info di Google")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Polsek Tenayan Raya Pekanbaru");

            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
