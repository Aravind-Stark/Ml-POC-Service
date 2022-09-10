package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Model {
    @JsonProperty("Age")
	private int age;
   @JsonProperty("Sex") 
    private String sex;
   @JsonProperty("Embarked")
   private String embarked;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getEmbarked() {
	return embarked;
}
public void setEmbarked(String embarked) {
	this.embarked = embarked;
}
@Override
public String toString() {
	return "Model [age=" + age + ", sex=" + sex + ", embarked=" + embarked + "]";
}
   
   
}
