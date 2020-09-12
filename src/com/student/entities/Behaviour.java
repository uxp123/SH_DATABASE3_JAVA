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
@Table(name = "BEHAVIOUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Behaviour.findAll", query = "SELECT b FROM Behaviour b")
    , @NamedQuery(name = "Behaviour.findById", query = "SELECT b FROM Behaviour b WHERE b.id = :id")})
public class Behaviour implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "behaviour")
    private String behaviour;
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StudentsData studentId;

    public Behaviour() {
    }

    public Behaviour(Integer id) {
        this.id = id;
    }

    public Behaviour(Integer id, String behaviour) {
        this.id = id;
        this.behaviour = behaviour;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public StudentsData getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentsData studentId) {
        this.studentId = studentId;
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
        if (!(object instanceof Behaviour)) {
            return false;
        }
        Behaviour other = (Behaviour) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.student.entities.Behaviour[ id=" + id + " ]";
    }
    
}
