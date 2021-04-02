package com.example.goroni;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SC extends ListActivity{
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] ListSC = new String[]{"SMAN 1 Pekanbaru", "SMAN 2 Pekanbaru", "SMAN 5 Pekanbaru",
                "SMAN 7 Pekanbaru", "SMAN 8 Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListSC));
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
            if (pilihan.equals("SMAN 1 Pekanbaru"))
            {
                a = new Intent(this, SCsmansa.class);
                startActivity(a);
            } else if (pilihan.equals("SMAN 2 Pekanbaru"))
            {
                a = new Intent(this, SCsmanda.class);
                startActivity(a);
            } else if (pilihan.equals("SMAN 5 Pekanbaru"))
            {
                a = new Intent(this, SCsmala.class);
                startActivity(a);
            } else if (pilihan.equals("SMAN 7 Pekanbaru"))
            {
                a = new Intent(this, SCsmansev.class);
                startActivity(a);
            } else if (pilihan.equals("SMAN 8 Pekanbaru"))
            {
                a = new Intent(this, SCsmandel.class);
                startActivity(a);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

