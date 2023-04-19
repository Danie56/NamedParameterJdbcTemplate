package com.example.people.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class PeopleDTO {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Integer id;
  private String name;
  private String age;


}
