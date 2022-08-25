package com.example.profilemanagement.services;

import com.example.profilemanagement.entities.Profile;
import com.example.profilemanagement.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {
    private final ProfileRepository repository;

    public ProfileServiceImpl(ProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addEmployeeProfile(Profile profile) {
        repository.save(profile);
    }

    @Override
    public List<Profile> getEmployeeProfiles() {
        return repository.findAll();
    }
}