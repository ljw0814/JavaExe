package ch09.extends04;

// 필드 또한 상속이 된다.
// 생선되는 순서 child자식 안에 부모의 정보가 있어서 
// 부모까지 생성된다??
public class ExtendsMain {
	public static void main(String[] args) {
		Child child = new Child(7, 9999L, 72);
		child.handsome();
		child.wealth();
		child.play();
		
		System.out.println("잘생김 점수 : " + child.handsomeScore);
		System.out.println("돈 : " + child.money);
		System.out.println("즐거운 날 : " + child.day);
	}
}
