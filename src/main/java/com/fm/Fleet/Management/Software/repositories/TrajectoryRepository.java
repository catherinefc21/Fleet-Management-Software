package com.fm.Fleet.Management.Software.repositories;

import com.fm.Fleet.Management.Software.models.TrajectoryModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface TrajectoryRepository extends JpaRepository<TrajectoryModel, Integer> {
    @Query(value = "SELECT t FROM Trajectory t WHERE t.taxi.id = :taxiId ORDER BY t.date DESC")
    Page<TrajectoryModel> findLatestByTaxiId(@Param("taxiId") Integer taxiId, Pageable pageable);

    // Pendiente !! Método para encontrar la última ubicación de cada taxi
}
