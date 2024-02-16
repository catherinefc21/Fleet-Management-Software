package com.fm.Fleet.Management.Software.controllers;

import com.fm.Fleet.Management.Software.models.TaxiModel;
import com.fm.Fleet.Management.Software.services.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/taxis")
public class TaxiController {
    @Autowired
    private TaxiService taxiService; // Inyección del servicio

    // Endpoint para obtener la lista de taxis con paginación
    @GetMapping
       public ResponseEntity<Page<TaxiModel>> getTaxis(Pageable pageable) {
        return ResponseEntity.ok(taxiService.getTaxis(pageable));
    }
}
