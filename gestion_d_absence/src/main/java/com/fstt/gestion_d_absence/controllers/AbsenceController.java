package com.fstt.gestion_d_absence.controllers;


import com.fstt.gestion_d_absence.entities.Absence;
import com.fstt.gestion_d_absence.services.AbsenceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/absences")
@CrossOrigin(origins = "http://localhost:4200")
public class AbsenceController {

    @Autowired
    private AbsenceServiceImpl absenceService;

    @GetMapping
    public List<Absence> getAllAbsence() {
        return absenceService.getAllAbsences();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Absence> getAbsenceById(@PathVariable Long id) {
        Absence absence = absenceService.getAbsenceById(id);
        return absence != null ? ResponseEntity.ok(absence) :
                ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Absence createAbsence(@RequestBody Absence absence) {
        return absenceService.createAbsence(absence);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Absence> updateAbsence(@PathVariable Long id, @RequestBody Absence absence) {
        Absence updatedAbsence = absenceService.updateAbsance(id, absence);
        return updatedAbsence != null ? ResponseEntity.ok(updatedAbsence) :
                ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAbsence(@PathVariable Long id) {
        absenceService.deleteAbsence(id);
        return ResponseEntity.noContent().build();
    }

}
