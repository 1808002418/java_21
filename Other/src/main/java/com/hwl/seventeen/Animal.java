package com.hwl.seventeen;

public sealed abstract class Animal
		permits Cat, Dog {
	abstract void eat();
}
