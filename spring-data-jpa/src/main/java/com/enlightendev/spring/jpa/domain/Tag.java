package com.enlightendev.spring.jpa.domain;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table (name = "tags")
public class Tag {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    protected Tag() {}

    public Tag(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Tag[id=%d, name='%s', description='%s']", id, name, description);
    }
}
