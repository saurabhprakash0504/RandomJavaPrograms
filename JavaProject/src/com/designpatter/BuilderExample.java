package com.designpatter;

import java.util.stream.DoubleStream.Builder;

public class BuilderExample {
	Student s=new Student.Builder(1,"saurah").address("kankarbagh").build();
	//NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).sodium(35).carbohydrate(27).build();`
}


class Student{
	
	private final int id; //compulsory
	private final String name; //compulsory
	private final String address; //temp 
	private final int standard; //temp
	
	
	private Student(Builder builder){
		id=builder.id;
		name=builder.name;
		address=builder.address;
		standard=builder.standard;
		
	}
	
	
	public static class Builder{
	
		private final int id; //compulsory
		private final String name; //compulsory
		private String address=null; //temp 
		private int standard=0; //temp
		
		
		public Builder(int id,String name){
			this.id=id;
			this.name=name;
		}
		
		public Builder address(String address) {
			this.address=address;
			return this;
		}
		
		public Builder standard(int standard) {
			this.standard=standard;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
	}
	
	
}
