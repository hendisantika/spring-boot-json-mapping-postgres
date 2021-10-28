package com.hendisantika;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-json-mapping-postgres
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/21
 * Time: 16.43
 */
@Repository
public interface MyTableRepository extends CrudRepository<MyTable, Integer> {
}
