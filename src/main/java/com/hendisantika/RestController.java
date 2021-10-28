package com.hendisantika;

import com.hendisantika.entity.Bio;
import com.hendisantika.entity.Child;
import com.hendisantika.entity.Parent;
import com.hendisantika.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static java.util.Arrays.asList;

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

    @Autowired
    private ParentRepository parentRepository;

    @GetMapping("/getData")
    public Iterable<MyTable> getData() {
        return repository.findAll();
    }

    @PostMapping("/addData")
    public void addData(@RequestBody MyTable tableData) {
        repository.save(tableData);
    }

    @GetMapping("/addData2")
    public void addData2() {
        parentRepository.save(new Parent(
                        "parent1",
                        asList(new Child("child1"), new Child("child2")),
                        new Bio("bio1")
                )
        );
    }


}
