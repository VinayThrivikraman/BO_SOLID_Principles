package com.ilp.entity;

public class Player extends User {
	private int xp;
	private int gems;
	private String language;

	public Player(String username, String password, int xp, int gems, String language) {
		super(username, password);
		this.xp = xp;
		this.gems = gems;
		this.language = language;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getGems() {
		return gems;
	}

	public void setGems(int gems) {
		this.gems = gems;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
