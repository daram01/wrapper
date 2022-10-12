package wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		// 기본형 -> 기본형 
		// 참조형 -> 참조형 (상속)
		// 기본형 -> 참조형 (불가능) 인데,
		// 기본형 -> 참조형을 가능하게 해주는 것이  wrapper 클래스이다.
		
		//wrapper Class : 기본형과 참조형간의 형변환(박싱, 언박싱 = 통칭해서 오토박싱)
		//박싱 : 기본형 -> 참조형
		//언박싱 : 참조형 -> 기본형 
		
		int i = 10;
		Integer intg = i; // 기본형을 참조형으로 바꾸는 것. 박싱 // (Integer)i; // new Integer(i);
		
		Integer intg2 = new Integer(10);
		int i2 = intg2; // 참조형을 기본형으로 바꾸는 것. 언박싱
		
		
		System.out.println(intg); //10
		System.out.println(i2); //10
		System.out.println(intg+i2); //20
		
		//Object obj = (Object)i; // 오브젝트형도 박싱은 가능함.
		//int i3 = obj; // 언박싱은 불가하다.
		
		String str = "50";
		//문자열을 숫자로 바꾸고 싶을 때 ★ 굉장히 많이 쓰임.
		int i4 = Integer.parseInt(str);
		System.out.println(i4); //50
		// a50을 넣었을 때, NumberFormatException 라는 오류가 발생.
		
	}

}
