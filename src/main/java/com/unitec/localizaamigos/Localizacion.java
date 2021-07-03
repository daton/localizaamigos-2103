package com.unitec.localizaamigos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/*
En el caso de Java esta clase DEBE ESTAR TOTALMENTE ENCAPSULADA, SINO
MARCA ERROR Y O PERMITE CORRER
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Localizacion {
    double lat;
    double lng;
    String fecha;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Localizacion() {
    }
}
