package com.assignment_q2.Useremail.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(uniqueConstraints={@UniqueConstraint(columnNames = {"id","mail_id"})})
public class User {
    @Id
    Integer id;
    String name;
    String phoneNo;
    String dateOfBirth;
    @OneToOne
    @JoinColumn(name = "mail_id")
    Email email;
}
