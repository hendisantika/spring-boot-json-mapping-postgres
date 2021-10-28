package com.hendisantika.repository;

import com.hendisantika.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-json-mapping-postgres
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/21
 * Time: 17.21
 */
public interface ParentRepository extends JpaRepository<Parent, Integer> {
}
