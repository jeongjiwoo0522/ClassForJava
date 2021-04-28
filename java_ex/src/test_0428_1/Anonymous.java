package test_0428_1;

public class Anonymous {

	Person field = new Person() {
		
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다");
			this.work();
		}
	};
	
	void method1() {
		Person localVar = new Person() {
			
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("7에 일어납니다");
				this.walk();
			}
		};
		
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
