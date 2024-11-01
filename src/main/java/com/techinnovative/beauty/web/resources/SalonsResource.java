package com.techinnovative.beauty.web.resources;


import com.techinnovative.beauty.generated.v1.api.SalonsApi;
import com.techinnovative.beauty.generated.v1.model.Salon;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class SalonsResource implements SalonsApi {

    @Override
    public ResponseEntity<List<Salon>> findAllSalons(String name, String phoneNumber) {
        // JPA Specifications
        return SalonsApi.super.findAllSalons(name, phoneNumber);
    }
}
