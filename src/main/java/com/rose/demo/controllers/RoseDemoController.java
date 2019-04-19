package com.rose.demo.controllers;

import com.rose.demo.dao.DemoDAO;
import com.rose.demo.service.DemoService;
import net.paoding.rose.web.Invocation;
import net.paoding.rose.web.annotation.Param;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;
import net.paoding.rose.web.paramresolver.ParamMetaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

@Path("/")
public class RoseDemoController {
    @Autowired
    private DemoService demoService;

    @Autowired
    private DemoDAO demoDAO;

    @Get("getDemo")
    public String testDemo () {
        return "@" + demoService.testDemo();
    }

    @Get("insert")
    public String insertUser (@Param("id") Long id, @Param("name") String name) {

        return "@" + demoDAO.insertUser(id, name);
    }

    @Get("update")
    public String update () {
        demoDAO.updateUser();
        
        return "@update";
    }

    @Get("delete")
    public String delete (Long id, Invocation inv) {
        inv.getParameter("id");
        demoDAO.deleteUser(id);
        return "@delete";
    }
}
