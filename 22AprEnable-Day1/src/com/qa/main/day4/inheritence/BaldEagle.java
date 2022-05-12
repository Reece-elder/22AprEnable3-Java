package com.qa.main.day4.inheritence;

// If BaldEagle extends eagle.. we need a constructor to make our eagle
public class BaldEagle extends Eagle {
	
	// Attribute specifically for this Eagle
	private boolean bald; 
	
	// toString which overrides the original toString
	@Override // You don't NEED to add Override, but is useful for other developers 
	public String screech() {
		return "CACAW IM BALD! D:";
	}

	public BaldEagle(String featherColour, String diet, int wingspan, int eyesight, boolean bald) {
		super(featherColour, diet, wingspan, eyesight);
		this.bald = bald;
	}
	
	


}
