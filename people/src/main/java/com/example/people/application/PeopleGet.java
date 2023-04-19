package com.example.people.application;

import com.example.people.domain.entites.People;
import com.example.people.domain.service.PeopleGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service

public class PeopleGet {


  private final PeopleGetService peopleGetService;
  public People getPeople(Integer id){

    return peopleGetService.getPeople(id);
  }
  public List<People> getPeopleAll(){

    return peopleGetService.getPeopleAll();
  }



  





}
