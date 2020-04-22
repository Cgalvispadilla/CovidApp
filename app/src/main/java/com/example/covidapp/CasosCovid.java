package com.example.covidapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CasosCovid {
    @SerializedName("id_de_caso")
    @Expose
    private String idDeCaso;
    @SerializedName("fecha_de_notificaci_n")
    @Expose
    private String fechaDeNotificaciN;
    @SerializedName("codigo_divipola")
    @Expose
    private String codigoDivipola;
    @SerializedName("ciudad_de_ubicaci_n")
    @Expose
    private String ciudadDeUbicaciN;
    @SerializedName("departamento")
    @Expose
    private String departamento;
    @SerializedName("atenci_n")
    @Expose
    private String atenciN;
    @SerializedName("edad")
    @Expose
    private String edad;
    @SerializedName("sexo")
    @Expose
    private String sexo;
    @SerializedName("tipo")
    @Expose
    private String tipo;
    @SerializedName("estado")
    @Expose
    private String estado;
    @SerializedName("pa_s_de_procedencia")
    @Expose
    private String paSDeProcedencia;
    @SerializedName("fis")
    @Expose
    private String fis;
    @SerializedName("fecha_de_muerte")
    @Expose
    private String fechaDeMuerte;
    @SerializedName("fecha_diagnostico")
    @Expose
    private String fechaDiagnostico;
    @SerializedName("fecha_recuperado")
    @Expose
    private String fechaRecuperado;

    public String getIdDeCaso() {
        return idDeCaso;
    }

    public void setIdDeCaso(String idDeCaso) {
        this.idDeCaso = idDeCaso;
    }

    public String getFechaDeNotificaciN() {
        return fechaDeNotificaciN;
    }

    public void setFechaDeNotificaciN(String fechaDeNotificaciN) {
        this.fechaDeNotificaciN = fechaDeNotificaciN;
    }

    public String getCodigoDivipola() {
        return codigoDivipola;
    }

    public void setCodigoDivipola(String codigoDivipola) {
        this.codigoDivipola = codigoDivipola;
    }

    public String getCiudadDeUbicaciN() {
        return ciudadDeUbicaciN;
    }

    public void setCiudadDeUbicaciN(String ciudadDeUbicaciN) {
        this.ciudadDeUbicaciN = ciudadDeUbicaciN;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getAtenciN() {
        return atenciN;
    }

    public void setAtenciN(String atenciN) {
        this.atenciN = atenciN;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPaSDeProcedencia() {
        return paSDeProcedencia;
    }

    public void setPaSDeProcedencia(String paSDeProcedencia) {
        this.paSDeProcedencia = paSDeProcedencia;
    }

    public String getFis() {
        return fis;
    }

    public void setFis(String fis) {
        this.fis = fis;
    }

    public String getFechaDeMuerte() {
        return fechaDeMuerte;
    }

    public void setFechaDeMuerte(String fechaDeMuerte) {
        this.fechaDeMuerte = fechaDeMuerte;
    }

    public String getFechaDiagnostico() {
        return fechaDiagnostico;
    }

    public void setFechaDiagnostico(String fechaDiagnostico) {
        this.fechaDiagnostico = fechaDiagnostico;
    }

    public String getFechaRecuperado() {
        return fechaRecuperado;
    }

    public void setFechaRecuperado(String fechaRecuperado) {
        this.fechaRecuperado = fechaRecuperado;
    }
}
