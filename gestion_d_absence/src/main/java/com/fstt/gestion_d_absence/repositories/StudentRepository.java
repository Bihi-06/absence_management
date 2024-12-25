package com.fstt.gestion_d_absence.repositories;

import com.fstt.gestion_d_absence.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
