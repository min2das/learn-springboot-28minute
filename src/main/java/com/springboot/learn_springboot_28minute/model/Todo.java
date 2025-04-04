package com.springboot.learn_springboot_28minute.model;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
public class Todo {

    private int id;
    private  String username;
    @Size(min=10, message="Enter atleast 10 characters")
    private String description;
    private LocalDate targetDate;
    private boolean done;
}
