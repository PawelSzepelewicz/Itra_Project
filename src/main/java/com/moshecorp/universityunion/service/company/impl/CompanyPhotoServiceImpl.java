package com.moshecorp.universityunion.service.company.impl;

import com.cloudinary.Cloudinary;
import com.moshecorp.universityunion.model.company.CompanyPhoto;
import com.moshecorp.universityunion.repository.company.CompanyPhotoRepository;
import com.moshecorp.universityunion.service.company.CompanyPhotoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.String.format;

@Service
@Transactional
@AllArgsConstructor
public class CompanyPhotoServiceImpl implements CompanyPhotoService {

    @Autowired
    CompanyPhotoRepository companyPhotoRepository;

    @Override
    public List<String> getPhotoUrlListByCompanyId(Long companyId) {
        return (List<String>) companyPhotoRepository.getAllByCompanyId(companyId).stream().map(ph -> {return ph.getPhotoUrl();});
    }

    @Override
    public List<CompanyPhoto> getAllByCompanyId(Long companyId) {
        return companyPhotoRepository.getAllByCompanyId(companyId);
    }

    public void sendPhotoToCloudStorage(MultipartFile file, Long companyId) { //utw
        Map<String, String> credentials = new HashMap<>();
        credentials.put("cloud_name", "itracourse");
        credentials.put("api_key", "852218272247124");
        credentials.put("api_secret", "2MPV2kthcxl9bbVpf_ExI6G-Vj4");
        Cloudinary cloudinary = new Cloudinary(credentials);
        try {
            Map resultUrl = cloudinary.uploader().upload(file.getBytes(),
                    Map.of("public_id", format("company/company_%s/%s", companyId, file.getOriginalFilename())));
            companyPhotoRepository.save(new CompanyPhoto(companyId, resultUrl.get("secure_url").toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveCompanyPhotos(List<CompanyPhoto> companyPhotoList) {

    }
}
