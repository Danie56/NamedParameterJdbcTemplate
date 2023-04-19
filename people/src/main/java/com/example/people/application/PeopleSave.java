package com.example.people.application;

import com.example.people.domain.entites.People;
import com.example.people.domain.service.PeopleSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PeopleSave {

  private final PeopleSaveService peopleSaveService;

  public People peopleSave(People people) {
    return peopleSaveService.savePeople(people);
  }


}
