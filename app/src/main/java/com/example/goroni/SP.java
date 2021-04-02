package com.example.goroni;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SP extends ListActivity{
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] ListMR = new String[]{"Naga Swalayan", "IIN Swalayan", "Planet Swalayan Marpoyan",
                "Global Swalayan", "Cendana Mart"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListMR));
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
            if (pilihan.equals("Naga Swalayan"))
            {
                a = new Intent(this, SPNaga.class);
                startActivity(a);
            } else if (pilihan.equals("IIN Swalayan"))
            {
                a = new Intent(this, SPiin.class);
                startActivity(a);
            } else if (pilihan.equals("Planet Swalayan Marpoyan"))
            {
                a = new Intent(this, SPPlanet.class);
                startActivity(a);
            } else if (pilihan.equals("Global Swalayan"))
            {
                a = new Intent(this, SPGlobal.class);
                startActivity(a);
            } else if (pilihan.equals("Cendana Mart"))
            {
                a = new Intent(this, SPcendana.class);
                startActivity(a);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

