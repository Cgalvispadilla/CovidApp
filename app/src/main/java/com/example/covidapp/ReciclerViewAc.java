package com.example.covidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ReciclerViewAc extends RecyclerView .Adapter<ReciclerViewAc.ViewHolderDatos>{

    ArrayList<CasosCovid> casos;
    protected void onCreate(Bundle savedInstanceState) {

    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layrecicler,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderDatos holder, int position) {

    }

    @Override
    public int getItemCount() {
        return casos.size();
    }

    public ReciclerViewAc(ArrayList<CasosCovid> casos) {
        this.casos = casos;
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView Idcaso, Atenci_n;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
        }
    }
}
