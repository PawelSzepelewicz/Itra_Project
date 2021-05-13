package com.moshecorp.universityunion.controller;

import com.moshecorp.universityunion.model.company.CompanyInfo;
import com.moshecorp.universityunion.service.company.CompanyInfoService;
import com.moshecorp.universityunion.service.company.impl.CompanyInfoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/company")
@AllArgsConstructor
public class CompanyInfoController {

    private final CompanyInfoService service = new CompanyInfoServiceImpl();

//    @PostMapping("/get/{id}")
//    public CompanyInfo getCompanyInfoById(@PathVariable Long id){
//        return service.getByCompanyId(id);
//    }

    @CrossOrigin
    @PostMapping("/test")
    public void test(@RequestBody String someShit){
        System.out.println(someShit);
    }

    @CrossOrigin
    @GetMapping("/test")
    public String testGet(){
        return "Go fuck yourself again";
    }
}
