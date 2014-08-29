package com.enlightendev.spring.datarest.domain;

import com.google.common.base.Objects;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "tags")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String category;

    protected Tag() {
    }

    public Tag(String name, String category, String description) {
        this.name = name;
        this.category = category;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    /**
     * Two Tags will generate the same hashcode if they have exactly the same
     * values for their name and description.
     */
    @Override
    public int hashCode() {
        // Google Guava provides great utilities for hashing
        return Objects.hashCode(name, description);
    }

    /**
     * Two Tags are considered equal if they have exactly the same values for
     * their name and description.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Tag) {
            Tag other = (Tag) obj;
            // Google Guava provides great utilities for equals too!
            return Objects.equal(name, other.name)
                    && Objects.equal(description, other.description);
        } else {
            return false;
        }
    }
}
