package com.oops.impl;

public class Mobile {
	public void airtelActions(ISim action)
	{
		action.calling();
		action.sms();		
	}
	public void ideaActions(ISimVoiceAndCalling action)
	{
		action.calling();
		action.sms();
		action.videoCalling();
	}

}
