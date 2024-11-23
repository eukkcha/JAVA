class Parent {
	void print() {
		System.out.println("Parent 메소드 호출");
	}
}

class Child extends Parent {
	@Override
	void print() {
		System.out.println("Chicle 메소드 호출");
	}
}

public class Casting {
	public static void main(String[] args) {
		Parent p = new Child();
		p.print();
		
		// Child c = new Parent(); // 컴파일 오류.
		
		Child c = (Child)p;
		c.print();
	}
}
