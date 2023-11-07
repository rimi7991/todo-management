package net.javaguides.todo.service;

import net.javaguides.todo.dto.TodoDto;

import java.util.List;

public interface TodoService {

    TodoDto addTodo(TodoDto todoDto);
    TodoDto getTodo(Long id);
    List<TodoDto> getAlltodos();
    TodoDto updateTodo(TodoDto todoDto,Long id);
    void deleteTodo(Long id);
    TodoDto completedTodo(Long id);
    TodoDto inCompleteTodo(Long id);
}
