package ru.fiarr4ikdev.dreamexecutorapi.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.fiarr4ikdev.dreamexecutorapi.data.dto.DreamDTO;
import ru.fiarr4ikdev.dreamexecutorapi.data.entyty.DreamEntity;

@Service
public class DreamMapperService {

    private final ModelMapper modelMapper;

    @Autowired
    public DreamMapperService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public DreamDTO toDTO(DreamEntity dreamEntity) {
        return modelMapper.map(dreamEntity, DreamDTO.class);
    }

    public DreamEntity toEntity(DreamDTO dreamDTO) {
        return modelMapper.map(dreamDTO, DreamEntity.class);
    }
}
