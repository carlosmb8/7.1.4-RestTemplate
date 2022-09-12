package com.example.resttemplateej71.controller;

import com.example.resttemplateej71.application.PersonaServiceImpl;
import com.example.resttemplateej71.application.ProfesorServiceImpl;
import com.example.resttemplateej71.dto.input.PersonaInputDTO;
import com.example.resttemplateej71.dto.output.PersonaOutputDTO;
import com.example.resttemplateej71.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaControlador {

    @Autowired
    PersonaServiceImpl personaServiceImpl;

    @Autowired
    ProfesorServiceImpl profesorServiceImpl;


    @GetMapping("personas/{id}")
    public PersonaOutputDTO damePersona(@PathVariable Integer id) {
            return new PersonaOutputDTO(personaServiceImpl.buscarPersonaPorId(id));
    }

    @PostMapping("personas")
    public List<PersonaOutputDTO> damePersonaPorNombre(@RequestParam String name) {

        return personaServiceImpl.buscarPersonaPorName(name);
    }

    @GetMapping("personas")
    public Iterable<Persona> damePersonas() throws Exception{

        return personaServiceImpl.dameAllPersonas();
    }

    @PostMapping("personas/insertar")
    public String insertaPersona(@RequestBody PersonaInputDTO personaDTO) {

        personaServiceImpl.insertarPersona(personaDTO);

        return "Persona insertada correctamente";

    }

    @PutMapping("personas/editar")
    public void editarPersona(@RequestParam Integer id, @RequestBody Persona persona) {
        personaServiceImpl.editarPersona(id, persona);
    }

    @DeleteMapping("personas/eliminar")
    public String eliminarPersona(@RequestParam Integer id) {
        personaServiceImpl.eliminarPersona(id);
        return "La persona con el id: " + id + " ha sido borrada correctamete";
    }


}
