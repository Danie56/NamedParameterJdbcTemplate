package com.example.people.infrastructure.adapter;

import com.example.people.domain.entites.People;
import com.example.people.domain.service.PeopleSaveService;
import com.example.people.infrastructure.mapper.PeopleMapper;
import com.example.people.infrastructure.repository.PeopleDAO;
import com.example.people.infrastructure.repository.PeopleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class PeopleSaveAdapter implements PeopleSaveService {

  private final PeopleRepository peopleRepository;
  private final PeopleDAO peopleDAO;
  private final PeopleMapper peopleMapper;


  @Override
  public People savePeople(People people) {
    //return peopleMapper.toPeopleEntity(peopleRepository.save(peopleMapper.toPeopleDto(people)));

    return peopleDAO.saveByParameter(people);
  }
}
