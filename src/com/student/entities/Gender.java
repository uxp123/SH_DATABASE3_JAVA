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
@Table(name = "GENDER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gender.findAll", query = "SELECT g FROM Gender g")
    , @NamedQuery(name = "Gender.findById", query = "SELECT g FROM Gender g WHERE g.id = :id")})
public class Gender implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "name_of_gender")
    private String nameOfGender;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gender")
    private List<StudentsData> studentsDataList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gender")
    private List<Teacher> teacherList;

    public Gender() {
    }

    public Gender(Integer id) {
        this.id = id;
    }

    public Gender(Integer id, String nameOfGender) {
        this.id = id;
        this.nameOfGender = nameOfGender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfGender() {
        return nameOfGender;
    }

    public void setNameOfGender(String nameOfGender) {
        this.nameOfGender = nameOfGender;
    }

    @XmlTransient
    public List<StudentsData> getStudentsDataList() {
        return studentsDataList;
    }

    public void setStudentsDataList(List<StudentsData> studentsDataList) {
        this.studentsDataList = studentsDataList;
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
        if (!(object instanceof Gender)) {
            return false;
        }
        Gender other = (Gender) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.student.entities.Gender[ id=" + id + " ]";
    }
    
}
