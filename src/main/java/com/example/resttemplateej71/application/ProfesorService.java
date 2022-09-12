package com.example.resttemplateej71.application;

import com.example.resttemplateej71.dto.input.ProfesorInputDTO;
import com.example.resttemplateej71.dto.output.ProfesorOutputDTO;
import com.example.resttemplateej71.entity.Profesor;

import java.util.List;

public interface ProfesorService {
    public ProfesorOutputDTO insertarProfesor(ProfesorInputDTO profesorDTO);
    public ProfesorOutputDTO editarProfesor(String id, Profesor profesor);
    public void eliminarProfesor(String id);
    public Profesor buscarProfesorPorId(String id);
//    public List<ProfesorOutputDTO> buscarProfesorsPorName(String name);
    public List<Profesor> dameAllProfesors() throws Exception;
}
