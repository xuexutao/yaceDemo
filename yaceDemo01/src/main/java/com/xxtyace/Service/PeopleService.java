package com.xxtyace.Service;

import com.xxtyace.Common.Result;
import com.xxtyace.Entity.People;

public interface PeopleService {

    People findById(String id);

    Result findAll();

    int insertPeople(People people);

    Result update(People people);

}
