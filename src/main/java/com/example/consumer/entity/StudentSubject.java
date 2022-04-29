package com.example.consumer.entity;

import java.io.Serializable;
import java.util.Date;
public class StudentSubject implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer studentSubjectId;
    private Date date;
    private Student studentId;

    public StudentSubject() {
    }

    public StudentSubject(Integer studentSubjectId) {
        this.studentSubjectId = studentSubjectId;
    }

    public Integer getStudentSubjectId() {
        return studentSubjectId;
    }

    public void setStudentSubjectId(Integer studentSubjectId) {
        this.studentSubjectId = studentSubjectId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentSubjectId != null ? studentSubjectId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentSubject)) {
            return false;
        }
        StudentSubject other = (StudentSubject) object;
        if ((this.studentSubjectId == null && other.studentSubjectId != null) || (this.studentSubjectId != null && !this.studentSubjectId.equals(other.studentSubjectId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StudentSubject{" +
                "studentSubjectId=" + studentSubjectId +
                ", date=" + date +
                '}';
    }
}