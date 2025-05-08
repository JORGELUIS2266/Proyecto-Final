package com.Ariadna.Alumnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ariadna.Alumnos.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{
    

}
