package com.amigoscode;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {
    private final SoftwareEngineeerRepository softwareEngineeerRepository;

    public SoftwareEngineerService(SoftwareEngineeerRepository softwareEngineeerRepository) {
        this.softwareEngineeerRepository = softwareEngineeerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineeerRepository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineeerRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineerByI(Integer id) {
        return softwareEngineeerRepository.findById(id).orElseThrow(() -> new IllegalStateException(id+" not found"));
    }
}
