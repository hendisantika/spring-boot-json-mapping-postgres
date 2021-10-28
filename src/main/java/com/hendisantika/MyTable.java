package com.hendisantika;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-json-mapping-postgres
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/21
 * Time: 16.42
 */
@Entity
@Table(name = "MY_TABLE", schema = "public")
@org.hibernate.annotations.TypeDef(name = "JsonType", typeClass = JsonType.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data")
    @Type(type = "JsonType")
    private Person data;
}
