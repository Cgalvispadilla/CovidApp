package com.example.covidapp.ui.gallery;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covidapp.CasosCovid;
import com.example.covidapp.R;
import com.example.covidapp.ReciclerViewAc;
import com.example.covidapp.interfaces.InterfaceJson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DatosUrlFragment extends Fragment {
    ArrayList<CasosCovid> covidArrayList = new ArrayList<>();
    private RecyclerView recyclerView;
    private AppBarConfiguration mAppBarConfiguration;
    ReciclerViewAc reciclerViewAc;
    Context context;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View vista =inflater.inflate(R.layout.fragment_datosurl, container, false);
        recyclerView = (RecyclerView) vista.findViewById(R.id.RecyclerviewDatos);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return vista;

    }
    private void getPost() {
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl("https://www.datos.gov.co/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        InterfaceJson interfaceJson= retrofit.create(InterfaceJson.class);
        Call<List<CasosCovid>> call = interfaceJson.getDatosCovid();

        call.enqueue(new Callback<List<CasosCovid>>() {
            @Override
            public void onResponse(Call<List<CasosCovid>> call, Response<List<CasosCovid>> response) {
                covidArrayList = new ArrayList<>(response.body());
                Toast.makeText(context.getApplicationContext(),"Cargando datos del URL", Toast.LENGTH_LONG);
            }

            @Override
            public void onFailure(Call<List<CasosCovid>> call, Throwable t) {
                Toast.makeText(context.getApplicationContext(),"Error al cargar los datos del URL", Toast.LENGTH_LONG);
            }
        });
    }
}
