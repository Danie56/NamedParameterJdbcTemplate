package com.example.people.application;

import com.example.people.domain.entites.People;
import com.example.people.domain.service.PeopleUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PeopleUpdate {

  private final PeopleUpdateService peopleUpdateService;

  public void updatePeople(People people) {

    peopleUpdateService.peopleUpdate(people);
  }


}
