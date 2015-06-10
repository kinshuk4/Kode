/*
 * Copyright (c) 2008 Morgan Stanley & Co. Incorporated, All Rights Reserved
 *
 * Unpublished copyright.  All rights reserved.  This material contains
 * proprietary information that shall be used or copied only within 
 * Morgan Stanley, except with written permission of Morgan Stanley.
 */
package hibernate;

@SuppressWarnings("unused")
public class Message {
  private Long id;
  private String text;
  private Message nextMessage;
  
  private Message() {}
  
  public Message(String text) {
     this.text = text;
  }
  public Long getId() {
     return id;
  }
  
  private void setId(Long id) {
     this.id = id;
  }
  public String getText() {
     return text;
  }
  public void setText(String text) {
     this.text = text;
  }
  public Message getNextMessage() {
     return nextMessage;
  }
  public void setNextMessage(Message nextMessage) {
     this.nextMessage = nextMessage;
  }
}
