package com.example.taskmanager.controller

import com.example.taskmanager.model.Task
import com.example.taskmanager.repository.TaskRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tasks")
class TaskController(private val taskRepository: TaskRepository) {

    @GetMapping
    fun getAllTasks(): List<Task> = taskRepository.findAll()

    @PostMapping
    fun createTask(@RequestBody task: Task): Task = taskRepository.save(task)

    @PutMapping("/{id}")
    fun updateTask(@PathVariable id: Long, @RequestBody taskDetails: Task): Task {
        val task = taskRepository.findById(id).orElseThrow()
        task.title = taskDetails.title
        task.description = taskDetails.description
        return taskRepository.save(task)
    }

    @DeleteMapping("/{id}")
    fun deleteTask(@PathVariable id: Long) = taskRepository.deleteById(id)
}
