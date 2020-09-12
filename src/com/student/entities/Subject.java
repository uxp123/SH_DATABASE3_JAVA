/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author philipfynn
 */
@Entity
@Table(name = "SUBJECT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subject.findAll", query = "SELECT s FROM Subject s")
    , @NamedQuery(name = "Subject.findById", query = "SELECT s FROM Subject s WHERE s.id = :id")})
public class Subject implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "name_of_subject")
    private String nameOfSubject;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private List<Excercises> excercisesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private List<Timetable> timetableList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private List<FinalExam> finalExamList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private List<Teacher> teacherList;

    public Subject() {
    }

    public Subject(Integer id) {
        this.id = id;
    }

    public Subject(Integer id, String nameOfSubject) {
        this.id = id;
        this.nameOfSubject = nameOfSubject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    @XmlTransient
    public List<Excercises> getExcercisesList() {
        return excercisesList;
    }

    public void setExcercisesList(List<Excercises> excercisesList) {
        this.excercisesList = excercisesList;
    }

    @XmlTransient
    public List<Timetable> getTimetableList() {
        return timetableList;
    }

    public void setTimetableList(List<Timetable> timetableList) {
        this.timetableList = timetableList;
    }

    @XmlTransient
    public List<FinalExam> getFinalExamList() {
        return finalExamList;
    }

    public void setFinalExamList(List<FinalExam> finalExamList) {
        this.finalExamList = finalExamList;
    }

    @XmlTransient
    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
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
        if (!(object instanceof Subject)) {
            return false;
        }
        Subject other = (Subject) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.student.entities.Subject[ id=" + id + " ]";
    }
    
}
