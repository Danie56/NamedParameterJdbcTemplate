package com.example.people.application;

import com.example.people.domain.service.PeopleDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PeopleDelete {

  private final PeopleDeleteService peopleDeleteService;
  public void peopleDelete (Integer id){
    peopleDeleteService.deletePeople(id);



  }

}
