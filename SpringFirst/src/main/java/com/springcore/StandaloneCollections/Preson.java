package com.springcore.StandaloneCollections;
import java.util.*;

public class Preson {
	
	private List<String> friend;
	private Map<String , Integer> feesStructre;

	public List<String> getFriend() {
		return friend;
	}

	public void setFriend(List<String> friend) {
		this.friend = friend;
	}
	
	

	public Map<String, Integer> getFeesStructre() {
		return feesStructre;
	}

	public void setFeesStructre(Map<String, Integer> feesStructre) {
		this.feesStructre = feesStructre;
	}

	@Override
	public String toString() {
		return "Preson [friend=" + friend + ", feesStructre=" + feesStructre + "]";
	}

	
	
	

}
