package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="Grounds")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Futsal {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "information_seq_gen")
    @SequenceGenerator(name = "information_seq_gen", sequenceName = "information_seq", allocationSize = 1, initialValue = 1)
    @Id
    private Integer id;

    @Column(name = "Ground_name", length = 255)
    private String groundName;

}
