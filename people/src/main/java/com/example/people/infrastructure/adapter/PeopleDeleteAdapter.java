package com.example.people.infrastructure.adapter;

import com.example.people.domain.service.PeopleDeleteService;
import com.example.people.infrastructure.mapper.PeopleMapper;
import com.example.people.infrastructure.repository.PeopleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PeopleDeleteAdapter implements PeopleDeleteService {
  private final PeopleRepository peopleRepository;
  private final PeopleMapper peopleMapper;
  @Override
  public void deletePeople(Integer id) {
    peopleRepository.deleteById(id);



  }
}
