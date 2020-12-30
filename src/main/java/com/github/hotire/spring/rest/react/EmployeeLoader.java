package com.github.hotire.spring.rest.react;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EmployeeLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        employeeRepository.save(Employee.builder()
                                        .firstName("tire")
                                        .lastName("ho")
                                        .description("admin")
                                        .build());
    }
}
