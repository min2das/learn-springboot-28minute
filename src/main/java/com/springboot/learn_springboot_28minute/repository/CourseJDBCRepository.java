package com.springboot.learn_springboot_28minute.repository;

import com.springboot.learn_springboot_28minute.model.Course;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {
    private final JdbcTemplate jdbcTemplate;

    public CourseJDBCRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    private static final String INSERT_QUERY = """
        insert into course (id, name, AUTHOR) values(?,  ?, ?);
        """;
    private static final String SELECT_QUERY = """
        select * from course where id = ?;
        """;
    public int insert() {
        return jdbcTemplate.update(INSERT_QUERY,
                1, "coursename", "authorname" );
    }
    public Course findById(int id) {
        return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id);
    }
}
