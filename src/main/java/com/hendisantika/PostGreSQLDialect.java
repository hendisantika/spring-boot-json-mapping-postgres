package com.hendisantika;

import org.hibernate.dialect.PostgreSQL10Dialect;

import java.sql.Types;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-json-mapping-postgres
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/21
 * Time: 16.43
 */
public class PostGreSQLDialect extends PostgreSQL10Dialect {

    public PostGreSQLDialect() {

        this.registerColumnType(Types.JAVA_OBJECT, "jsonb");
    }
}
