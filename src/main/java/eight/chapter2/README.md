## Java 8
#### 1. 함수형 인터페이스와 람다 표현식
###### 함수형 인터페이스와 람다 표현식 소개

함수형 인터페이스 (Functional Interface)

- 추상 메서드를 딱 하나만 가지고 있는 인터페이스
- SAM (Single Abstract Method) Interface
- @FunctionInterface Annotation을 가지고 있는 클래스

람다 표현식

- 함수형 인터페이스의 인스턴스를 만드는 방법으로 쓰일 수 있다.
- 코드를 줄일 수 있다.
- 메서드 매개변수, 리턴 타입, 변수로 만들어 사용할 수도 있다.

자바에서의 함수형 프로그래밍

1. 함수를 First Class Object로 사용할 수 있다.
2. 순수 함수 (Pure Function)
   - 사이드 이펙트가 없다. (함수 밖에 있는 값을 변경하지 않는다.)
   - 상태가 없다. (함수 밖에 있는 값을 사용하지 않는다.)
3. 고차 함수 (High-Order Function)
   - 함수가 함수를 매개변수로 받을 수 있고 함수를 리턴할 수도 있다.
4. 불변성