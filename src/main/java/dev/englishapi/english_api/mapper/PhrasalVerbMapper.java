package dev.englishapi.english_api.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.englishapi.english_api.dto.PhrasalVerbDTO;
import dev.englishapi.english_api.entity.PhrasalVerb;


@Component
public class PhrasalVerbMapper {

    @Autowired
    private ModelMapper modelMapper;

    public PhrasalVerbDTO toDTO(PhrasalVerb phrasalVerb){
        return modelMapper.map(phrasalVerb, PhrasalVerbDTO.class);
    }

    public PhrasalVerb toEntity(PhrasalVerbDTO phrasalVerbDTO){
        return modelMapper.map(phrasalVerbDTO, PhrasalVerb.class);
    }
}
