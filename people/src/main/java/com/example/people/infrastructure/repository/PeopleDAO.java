package com.example.people.infrastructure.repository;


import com.example.people.domain.entites.People;
import com.example.people.infrastructure.mapper.PeopleRowMapper;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class PeopleDAO {

  private final String INSERT = "insert into peopledto (id, age, name) values (:id, :age, :name)";
  private final String GET = "SELECT * FROM peopledto WHERE id = :id";
  private final String GET_ALL = "SELECT * FROM peopledto";
  private final String DELETE = "DELETE FROM peopledto WHERE id = :id";


  @Autowired
  private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

  public People saveByParameter(final People people) {

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

  public People getPeopleById(Integer id) {

    SqlParameterSource parameters = new MapSqlParameterSource()
        .addValue("id", id);

    return namedParameterJdbcTemplate.queryForObject(GET, parameters, new PeopleRowMapper());
  }

  public List<People> getAll() {
    List<People> peoples = namedParameterJdbcTemplate.query(GET_ALL, new
        BeanPropertyRowMapper<>(People.class));

    return peoples;
  }

  public void deletePeopleById(int id) {
    SqlParameterSource parameters = new MapSqlParameterSource()
        .addValue("id", id);
    namedParameterJdbcTemplate.update(DELETE, parameters);
  }
}
