package com.moshecorp.universityunion.controller.company;

import com.moshecorp.universityunion.model.CompanyPreview;
import com.moshecorp.universityunion.model.company.Company;
import com.moshecorp.universityunion.model.company.Rating;
import com.moshecorp.universityunion.service.company.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getByRating")
    public List<CompanyPreview> getTopFiveByRating() { //utw
        return service.getTopFiveByRating();
    }

    @GetMapping("/getByTime")
    public List<CompanyPreview> getTopFiveByCreationDate() { //utw
        return service.getTopFiveByCreationDate();
    }

    @PostMapping("/getAllByUserId")
    public List<CompanyPreview> getAllByUserId(Long userId) { //utw
        return service.getAllByUserId(userId);
    }

}
