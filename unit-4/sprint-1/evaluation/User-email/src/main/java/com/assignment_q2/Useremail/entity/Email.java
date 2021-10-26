package com.assignment_q2.Useremail.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(uniqueConstraints={@UniqueConstraint(columnNames = {"mail_id","email"})})
public class Email {
    @Id
    @GeneratedValue
    Integer mail_id;
    String email;
    String created_date;



}
