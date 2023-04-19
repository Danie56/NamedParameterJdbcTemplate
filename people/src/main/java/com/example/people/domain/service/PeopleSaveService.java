package com.example.people.domain.service;

import com.example.people.domain.entites.People;
import com.example.people.infrastructure.dto.PeopleDTO;

public interface PeopleSaveService {

  People savePeople(People people);

}
