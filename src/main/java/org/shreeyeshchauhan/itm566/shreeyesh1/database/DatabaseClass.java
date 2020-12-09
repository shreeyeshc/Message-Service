package org.shreeyeshchauhan.itm566.shreeyesh1.database;

import java.util.HashMap;
import java.util.Map;

import org.shreeyeshchauhan.itm566.shreeyesh1.model.Message;
import org.shreeyeshchauhan.itm566.shreeyesh1.model.Profile;

public class DatabaseClass {
			
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
	
}
