package interfaceexxample;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class TestClass extends Testabs {
	int i;

	public static void main(String[] str) {
		TestClass obj = new  TestClass();
		obj.file();
	}

	@Override
	void file() {
		i = 100;
	}

	@Override
	void callme() {
		
	}
}

abstract class Testabs {
	int i;

	abstract void callme();
	
	void file(){
		callme();
		i = 100;
	}
}
