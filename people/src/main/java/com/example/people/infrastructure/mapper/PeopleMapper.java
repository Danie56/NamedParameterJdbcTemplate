package com.example.people.infrastructure.mapper;

import com.example.people.domain.entites.People;
import com.example.people.infrastructure.dto.PeopleDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)

public interface PeopleMapper {

  People toPeopleEntity(PeopleDTO peopleDTO);
  PeopleDTO toPeopleDto(People people);

}
