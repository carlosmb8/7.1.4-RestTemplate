package com.example.resttemplateej71.controller;

import com.example.resttemplateej71.application.ProfesorServiceImpl;
import com.example.resttemplateej71.dto.input.ProfesorInputDTO;
import com.example.resttemplateej71.dto.output.ProfesorOutputDTO;
import com.example.resttemplateej71.entity.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfesorControlador {

    @Autowired
    ProfesorServiceImpl profesorServiceImpl;


//    @GetMapping("profesores/{id}")
//    public Profesor dameProfesor(@PathVariable String id) {
//        return profesorServiceImpl.buscarProfesorPorId(id);
//    }

    @GetMapping("profesores/{id}")
    public ProfesorOutputDTO dameProfesor(@PathVariable String id) {
        ProfesorOutputDTO profesor = new ProfesorOutputDTO(profesorServiceImpl.buscarProfesorPorId(id));
        return profesor;
    }

//    @PostMapping("profesores")
//    public List<ProfesorOutputDTO> dameProfesorPorNombre(@RequestParam String name) {
//
//        return profesorServiceImpl.buscarProfesoresPorName(name);
//    }

    @GetMapping("profesores")
    public Iterable<Profesor> dameProfesores() throws Exception{

        return profesorServiceImpl.dameAllProfesors();
    }

    @PostMapping("profesores/insertar")
    public String insertaProfesor(@RequestBody ProfesorInputDTO profesorDTO) {

        profesorServiceImpl.insertarProfesor(profesorDTO);

        return "Profesor insertado correctamente";

    }

    @PutMapping("profesores/editar")
    public ProfesorOutputDTO editarProfesor(@RequestParam String id, @RequestBody Profesor profesor) {
        return profesorServiceImpl.editarProfesor(id, profesor);
    }

    @DeleteMapping("profesores/eliminar")
    public String eliminarProfesor(@RequestParam String id) {
        profesorServiceImpl.eliminarProfesor(id);
        return "El profesor con el id: " + id + " ha sido borrado correctamete";
    }
}
