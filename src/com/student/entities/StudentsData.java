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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "STUDENTS_DATA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StudentsData.findAll", query = "SELECT s FROM StudentsData s")
    , @NamedQuery(name = "StudentsData.findById", query = "SELECT s FROM StudentsData s WHERE s.id = :id")})
public class StudentsData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Lob
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Basic(optional = false)
    @Lob
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Lob
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Lob
    @Column(name = "parent_mobile")
    private String parentMobile;
    @Basic(optional = false)
    @Lob
    @Column(name = "parent_email")
    private String parentEmail;
    @Basic(optional = false)
    @Lob
    @Column(name = "guardian_address")
    private String guardianAddress;
    @Basic(optional = false)
    @Lob
    @Column(name = "guardian_email")
    private String guardianEmail;
    @Basic(optional = false)
    @Lob
    @Column(name = "guardian_mobile")
    private String guardianMobile;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentId")
    private List<Excercises> excercisesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentId")
    private List<Behaviour> behaviourList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentId")
    private List<Attendance> attendanceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentId")
    private List<FinalExam> finalExamList;
    @JoinColumn(name = "gender", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Gender gender;

    public StudentsData() {
    }

    public StudentsData(Integer id) {
        this.id = id;
    }

    public StudentsData(Integer id, String name, String dateOfBirth, String email, String address, String parentMobile, String parentEmail, String guardianAddress, String guardianEmail, String guardianMobile) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.address = address;
        this.parentMobile = parentMobile;
        this.parentEmail = parentEmail;
        this.guardianAddress = guardianAddress;
        this.guardianEmail = guardianEmail;
        this.guardianMobile = guardianMobile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParentMobile() {
        return parentMobile;
    }

    public void setParentMobile(String parentMobile) {
        this.parentMobile = parentMobile;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public String getGuardianAddress() {
        return guardianAddress;
    }

    public void setGuardianAddress(String guardianAddress) {
        this.guardianAddress = guardianAddress;
    }

    public String getGuardianEmail() {
        return guardianEmail;
    }

    public void setGuardianEmail(String guardianEmail) {
        this.guardianEmail = guardianEmail;
    }

    public String getGuardianMobile() {
        return guardianMobile;
    }

    public void setGuardianMobile(String guardianMobile) {
        this.guardianMobile = guardianMobile;
    }

    @XmlTransient
    public List<Excercises> getExcercisesList() {
        return excercisesList;
    }

    public void setExcercisesList(List<Excercises> excercisesList) {
        this.excercisesList = excercisesList;
    }

    @XmlTransient
    public List<Behaviour> getBehaviourList() {
        return behaviourList;
    }

    public void setBehaviourList(List<Behaviour> behaviourList) {
        this.behaviourList = behaviourList;
    }

    @XmlTransient
    public List<Attendance> getAttendanceList() {
        return attendanceList;
    }

    public void setAttendanceList(List<Attendance> attendanceList) {
        this.attendanceList = attendanceList;
    }

    @XmlTransient
    public List<FinalExam> getFinalExamList() {
        return finalExamList;
    }

    public void setFinalExamList(List<FinalExam> finalExamList) {
        this.finalExamList = finalExamList;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
        if (!(object instanceof StudentsData)) {
            return false;
        }
        StudentsData other = (StudentsData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.student.entities.StudentsData[ id=" + id + " ]";
    }
    
}
