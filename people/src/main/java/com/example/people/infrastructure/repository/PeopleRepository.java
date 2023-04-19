package com.example.people.infrastructure.repository;

import com.example.people.infrastructure.dto.PeopleDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<PeopleDTO, Integer> {


  @Query(nativeQuery = true, value = "update peopledto set 0 = :name, age = :age where id = :id")
  @Modifying
  void updatePeople(
      @Param("id") Integer id,
      @Param("name") String name,
      @Param("age") String age);


}
