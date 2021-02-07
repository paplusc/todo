package com.paplusc.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

  @GetMapping(value = "/tasks")
  public String getAllTasks(@RequestParam("userId") final Long id){
    return id + "it's working!";
  }
}
