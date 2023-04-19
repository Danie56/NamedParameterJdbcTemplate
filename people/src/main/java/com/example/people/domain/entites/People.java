package com.example.people.domain.entites;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class People {

  private Integer id;
  private String name;
  private String age;


}
