package com.bdqn.dao;

import com.bdqn.entity.Stusinfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StusinfoDao {

    @Select("select * from stusinfo")
    public List<Stusinfo> findAll();

}
