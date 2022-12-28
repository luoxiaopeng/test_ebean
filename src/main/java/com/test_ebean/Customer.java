package com.test_ebean;

import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
public class Customer {

    @Id
    long id;

    String name;

    // getters and setters
}