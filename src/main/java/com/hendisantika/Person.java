package com.hendisantika;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-json-mapping-postgres
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/21
 * Time: 16.40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    private String name;
    private int age;
    private String address;

}
