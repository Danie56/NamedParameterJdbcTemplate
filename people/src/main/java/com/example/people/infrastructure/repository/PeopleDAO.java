package com.example.people.infrastructure.repository;


import com.example.people.domain.entites.People;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class PeopleDAO {

  private final String INSERT = "insert into peopledto (id, age, name) values (:id, :age, :name)";

  @Autowired
  private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

  public People saveByParameter (final  People people){

    SqlParameterSource parameters = new MapSqlParameterSource()
        .addValue("id", people.getId())
        .addValue("name", people.getName())
        .addValue("age", people.getAge());

    namedParameterJdbcTemplate.execute(INSERT, parameters, new PreparedStatementCallback<Object>() {
      public Object doInPreparedStatement(
          PreparedStatement ps) throws SQLException, DataAccessException {
        return ps.executeUpdate();
      }
    });

    return people;


  }




}
