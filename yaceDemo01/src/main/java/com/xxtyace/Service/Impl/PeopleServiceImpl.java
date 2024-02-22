package com.xxtyace.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xxtyace.Common.Result;
import com.xxtyace.Entity.People;
import com.xxtyace.Mapper.PeopleMapper;
import com.xxtyace.Service.PeopleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.xxtyace.Common.ResultCode.BIZ_ERROR;


@Slf4j
@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public int insertPeople(People people) {
        String id = people.getId();
        if (peopleMapper.selectById(id) != null){
            log.info("当前ID: {}已存在", id);
            return 0;
        }
        peopleMapper.insert(people);
        return 1;
    }

    @Override
    public People findById(String id) {
        People people = peopleMapper.selectById(id);
        if (people == null){
            log.info("当前ID: {}不存在，查找失败", id);
            return null;
        }
        return people;
    }

    @Override
    public Result<List<People>> findAll() {
        List<People> people = new ArrayList<>();
        QueryWrapper queryWrapper = new QueryWrapper<>();
        List<People> list = peopleMapper.selectList(queryWrapper);
        return Result.success(list);
    }

    @Override
    public Result update(People people) {
        return null;
    }
}
