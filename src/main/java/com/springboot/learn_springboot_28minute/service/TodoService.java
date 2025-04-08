package com.springboot.learn_springboot_28minute.service;

import com.springboot.learn_springboot_28minute.model.Todo;
import com.springboot.learn_springboot_28minute.repository.TodoRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private TodoRepository todoRepository;
    public TodoService(TodoRepository todoRepository){
        this.todoRepository=todoRepository;
    }



    public List<Todo> findByUsername(String username){
        List<Todo> todos = todoRepository.findByUsername(username);
       return todos;
//        Predicate<? super Todo> predicate =
//                todo -> todo.getUsername().equalsIgnoreCase(username);
//        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(0, username, description, LocalDate.now().plusYears(1), false);
        todoRepository.save(todo);
    }

    public void deleteById(int id) {
        //todo.getId() == id
        // todo -> todo.getId() == id
//        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//        todos.removeIf(predicate);
        todoRepository.deleteById(id);
    }

    public Optional<Todo> findById(int id) {
//        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//        Todo todo = todos.stream().filter(predicate).findFirst().get();
//        return todo;

       return todoRepository.findById(id);
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todoRepository.save(todo);
    }
}
