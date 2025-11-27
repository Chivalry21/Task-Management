package com.taskListManagementApp.repository;

import com.taskListManagementApp.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryTask extends JpaRepository<Task, Integer> {


}
