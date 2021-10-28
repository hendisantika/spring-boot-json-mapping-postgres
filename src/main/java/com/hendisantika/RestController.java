package com.hendisantika;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-json-mapping-postgres
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/21
 * Time: 16.44
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private MyTableRepository repository;

    @GetMapping("/getData")
    public Iterable<MyTable> getData() {
        return repository.findAll();
    }

    @PostMapping("/addData")
    public void addData(@RequestBody MyTable tableData) {
        repository.save(tableData);
    }

}
