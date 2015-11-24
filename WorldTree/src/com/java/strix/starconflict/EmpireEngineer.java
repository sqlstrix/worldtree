package com.java.strix.starconflict;

import java.util.Date;
import java.util.Random;

public class EmpireEngineer implements Engineer, Ship {

	@Override
	public Integer fire() {
		return 100 + rand.nextInt(50);
	}

	@Override
	public void die() {
		this.isDead = true;
	}

	private static final Random rand = new Random(System.currentTimeMillis());
	private static final int SHIELD_RECOVERY_RATE = 30;
	
	private int hp;
	private int speed;
	private String guild;
	private int avgDamage;
	private Date creationDate;
	private boolean isDead = false;
	
	public EmpireEngineer(int hp, int speed, String guild, int avgDamage, Date creationDate) {
		this.hp = hp;
		this.speed = speed;
		this.guild = guild;
		this.avgDamage = avgDamage;
		this.creationDate = creationDate;
	}

	@Override
	public Integer heal() {
		if (isDead) {
			return 0;
		}
		return 500 + rand.nextInt(500);
	}

	@Override
	public Integer recoverShield() {
		return SHIELD_RECOVERY_RATE;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
		if (hp <= 0) {
			die();
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getGuild() {
		return guild;
	}

	public void setGuild(String guild) {
		this.guild = guild;
	}

	public int getAvgDamage() {
		return avgDamage;
	}

	public void setAvgDamage(int avgDamage) {
		this.avgDamage = avgDamage;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "EmpireEngineer [hp=" + hp + ", speed=" + speed + ", guild=" + guild + ", avgDamage=" + avgDamage
				+ ", creationDate=" + creationDate + "] " + SHIELD_RECOVERY_RATE;
	}


	
	
}
