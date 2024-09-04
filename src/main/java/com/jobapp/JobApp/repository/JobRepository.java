package com.jobapp.JobApp.repository;

import com.jobapp.JobApp.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JobRepository {

    @Autowired
    JdbcTemplate jdbc;
    public void addJobPost(JobPost jp) {
        String sql = "INSERT INTO jobpost VALUES (?,?,?,?,?)";
        String techs = "";

        for(String tech: jp.getPostTechStack()){
            techs = techs + tech +"  ";
        } 

        System.out.println(techs);
        int result = jdbc.update(sql,jp.getPostId(),
                jp.getPostProfile(), jp.getPostDesc(),
                jp.getReqExperience(),techs);

        System.out.println("\n\n" + result + "rows affected\n\n");
    }
}
