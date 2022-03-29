package com.example.act1part2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
        //Deklarasi variabel dengan jenis data context


        Context mContext;

        //deklarasi variabel dengan jenis data layout inflater
        LayoutInflater inflater;

        //deklarasi variabel dengan jenis data arraylist
        private ArrayList<ClassNama> arraylist;

        public ListViewAdapter (Context context){
            //membari nilai mContext dengan context
            mContext = context;

            //mengatur Layoutinflater dari context yang diberikan
            inflater = LayoutInflater.from(mContext);

            //memberikan nilai arraylist dari class ClassNama
            this.arraylist = new ArrayList<ClassNama>();

            //menambahkan semua elemen ke arraylist
            this.arraylist.addAll(Home_Activity.classNamaArrayList);
    }
    public class ViewHolder{
            //mendeklarasikan variabel dengan jenis Textview
            TextView name;
    }
    @Override
    public int getCount() {
            //mengembalikan nilai berupa jumlah data dari array data
        return Home_Activity.classNamaArrayList.size();
    }
    //fungsi ini digunakan untuk mendapatkan data item yang terkait dengan
    //posisi tertentu dalam kumpulan data untuk mendapatkan data yang sesuai
    //dari lokasi tertentu dalam pengumpulan data item.
    @Override
    public Object getItem(int i) {
            //mengembalikan nilai berupa objek dari array data
        return Home_Activity.classNamaArrayList.get(i);
    }
    //fungsi mengembalikan "nilai" dari posisi item ke adaptor.
    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
            //deklarasi variabel dengan jenis data viewHolder
            final ViewHolder holder;

            //membuat kondisi apakah view null atau tidak
            if (view == null){
                //membuat objek view holder
                holder = new ViewHolder();

                //mengatur layout untuk menampilkan item
                view = inflater.inflate(R.layout.activity_item_listview,null);

                //set id untuk textview
                holder.name = (TextView) view.findViewById(R.id.tvnama_item);

                //menyimpan data dalam tampilan tanpa menggunakan struktur data lain.
                view.setTag(holder);
            }else {
                //mengatur holer untuk mengembalikan nilai dari view tag.
                holder = (ViewHolder) view.getTag();
            }
            //set item ke TextViews
            holder.name.setText(Home_Activity.classNamaArrayList.get(i).getNama());

            //mengembalikan nilai ke variabel view
        return  view;

    }

}
