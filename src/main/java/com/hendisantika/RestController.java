package com.hendisantika;

import com.hendisantika.entity.Bio;
import com.hendisantika.entity.Child;
import com.hendisantika.entity.Parent;
import com.hendisantika.repository.ParentRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

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
@Log4j2
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

    @GetMapping("/getData2/{id}")
    public Parent getParentData(@PathVariable("id") Integer id) {
        Parent result = parentRepository.findById(id).orElseThrow();
        List<Child> children = result.getChildren();
        Bio bio = result.getBio();
        log.info("Data 1: ", result);
        log.info("Data 2: ", children);
        log.info("Data 3: ", bio);
        return result;
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
