package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Branchmanager_table")
public class BranchManager
{
  @Id
  @GeneratedValue
   private int id;
  @Column(nullable=false,length = 200)
   private String name;
  @Column(nullable = false,length = 10)
   private String gender;
  @Column(nullable = false,length = 10)
   private String location;
  @Column(nullable = false,unique = true,length = 200)
  private String emailid;
  @Column(nullable = false,unique = true,length = 200)
   private String username;
  @Column(nullable = false,length = 200)
   private String password;
  @Column(nullable = false,length = 200)
  private String contactno;
  @Column(nullable = false,length = 200)
  private String branch;
  
public int getId() {
  return id;
}
public void setId(int id) {
  this.id = id;
}
public String getName() {
  return name;
}
public void setName(String name) {
  this.name = name;
}
public String getGender() {
  return gender;
}
public void setGender(String gender) {
  this.gender = gender;
}
public String getLocation() {
  return location;
}
public void setLocation(String location) {
  this.location = location;
}
public String getEmailid() {
  return emailid;
}
public void setEmailid(String emailid) {
  this.emailid = emailid;
}
public String getUsername() {
  return username;
}
public void setUsername(String username) {
  this.username = username;
}
public String getPassword() {
  return password;
}
public void setPassword(String password) {
  this.password = password;
}
public String getContactno() {
  return contactno;
}
public void setContactno(String contactno) {
  this.contactno = contactno;
}
public String getBranch() {
  return branch;
}
public void setBranch(String branch) {
  this.branch = branch;
}
@Override
public String toString() {
  return "BranchManager [id=" + id + ", name=" + name + ", gender=" + gender + ", location=" + location + ", emailid="
      + emailid + ", username=" + username + ", password=" + password + ", contactno=" + contactno + ", branch="
      + branch + "]";
}


}