package com.alkemy.disneyworldspringbootapplication.mapper;

import com.alkemy.disneyworldspringbootapplication.dto.CharacterBasicDto;
import com.alkemy.disneyworldspringbootapplication.dto.CharacterDto;
import com.alkemy.disneyworldspringbootapplication.entity.CharacterEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CharacterMapper {
    CharacterDto toCharacterDto(CharacterEntity entity);
    CharacterEntity fromCharacterDto(CharacterDto characterDto);
    List<CharacterDto> toCharacterDtoList(List<CharacterEntity> characterEntityList);
    List<CharacterEntity> fromCharacterDtoList(List<CharacterDto> characterDtoList);
    CharacterBasicDto characterDtoToBasic(CharacterDto characterDto);
}
