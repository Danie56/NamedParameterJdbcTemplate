package com.example.people.infrastructure.mapper;

import com.example.people.domain.entites.People;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PeopleRowMapper implements RowMapper<People> {


  @Override
  public People mapRow(ResultSet rs, int rowNum) throws SQLException {
    People people = new People();

    people.setId(rs.getInt("id"));
    people.setName(rs.getString("name"));
    people.setAge(rs.getString("age"));

    return people;


  }
}