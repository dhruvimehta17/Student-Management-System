package com.example.studentService.dto;

public class AttendanceDTO {
    private Long id;
    private Long studentId;
    private String date;
    private Boolean present;

    // Constructors
    public AttendanceDTO() {}

    public AttendanceDTO(Long id, Long studentId, String date, Boolean present) {
        this.id = id;
        this.studentId = studentId;
        this.date = date;
        this.present = present;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getDate() {
        return date;
    }

    public Boolean getPresent() {
        return present;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPresent(Boolean present) {
        this.present = present;
    }
}
