package com.amigoscode;

import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class SoftwareEngineerService {
    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineerDTO> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll().stream().map(SoftwareEngineerDTO::new).toList();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineerRepository.save(softwareEngineer);
    }

    public SoftwareEngineerDTO getSoftwareEngineerById(Integer id) {
        return softwareEngineerRepository.findById(id).map(SoftwareEngineerDTO::new).orElseThrow(() -> new ResponseStatusException(
                NOT_FOUND,
                "Software Engineer with id " + id + " not found"
        ));
    }

    public void updateSoftwareEngineer(Integer id, SoftwareEngineer softwareEngineer) {
        SoftwareEngineer engineer = softwareEngineerRepository
                .findById(id)
                .orElseThrow(() -> new IllegalStateException("Engineer not found"));

        engineer.setName(softwareEngineer.getName());
        engineer.setTechStack(softwareEngineer.getTechStack());

        softwareEngineerRepository.save(engineer);

    }

}
