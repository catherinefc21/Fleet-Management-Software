package com.fm.Fleet.Management.Software.services;

import com.fm.Fleet.Management.Software.models.TaxiModel;
import com.fm.Fleet.Management.Software.repositories.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class TaxiService {

    @Autowired // inyección de dependencias
    private TaxiRepository taxiRepository;

    // Método para obtener todos los taxis con paginación
    public Page <TaxiModel> getTaxis(Pageable pageable) {
        return taxiRepository.findAll(pageable);
    }

    public TaxiModel saveTaxi(TaxiModel taxi){
        return taxiRepository.save(taxi);
    }

}
