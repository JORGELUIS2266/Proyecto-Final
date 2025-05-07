package com.Ariadna.Alumnos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ariadna.Alumnos.model.Alumno;
import com.Ariadna.Alumnos.repository.AlumnoRepository;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping("/traer-alumnos")
    public List<Alumno> TraerAlumnos() {
        return alumnoRepository.findAll();
    }
}
