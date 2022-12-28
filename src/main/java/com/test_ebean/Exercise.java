package com.test_ebean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Setter
@Getter
// @Accessors(fluent = true)
public class Exercise {
    @Id
    // @GeneratedValue()
    long id;

    // @Column
    String name;

    // @JoinColumn
    String brief;
}
