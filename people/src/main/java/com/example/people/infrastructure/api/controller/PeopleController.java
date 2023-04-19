package com.example.people.infrastructure.api.controller;

import com.example.people.application.PeopleDelete;
import com.example.people.application.PeopleGet;
import com.example.people.application.PeopleSave;
import com.example.people.application.PeopleUpdate;
import com.example.people.domain.entites.People;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/people")
@CrossOrigin(origins = "http://localhost:4200/")
public class PeopleController {

  private PeopleSave peopleSave;
  private PeopleGet peopleGet;

  private PeopleUpdate peopleUpdate;
  private PeopleDelete peopleDelete;

  @PostMapping("/save")

  public ResponseEntity<People> savePeople(@RequestBody People people) {

    return new ResponseEntity<>(peopleSave.peopleSave(people), HttpStatus.CREATED);
  }

  @GetMapping("/get/{id}")

  public ResponseEntity<People> getPeople(@PathVariable Integer id) {

    return new ResponseEntity<>(peopleGet.getPeople(id), HttpStatus.OK);
  }

  @PutMapping("/update")

  public void updatePeople(@RequestBody People people) {

    peopleUpdate.updatePeople(people);
  }

  @GetMapping("/getAll")
  public ResponseEntity<List<People>> PeopleGetAll() {

    return new ResponseEntity<>(peopleGet.getPeopleAll(), HttpStatus.OK);
  }

  @DeleteMapping("/delete/{id}")
  public void deletePeople(@PathVariable Integer id) {
    peopleDelete.peopleDelete(id);


  }


}
