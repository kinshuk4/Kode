package com.vaani.callable;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<Integer> {

private int name;
public CallableImpl(int i){
  name = i;
}

public Integer call() {
  for(int i = 0; i < 10; i++) {
      System.out.println("Thread : " + getName() + " I is : " + i);
  }
  return new Integer(getName());

}

public int getName() {
  return name;
}

public void setMyName(int myName) {
  this.name = myName;
}

}
