package com.example.demo.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProObjeto {
    @Id
    @GeneratedValue
    private Long id;
    private String nickname;
    private String id1;
    private String tecnologia1;
    private String tecnologia2;
    private String tecnologia3;
    private String tecnologia4;
    private String tecnologia5;
    private String tecnologia6;
    private String tecnologia7;
    private String devweb;
    private String experiencia;
    private String senioridade;
}
