package com.chioma.taskmangement.repository;

import com.chioma.taskmangement.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryTask extends JpaRepository<Task, Integer> {


}
