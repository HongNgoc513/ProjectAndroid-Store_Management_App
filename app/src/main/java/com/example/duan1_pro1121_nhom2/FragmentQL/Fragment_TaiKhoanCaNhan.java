package com.example.duan1_pro1121_nhom2.FragmentQL;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.duan1_pro1121_nhom2.ClassProduct.NhanVien;
import com.example.duan1_pro1121_nhom2.DataSQL.SQLife;
import com.example.duan1_pro1121_nhom2.LoginAccount.DangNhap;
import com.example.duan1_pro1121_nhom2.LoginAccount.StepDangKi;
import com.example.duan1_pro1121_nhom2.R;

import java.util.Calendar;

public class Fragment_TaiKhoanCaNhan extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment_taikhoancanhan,container,false);
        EditText edHoTen,edSDT,edDiaChi;
        TextView txtNgaySinh,txtGioiTinh;
        Button btnSua,btnChonNgay,btnNam,btnNu;
        edHoTen = view.findViewById(R.id.edHT_NV_CN);
        edDiaChi = view.findViewById(R.id.edDC_NV_CN);
        edSDT = view.findViewById(R.id.edSDT_NV_CN);
        txtNgaySinh =view.findViewById(R.id.txtNS_NV_CN);
        txtGioiTinh = view.findViewById(R.id.txtGT_NV_CN);
        btnSua = view.findViewById(R.id.btnSuaAcount);
        btnChonNgay = view.findViewById(R.id.btnChonNS_NV_CN);
        btnNam = view.findViewById(R.id.btnGT_NV_Nam_CN);
        btnNu = view.findViewById(R.id.btnGT_NV_Nu_CN);
        SQLife sqLife = new SQLife(view.getContext());
        NhanVien nhanVien = sqLife.getOneNV(getMANV()+"");
        edHoTen.setText(nhanVien.getTenNV());
        edDiaChi.setText(nhanVien.getDiaChi());
        edSDT.setText(nhanVien.getNumberPhone());
        txtNgaySinh.setText(nhanVien.getNgaySinh());
        txtGioiTinh.setText(nhanVien.getGioiTinh());
        return view;
    }

    int MANV;

    public Fragment_TaiKhoanCaNhan(int MANV) {
        this.MANV = MANV;
    }

    public int getMANV() {
        return MANV;
    }

    public void setMANV(int MANV) {
        this.MANV = MANV;
    }
}
