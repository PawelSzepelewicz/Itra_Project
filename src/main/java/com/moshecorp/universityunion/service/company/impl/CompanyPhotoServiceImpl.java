package com.moshecorp.universityunion.service.company.impl;

import com.cloudinary.Cloudinary;
import com.moshecorp.universityunion.model.company.CompanyPhoto;
import com.moshecorp.universityunion.repository.company.CompanyPhotoRepository;
import com.moshecorp.universityunion.service.company.CompanyPhotoService;
import com.moshecorp.universityunion.utils.CloudinaryCredentials;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.String.format;

@Service
@Transactional
@AllArgsConstructor
public class CompanyPhotoServiceImpl implements CompanyPhotoService {

    @Autowired
    CompanyPhotoRepository companyPhotoRepository;

    @Override
    public List<String> getPhotoUrlListByCompanyId(Long companyId) {
        return companyPhotoRepository.getAllByCompanyId(companyId).stream().map(CompanyPhoto::getPhotoUrl).collect(Collectors.toList());
    }

    @Override
    public List<CompanyPhoto> getAllByCompanyId(Long companyId) {
        return companyPhotoRepository.getAllByCompanyId(companyId);
    }

    public void sendPhotoToCloudStorage(MultipartFile file, Long companyId) { //utw
        Cloudinary cloudinary = new Cloudinary(new CloudinaryCredentials().getCloudinaryCredentials());
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
