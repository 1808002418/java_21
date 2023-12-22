package com.hwl.impl;

import com.hwl.inter.exports.IEventListener;


public class LoginListener implements IEventListener<String> {
	@Override
	public void onEvent(String event) {
		System.out.printf("login: %s\n", event);
	}
}
