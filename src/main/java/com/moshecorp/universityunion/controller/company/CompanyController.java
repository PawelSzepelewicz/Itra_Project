package com.moshecorp.universityunion.controller.company;

import com.moshecorp.universityunion.model.company.Company;
import com.moshecorp.universityunion.service.company.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/company")
@AllArgsConstructor
public class CompanyController {
    @Autowired
    private final CompanyService service;

    @PostMapping("/get")
    public List<Company> getAllByCategoryId(@RequestBody Long categoryId) {
        return service.getAllByCategoryId(categoryId);
    }
}
