package com.jobapp.JobApp.service;

import com.jobapp.JobApp.model.JobPost;
import com.jobapp.JobApp.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    private JobRepository repository;

    @Autowired
    public void setRepository(JobRepository repository) {
        this.repository = repository;
    }

    public void addJobPost(JobPost jp) {
        repository.addJobPost(jp);
    }
}
