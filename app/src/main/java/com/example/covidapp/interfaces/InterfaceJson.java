package com.example.covidapp.interfaces;

import com.example.covidapp.CasosCovid;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InterfaceJson {
    @GET("resource/gt2j-8ykr.json")
    Call<List<CasosCovid>> getDatosCovid();
}
