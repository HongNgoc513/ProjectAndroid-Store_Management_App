package com.example.duan1_pro1121_nhom2.AdapteData;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.duan1_pro1121_nhom2.ClassProduct.SanPham;
import com.example.duan1_pro1121_nhom2.R;

import java.util.ArrayList;

public class Top10_adapter extends BaseAdapter {
    ArrayList<SanPham> sanPhams;

    public Top10_adapter(ArrayList<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    @Override
    public int getCount() {
        return sanPhams.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_top_sp,parent,false);
        TextView tvCount,tvName,tvSL,tvGT;
        tvCount = view.findViewById(R.id.tvRowTopCount);
        tvName = view.findViewById(R.id.tvRowTopName);
        tvSL = view.findViewById(R.id.tvRowTopSL);
        tvGT = view.findViewById(R.id.tvRowTopGiaTri);
        SanPham sanPham = sanPhams.get(position);
        tvCount.setText(position+"");
        tvName.setText(sanPham.getNAMESP());
        tvSL.setText(sanPham.getSOLUONGDABAN()+"");
        tvGT.setText((sanPham.getSOLUONGDABAN()*sanPham.getGIANHAP())+"");
        return view;
    }
}
