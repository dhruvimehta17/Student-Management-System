package com.example.studentService.dto;

public class AssignmentDTO {
    private Long id;
    private Long studentId;
    private String title;
    private String description;
    private String dueDate;

    // Constructors
    public AssignmentDTO() {}

    public AssignmentDTO(Long id, Long studentId, String title, String description, String dueDate) {
        this.id = id;
        this.studentId = studentId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
