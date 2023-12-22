package com.hwl.fifteen;

public sealed abstract class Animal
		permits Cat, Dog {
	abstract void eat();
}
