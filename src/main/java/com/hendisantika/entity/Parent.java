package com.hendisantika.entity;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-json-mapping-postgres
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/21
 * Time: 17.15
 */

import lombok.NoArgsConstructor;
import org.hibernate.annotations.TypeDef;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.List;Data

@NoArgsConstructor
@Entity
@Table(name = "parents")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Parent implements Serializable {

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Integer id;

    @Column(length = 32, nullable = false)
    private String name;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private List<Child> children;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Bio bio;

    public Parent(String name, List children, Bio bio) {
        this.name = name;
        this.children = children;
        this.bio = bio;
    }
}
