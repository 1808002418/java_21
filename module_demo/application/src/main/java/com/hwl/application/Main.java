package com.hwl.application;

import com.hwl.impl.LoginListener;
import com.hwl.inter.exports.IEventListener;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.ServiceLoader;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
		testDirect();
		System.out.println();
		testSPI();
	}

	private static void testDirect() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		var listeners = new ArrayList<IEventListener<String>>();
		listeners.add(new LoginListener());
		// compile error: listeners.add(new ReflectEchoListener());
		listeners.add((IEventListener<String>) Class.forName("com.hwl.inter.internal.InternalEchoListener").getDeclaredConstructor().newInstance());
		listeners.forEach(l -> l.onEvent("Direct Mode"));
	}

	private static void testSPI() {
		var listeners = ServiceLoader.load(IEventListener.class).stream().map(ServiceLoader.Provider::get).toList();
		// compile error: listeners.add(new InternalEchoListener());
		// compile error: listeners.add(new SpiEchoListener());
		listeners.forEach(l -> l.onEvent("SPI Mode"));
	}
}
