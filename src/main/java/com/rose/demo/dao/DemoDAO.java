package com.rose.demo.dao;

import com.rose.demo.entity.DemoUser;
import net.paoding.rose.jade.annotation.DAO;
import net.paoding.rose.jade.annotation.SQL;
import net.paoding.rose.jade.annotation.SQLParam;

import java.util.List;

@DAO
public interface DemoDAO {

    @SQL("select id,name from test limit 1")
    public List<DemoUser> getList();

    @SQL("insert into test(id, name) values (:id, :name)")
    public int insertUser (@SQLParam("id") Long id, @SQLParam("name") String name);

    @SQL("update test set name = 1")
    public void updateUser ();

    @SQL("delete from test where id = :id")
    public void deleteUser(@SQLParam("id") Long id);
}
