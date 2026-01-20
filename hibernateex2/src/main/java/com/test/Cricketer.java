package com.test;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("cricketer")
public class Cricketer extends Player {
   @Override
	public String toString() {
		return "Cricketer [type=" + type + ", jerseynumber=" + jerseynumber + "]";
	}
   private String type;
   private String jerseynumber;
   public Cricketer() {
	   super();
   }
   public Cricketer(int id,String name,String type, String jerseynumber) {
	   super(id,name);
	   this.type=type;
	   this.jerseynumber=jerseynumber;
   }
   public Cricketer(int id,String name) {
	   super(id,name);
   }
   public String getType() {
	return type;
   }
   public void setType(String type) {
	this.type = type;
   }
   public String getJerseynumber() {
	return jerseynumber;
   }
   public void setJerseynumber(String jerseynumber) {
	this.jerseynumber = jerseynumber;
   }
}
