package hackkerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class SingletonExample{
	public String str;
	private SingletonExample() {
		
	}
	static SingletonExample getSingleInstance() {
		return (new SingletonExample());
	}
}