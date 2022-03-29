package com.example.act1part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.ArrayList;

public class Home_Activity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    //Deklarasi variabel dengan jenis data listview
    private ListView list;

    //memanggil class listviewAdaptter dan diinisiasi menjadi variabel adapter
    private ListViewAdapter adapter;

    //deklarasi array untuk menyimpan nama
    String[] listNama;

    //memanggil class ClassNama
    public static ArrayList<ClassNama> classNamaArrayList = new ArrayList<ClassNama>();

    //membuat objek Bundle
    Bundle bundle = new Bundle();

    //membuat objek intent
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        listNama = new String[]{"Inayah", "Ilham", "Eris", "Fikri", "Maul", "Intan",
                "Vina", "Gita", "Vian", "Lutfi"};

        list = findViewById(R.id.listkontak);
        //membuat objek dari class ClassNama menjadi arraylisy
        classNamaArrayList = new ArrayList<>();

        for (int i = 0; i < listNama.length; i++) {
            //membuat objek class nama da
            ClassNama classNama = new ClassNama(listNama[i]);
            //Binds strings ke array
            classNamaArrayList.add(classNama);
        }
        //membuat objek dari listviewadapter
        adapter = new ListViewAdapter(this);

        //binds adapter ke listview
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //deklarasi variabel nama yang berisi item yang diklik
                String nama = classNamaArrayList.get(position).getNama();

                //memasukkan value dari variabel nama dengan kunci "a" dan dimasukkan kedalam bundle
                bundle.putString("a", nama.trim());

                //membuat objek popum menu
                PopupMenu pm = new PopupMenu(getApplicationContext(), view);

                //membuat event untuk popupmenu ketika dipilih
                pm.setOnMenuItemClickListener(Home_Activity.this);

                //menampilkan popup menu dari layout menu
                pm.inflate(R.menu.popup_menu);

                //menampilkan popup menu
                pm.show();


            }
        });
    }
    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.mnview:
                intent = new Intent(getApplicationContext(), ActivityLihatData.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.mnedit:
                Toast.makeText(getApplicationContext(),"ini untuk edit kontak",
                        Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }
}



