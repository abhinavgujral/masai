package com.assignment_q2.Useremail.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(uniqueConstraints={@UniqueConstraint(columnNames = {"id","mail_id"})})
public class User {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    String phoneNo;
    String dateOfBirth;
    @OneToOne
    @JoinColumn(name = "mail_id")
    Email email;
}
