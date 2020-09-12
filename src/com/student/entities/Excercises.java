/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author philipfynn
 */
@Entity
@Table(name = "EXCERCISES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Excercises.findAll", query = "SELECT e FROM Excercises e")
    , @NamedQuery(name = "Excercises.findById", query = "SELECT e FROM Excercises e WHERE e.id = :id")})
public class Excercises implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "score")
    private String score;
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StudentsData studentId;
    @JoinColumn(name = "subject", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Subject subject;
    @JoinColumn(name = "subject_teacher", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Teacher subjectTeacher;

    public Excercises() {
    }

    public Excercises(Integer id) {
        this.id = id;
    }

    public Excercises(Integer id, String score) {
        this.id = id;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public StudentsData getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentsData studentId) {
        this.studentId = studentId;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getSubjectTeacher() {
        return subjectTeacher;
    }

    public void setSubjectTeacher(Teacher subjectTeacher) {
        this.subjectTeacher = subjectTeacher;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Excercises)) {
            return false;
        }
        Excercises other = (Excercises) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.student.entities.Excercises[ id=" + id + " ]";
    }
    
}
