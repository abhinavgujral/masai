package com.assignment_q2.Useremail.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(uniqueConstraints={@UniqueConstraint(columnNames = {"mail_id","email"})})
public class Email {
    @Id
    Integer mail_id;
    String email;
    String created_date;



}
