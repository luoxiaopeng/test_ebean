package com.test_ebean;

import java.util.List;
import java.util.Set;

import io.ebean.annotation.EnumValue;
import io.ebean.annotation.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.OrderColumn;

import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Setter
@Getter
@Accessors(fluent = true)
public class Workout extends Model {
    @Id
    @GeneratedValue()
    long id;

    @Column
    String name;

    public enum Status {
        @EnumValue("1")
        Live,
        @EnumValue("2")
        NeedToConfirm,
        @EnumValue("3")
        Confirmed
    }

    @NotNull
    Status status = Status.NeedToConfirm;

    // choices_level = [
    // (1, 'Beginner'),
    // (2, 'Intermediate'),
    // (3, 'Advanced'),
    // ]
    // Integer level = 1;

    boolean hidden = false;

    @ManyToMany
    @OrderColumn(name = "workout_exercise")
    List<Exercise> exercises;

}
