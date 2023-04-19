package com.example.people.infrastructure.adapter;

import com.example.people.domain.entites.People;
import com.example.people.domain.service.PeopleGetService;
import com.example.people.infrastructure.mapper.PeopleMapper;
import com.example.people.infrastructure.repository.PeopleDAO;
import com.example.people.infrastructure.repository.PeopleRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PeopleGetAdapter implements PeopleGetService {

  private final PeopleRepository peopleRepository;

  private final PeopleDAO peopleDAO;
  private final PeopleMapper peopleMapper;

  @Override
  public People getPeople(Integer id) {

    //Optional<PeopleDTO> peopleDTOOptional = peopleRepository.findById(id);
    //return peopleMapper.toPeopleEntity(peopleDTOOptional.get());
    return peopleDAO.getPeopleById(id);
  }

  @Override
  public List<People> getPeopleAll() {

    //List<PeopleDTO> peoples = peopleRepository.findAll();
    //return peoples.stream().map(peopleMapper::toPeopleEntity).toList();

    return peopleDAO.getAll();


  }
}
