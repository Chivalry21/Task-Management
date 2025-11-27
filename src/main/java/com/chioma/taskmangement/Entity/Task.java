package com.taskListManagementApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Entity
@Data

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String title;
    private String description;
    private boolean completed;



}
