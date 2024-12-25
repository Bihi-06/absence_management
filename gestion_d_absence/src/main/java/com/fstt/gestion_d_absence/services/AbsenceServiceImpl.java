package com.fstt.gestion_d_absence.services;

import com.fstt.gestion_d_absence.entities.Absence;
import com.fstt.gestion_d_absence.repositories.AbsenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbsenceServiceImpl implements AbsenceService{

    @Autowired
    private AbsenceRepository absenceRepository;

    @Override
    public List<Absence> getAllAbsences() {
        return absenceRepository.findAll();
    }

    @Override
    public Absence getAbsenceById(Long id) {
        return absenceRepository.findById(id).orElse(null);
    }

    @Override
    public Absence createAbsence(Absence absence) {
        Absence newAbsence = new Absence();
        newAbsence.setAbsenceDate(absence.getAbsenceDate());
        newAbsence.setReason(absence.getReason());
        newAbsence.setStudent(absence.getStudent());
        return absenceRepository.save(newAbsence);
    }

    @Override
    public Absence updateAbsance(Long id, Absence absence) {
        Absence existingAbsence = absenceRepository.findById(id).orElse(null);
        if (existingAbsence != null) {
            existingAbsence.setAbsenceDate(absence.getAbsenceDate());
            existingAbsence.setReason(absence.getReason());
            existingAbsence.setStudent(absence.getStudent());
            return absenceRepository.save(existingAbsence);
        }
        return null;
    }

    @Override
    public void deleteAbsence(Long id) {
        absenceRepository.deleteById(id);
    }
}
