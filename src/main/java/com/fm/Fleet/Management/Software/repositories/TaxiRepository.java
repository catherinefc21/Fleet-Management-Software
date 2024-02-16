package com.fm.Fleet.Management.Software.repositories;

import com.fm.Fleet.Management.Software.models.TaxiModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // clase que permite hacer querys a una base de datos
public interface TaxiRepository extends JpaRepository<TaxiModel, Integer> {

}
