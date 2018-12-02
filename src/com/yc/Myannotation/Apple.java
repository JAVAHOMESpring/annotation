package com.yc.Myannotation;

import com.yc.Myannotation.FruitColor.Color;

public class Apple {
	@FruitName(name="苹果")
	private String  name; 
	@FruitColor(color=Color.red)
	private String color;
	@FruitProvider(ID=1,name="红富士集团",address="陕西省西安市红军南路4号")
	private String provider;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	public void show(){
		System.out.println("水果类型是：苹果");
	}

}
