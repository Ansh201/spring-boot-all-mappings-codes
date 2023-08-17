package com.mapping.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(mappedBy = "department")
    @JsonManagedReference
    private Manager manager;

    @OneToMany(mappedBy = "department")
    @JsonIgnore
    private List<Employee> employees;

    @ManyToMany(mappedBy = "departments")
    @JsonBackReference
    private List<Project> projects;

    // Getter and setter for manager
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    // Getters and setters for other fields
}