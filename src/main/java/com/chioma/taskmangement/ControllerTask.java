package com.taskListManagementApp;

import com.taskListManagementApp.Entity.Task;
import com.taskListManagementApp.repository.RepositoryTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("task")

public class ControllerTask {

    @Autowired
    private RepositoryTask repository;

    @PostMapping
    public Task creat(@RequestBody Task task){
        task.setCompleted(false);
        return repository.save(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Integer id, @RequestBody Task task){
        Task tasking = repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Task not found"));
        task.setTitle(task.getTitle());
        task.setDescription(task.getDescription());
        task.setCompleted(task.isCompleted());
        return repository.save(tasking);

    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Integer id){
        repository.findById(id)
                .orElseThrow(() ->new RuntimeException("Task not found"));
        repository.deleteById(id);
        return "Task deleted";
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Integer id){
        return repository.findById(id)
                .orElseThrow(() ->new RuntimeException("Task not found"));

    }

    @GetMapping("/task")
    public List<Task> getAllTasks(){
        return repository.findAll();
    }

}
