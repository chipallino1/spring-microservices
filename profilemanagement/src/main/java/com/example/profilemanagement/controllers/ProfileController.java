package com.example.profilemanagement.controllers;

import com.example.profilemanagement.entities.Profile;
import com.example.profilemanagement.services.ProfileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class ProfileController {
    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping
    public void saveEmployeeProfile(@RequestBody Profile employeeProfile) {
        profileService.addEmployeeProfile(employeeProfile);
    }

    @GetMapping
    public List<Profile> getAllEmployee() {
        return profileService.getEmployeeProfiles();
    }
}