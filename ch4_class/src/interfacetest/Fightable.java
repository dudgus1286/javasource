package interfacetest;

//인터페이스는 다른 인터페이스 여러개와 상속(extends) 가능
// 클래스는 클래스끼리 단일상속(extends), 인터페이스와는 다중상속(implements)
public interface Fightable extends Movable, Attackable {}
