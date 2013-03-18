package net.travisdazell.camel.examples.pipesandfilters;

public class MessageReceiver {
  public String processMessage(String message) {
		return message + " [modified]";
	}
}
