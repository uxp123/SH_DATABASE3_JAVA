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
@Table(name = "FINAL_EXAM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FinalExam.findAll", query = "SELECT f FROM FinalExam f")
    , @NamedQuery(name = "FinalExam.findById", query = "SELECT f FROM FinalExam f WHERE f.id = :id")})
public class FinalExam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "exam_score")
    private String examScore;
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StudentsData studentId;
    @JoinColumn(name = "subject", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Subject subject;
    @JoinColumn(name = "invigilator", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Teacher invigilator;

    public FinalExam() {
    }

    public FinalExam(Integer id) {
        this.id = id;
    }

    public FinalExam(Integer id, String examScore) {
        this.id = id;
        this.examScore = examScore;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExamScore() {
        return examScore;
    }

    public void setExamScore(String examScore) {
        this.examScore = examScore;
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

    public Teacher getInvigilator() {
        return invigilator;
    }

    public void setInvigilator(Teacher invigilator) {
        this.invigilator = invigilator;
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
        if (!(object instanceof FinalExam)) {
            return false;
        }
        FinalExam other = (FinalExam) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.student.entities.FinalExam[ id=" + id + " ]";
    }
    
}
