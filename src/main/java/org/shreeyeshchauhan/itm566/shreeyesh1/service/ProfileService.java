package org.shreeyeshchauhan.itm566.shreeyesh1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.shreeyeshchauhan.itm566.shreeyesh1.model.Profile;
import org.shreeyeshchauhan.itm566.shreeyesh1.database.DatabaseClass;


public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService() {
		profiles.put("Shreeyesh", new Profile(1L, "ShreeyeshC", "Shreeyesh", "Chauhan"));
		profiles.put("admin", new Profile(1L, "ShreyaJ", "Shreya", "Jadav"));
		profiles.put("user", new Profile(1L, "ShreepaC", "Shreepa", "Chauhan"));
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
