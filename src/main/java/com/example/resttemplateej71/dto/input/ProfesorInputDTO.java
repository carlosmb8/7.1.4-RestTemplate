package com.example.resttemplateej71.dto.input;


import com.example.resttemplateej71.entity.Persona;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfesorInputDTO {

    String id_profesor;
    Integer id_persona;
    Persona persona;
    String coments;
    String branch;

}
