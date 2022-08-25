package com.example.profilemanagement.services;

import com.example.profilemanagement.entities.Profile;

import java.util.List;

public interface ProfileService {
    void addEmployeeProfile(Profile profile);

    List<Profile> getEmployeeProfiles();
}