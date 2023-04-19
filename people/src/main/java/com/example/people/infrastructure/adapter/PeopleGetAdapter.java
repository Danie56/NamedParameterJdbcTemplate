package com.example.people.infrastructure.adapter;

import com.example.people.domain.entites.People;
import com.example.people.domain.service.PeopleGetService;
import com.example.people.infrastructure.dto.PeopleDTO;
import com.example.people.infrastructure.mapper.PeopleMapper;
import com.example.people.infrastructure.repository.PeopleRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PeopleGetAdapter implements PeopleGetService {
  private final PeopleRepository peopleRepository;
  private final PeopleMapper peopleMapper;
  @Override
  public People getPeople(Integer id) {

    Optional<PeopleDTO> peopleDTOOptional = peopleRepository.findById(id);
    return peopleMapper.toPeopleEntity(peopleDTOOptional.get());
  }

  @Override
  public List<People> getPeopleAll() {

    List<PeopleDTO> peoples = peopleRepository.findAll();
    return peoples.stream().map(peopleMapper::toPeopleEntity).toList();


  }
}
