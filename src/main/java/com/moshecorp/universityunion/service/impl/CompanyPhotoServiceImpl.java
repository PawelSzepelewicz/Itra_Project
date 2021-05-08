package com.moshecorp.universityunion.service.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;
import com.cloudinary.utils.ObjectUtils;
import com.moshecorp.universityunion.model.company.CompanyPhoto;
import com.moshecorp.universityunion.repository.company.CompanyPhotoRepository;
import com.moshecorp.universityunion.service.CompanyPhotoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
@AllArgsConstructor
public class CompanyPhotoServiceImpl implements CompanyPhotoService {

    CompanyPhotoRepository companyPhotoRepository;

    @Override
    public List<CompanyPhoto> getAllByCompanyId(Long companyId) {
        return companyPhotoRepository.getAllByCompanyId(companyId);
    }

    public void sendPhotoToCloudStorage() {
        Map<String, String> credentials = new HashMap<>();
        credentials.put("cloud_name", "itracourse");
        credentials.put("api_key", "852218272247124");
        credentials.put("api_secret", "2MPV2kthcxl9bbVpf_ExI6G-Vj4");

        Cloudinary cloudinary = new Cloudinary(credentials);
        try {
            Map resultUrl = cloudinary.uploader().upload(new File("C:/Users/pasha/Pictures/Screenshots/testImg.png"),
                    Map.of("public_id", "test_img_002"));
            System.out.println(resultUrl.get("secure_url"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
