package org.gregorydombchik.message_building_service_stubs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.gregorydombchik.message_building_service_stubs.database.DatabaseClass;
import org.gregorydombchik.message_building_service_stubs.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService() {
		profiles.put("greg", new Profile(1L, "gdombchik", "greg", "dombchik" ));
		profiles.put("suzy", new Profile(2L, "suzyq","suzy","q"));
	}
	
	
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values()); 
	}
	
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);
	}
	

	
	
	
}
