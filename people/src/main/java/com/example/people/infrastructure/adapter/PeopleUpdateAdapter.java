package com.example.people.infrastructure.adapter;

import com.example.people.domain.entites.People;
import com.example.people.domain.service.PeopleUpdateService;
import com.example.people.infrastructure.dto.PeopleDTO;
import com.example.people.infrastructure.mapper.PeopleMapper;
import com.example.people.infrastructure.repository.PeopleRepository;
import com.fasterxml.jackson.annotation.OptBoolean;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class PeopleUpdateAdapter  implements PeopleUpdateService {
  private final PeopleRepository peopleRepository;
  private final PeopleMapper peopleMapper;
  @Transactional
  @Override
  public void peopleUpdate(People people) {

    Optional<PeopleDTO> peopleDTOOptional = peopleRepository.findById(people.getId());

    if (peopleDTOOptional.isEmpty()){

      System.out.println("no se encontro");


    }else {
      peopleRepository.updatePeople(people.getId(),people.getName(),people.getAge());

    }







  }
}
