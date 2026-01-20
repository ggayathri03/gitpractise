package com.test;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Tennis_Player")
public class TennisPlayer extends Player {
  private int noOfMatches;
  private int wonMatches;
  public TennisPlayer() {
	  super();
  }
  public TennisPlayer(int id,String name) {
	  super(id,name);
  }
  @Override
public String toString() {
	return "TennisPlayer [noOfMatches=" + noOfMatches + ", wonMatches=" + wonMatches + "]";
}
  public int getNoOfMatches() {
	return noOfMatches;
}
  public void setNoOfMatches(int noOfMatches) {
	this.noOfMatches = noOfMatches;
  }
  public int getWonMatches() {
	return wonMatches;
  }
  public void setWonMatches(int wonMatches) {
	this.wonMatches = wonMatches;
  }
  public TennisPlayer(int id,String name,int noOfmatches,int wonMatches) {
	  super(id,name);
	  this.noOfMatches=noOfMatches;
	  this.wonMatches=wonMatches;
  }
}
