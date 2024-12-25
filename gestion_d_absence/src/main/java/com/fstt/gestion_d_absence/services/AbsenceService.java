package com.fstt.gestion_d_absence.services;

import com.fstt.gestion_d_absence.entities.Absence;

import java.util.List;

public interface AbsenceService {
    List<Absence> getAllAbsences();
    Absence getAbsenceById(Long id);
    Absence createAbsence(Absence absence);
    Absence updateAbsance(Long id, Absence absence);
    void deleteAbsence(Long id);
}
