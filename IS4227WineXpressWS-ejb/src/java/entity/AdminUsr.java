/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ¿.¿.¿
 */
@Entity
@Table(name = "AdminUsr")
@NamedQueries({
    @NamedQuery(name = "AdminUsr.findAll", query = "SELECT a FROM AdminUsr a"),
    @NamedQuery(name = "AdminUsr.findById", query = "SELECT a FROM AdminUsr a WHERE a.id = :id"),
    @NamedQuery(name = "AdminUsr.findByFirstName", query = "SELECT a FROM AdminUsr a WHERE a.firstName = :firstName"),
    @NamedQuery(name = "AdminUsr.findByLastName", query = "SELECT a FROM AdminUsr a WHERE a.lastName = :lastName"),
    @NamedQuery(name = "AdminUsr.findByEmail", query = "SELECT a FROM AdminUsr a WHERE a.email = :email"),
    @NamedQuery(name = "AdminUsr.findByPassword", query = "SELECT a FROM AdminUsr a WHERE a.password = :password"),
    @NamedQuery(name = "AdminUsr.findByStatus", query = "SELECT a FROM AdminUsr a WHERE a.status = :status")})
public class AdminUsr implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "firstName", length = 100)
    private String firstName;
    
    @Column(name = "lastName", length = 100)
    private String lastName;
    
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Column(name = "email", length = 100)
    private String email;
    
    @Column(name = "password", length = 45)
    private String password;
    
    @Column(name = "status")
    private Boolean status;
    
    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "adminUsr")
    private Collection<Comment> commentCollection;


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminUsr)) {
            return false;
        }
        AdminUsr other = (AdminUsr) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AdminUsr[ id=" + getId() + " ]";
    }


    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return the commentCollection
     */
    public Collection<Comment> getCommentCollection() {
        return commentCollection;
    }

    /**
     * @param commentCollection the commentCollection to set
     */
    public void setCommentCollection(Collection<Comment> commentCollection) {
        this.commentCollection = commentCollection;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
}
