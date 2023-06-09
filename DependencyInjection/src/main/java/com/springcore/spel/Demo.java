package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{10+20}")
	private int x;
	
	@Value("#{T(java.lang.Integer).MAX_VALUE}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(361)}")
	private double z;
	
	@Value("Sayan")
	private String name;
	
	@Value("#{true}")
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", isActive=" + isActive + "]";
	}

	

	

}
