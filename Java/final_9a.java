class A {
	final int a = 10;
	void display() {
		System.out.print("I'm Class A");
	}
}

class B extends A {
	int a = 10;
	final void display() {
		System.out.print("I'm Class A");
	}
}

class P9_1 {
	static void main (String a[]) {
	display();
	}
}