package com.fastcampus.javaoop.logic;

import java.util.List;

/*
 * SOLID 원칙
 *   - Single Responsibility Principle (단일 책임 원칙)
 *     : 모든 클래스는 각각 하나의 책임만 가져야 한다.
 *     : 클래스는 그 책임을 완전히 캡슐화해야 함을 말한다.
 *   - Open Closed Principle (개방-폐쇄 원칙)
 *     : 확장에는 열려있고 수정에는 닫혀있는. 기존의 코드를 변경하지 않으면서( Closed), 기능을 추가할 수 있도록(Open) 설계가 되어야 한다는 원칙을 말한다.
 *     : ex) 캐릭터를 하나 생성한다고 할때, 각각의 캐릭터가 움직임이 다를 경우 움직임의 패턴 구현을 하위 클래스에 맡긴다면
 *           캐릭터 클래스의 수정은 필요가없고(Closed) 움직임의 패턴만 재정의 하면 된다.(Open)
 *   - Liskov Substitution Principle (리스코프 치환 원칙)
 *     : 자식 클래스는 언제나 자신의 부모 클래스를 대체할 수 있다는 원칙이다.
 *     : 부모 클래스가 들어갈 자리에 자식 클래스를 넣어도 계획대로 잘 작동해야 한다.
 *   - Interface Segregation Principle (인터페이스 분리 원칙)
 *     : 하나의 일반적인 인터페이스보다 여러개의 구체적인 인터페이스가 낫다.
 *   - Dependency Inversion Principle (의존 역전 원칙)
 *     : 의존 관계를 맺을 때 변화하기 쉬운 것 또는 자주 변화하는 것보다는 변화하기 어려운 것, 거의 변화가 없는 것에 의존하라는 것이다.
 *     : 구체적인 클래스보다 인터페이스나 추상 클래스와 관계를 맺으라는 것이다.
 */
public interface Sort <T extends Comparable<T>>{
    List<T> sort(List<T> list);
}
