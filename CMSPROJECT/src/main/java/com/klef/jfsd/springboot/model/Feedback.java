package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback_table")
public class Feedback {
  
  @Column(nullable = false,length = 200)
  private String name;
  @Column(nullable = false,length = 200)
  private String phonenumber;
  @Id
  @Column(length = 200)
  private String email;
  @Column(nullable = false,length = 500)
  private String message;
  
}