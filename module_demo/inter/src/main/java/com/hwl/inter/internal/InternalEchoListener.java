package com.hwl.inter.internal;

import com.hwl.inter.exports.IEventListener;

import javax.xml.XMLConstants;

public class InternalEchoListener implements IEventListener<String> {
	@Override
	public void onEvent(String event) {
		System.out.printf("echo: %s.%s\n", event,XMLConstants.XML_NS_PREFIX);
	}
}
