package com.fstt.gestion_d_absence.repositories;

import com.fstt.gestion_d_absence.entities.Absence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbsenceRepository extends JpaRepository<Absence, Long> {
}
