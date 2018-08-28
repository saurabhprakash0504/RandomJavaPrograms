package com.clone;

class Course implements Cloneable
{
    String subject1;
 
    String subject2;
 
    String subject3;
 
    public Course(String sub1, String sub2, String sub3)
    {
        this.subject1 = sub1;
 
        this.subject2 = sub2;
 
        this.subject3 = sub3;
    }
    
    protected Object clone() throws CloneNotSupportedException {
    	return super.clone();
    }
}