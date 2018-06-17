package com.mjz.controller.test;

import com.mjz.controller.BaseController;
import com.mjz.entities.Emp;
import com.mjz.model.BaseResponseData;
import com.mjz.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/17
 */
@RestController
@RequestMapping("emp")
public class EmpController extends BaseController {

    @Autowired
    private EmpService empService;

    @RequestMapping("add/{id}/{name}")
    @ResponseBody
    private ResponseEntity<BaseResponseData> addEmp(@PathVariable("id") String id,
                                                      @PathVariable("name") String name){
        empService.add(id, name);
        return success(true);
    }

    @RequestMapping("queryEmps")
    @ResponseBody
    private ResponseEntity<BaseResponseData> queryEmps(){
        List<Emp> empList = empService.queryEmps();
        return success(empList);
    }

    @RequestMapping("queryEmp/{id}")
    @ResponseBody
    private ResponseEntity<BaseResponseData> queryEmp(@PathVariable("id") String id){
        Emp emp = empService.queryEmp(id);
        return success(emp);
    }

    @RequestMapping("updateEmp/{id}/{name}")
    @ResponseBody
    private ResponseEntity<BaseResponseData> updateEmp(@PathVariable("id") String id,
                                                       @PathVariable("name") String name){
        empService.updateEmp(id, name);
        return success(true);
    }

    @RequestMapping("deleteEmp/{id}")
    @ResponseBody
    private ResponseEntity<BaseResponseData> deleteEmp(@PathVariable("id") String id){
        empService.deleteEmp(id);
        return success(true);
    }

}
