package com.example.people.infrastructure.adapter;

import com.example.people.domain.service.PeopleDeleteService;
import com.example.people.infrastructure.mapper.PeopleMapper;
import com.example.people.infrastructure.repository.PeopleDAO;
import com.example.people.infrastructure.repository.PeopleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PeopleDeleteAdapter implements PeopleDeleteService {

  private final PeopleRepository peopleRepository;
  private final PeopleMapper peopleMapper;
  private final PeopleDAO peopleDAO;

  @Override
  public void deletePeople(Integer id) {

    peopleDAO.deletePeopleById(id);


  }
}
