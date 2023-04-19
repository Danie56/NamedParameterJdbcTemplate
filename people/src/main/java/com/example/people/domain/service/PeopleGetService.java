package com.example.people.domain.service;

import com.example.people.domain.entites.People;
import java.util.List;

public interface PeopleGetService {

  People getPeople(Integer id);

  List<People> getPeopleAll();

}
