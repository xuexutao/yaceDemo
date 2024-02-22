package com.xxtyace.Controller;


import com.xxtyace.Common.Result;
import com.xxtyace.Common.ResultCode;
import com.xxtyace.Entity.People;
import com.xxtyace.Enum.ResultCodeEnum;
import com.xxtyace.Service.PeopleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @PostMapping("/insert")
    public Result<People> insert(People people){
        int result = peopleService.insertPeople(people);
        if (result == 1){
            log.info("people插入成功");
            return Result.success();
        }
        return Result.error();
    }

    @GetMapping("/get")
    public Result getById(String id){
        People people= peopleService.findById(id);
        if (people == null){
            return Result.error();
        }
        log.info("people ->id: {} 查找成功", id);
        return Result.success();
    }
}
