package com.jobapp.JobApp;

import com.jobapp.JobApp.model.JobPost;
import com.jobapp.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    JobService service;

    @Autowired
    public void setService(JobService service) {
        this.service = service;
    }

    @RequestMapping({"/", "home"})
    public String home(){
        return "home";
    }

    @RequestMapping("addjob")
    public String addJob() {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleSubmit(JobPost jobPost){
        service.addJobPost(jobPost);
        return "success";
    }
}
