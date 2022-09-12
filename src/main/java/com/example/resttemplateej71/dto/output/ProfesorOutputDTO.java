package com.example.resttemplateej71.dto.output;

import com.example.resttemplateej71.entity.Profesor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfesorOutputDTO {

    String id_profesor;
    PersonaOutputDTO personaOutputDTO;
    String coments;
    String branch;

    public ProfesorOutputDTO(Profesor profesor){
        setId_profesor(profesor.getId_profesor());
        setPersonaOutputDTO(new PersonaOutputDTO(profesor.getPersona()));
        setComents(profesor.getComents());
        setBranch(profesor.getBranch());
    }
}
