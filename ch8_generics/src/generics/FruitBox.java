package generics;

// 제한된 지네릭 클래스
// T extends Fruit : 특정 타입(Fruit)과 그 타입의 자손들만 대입
// ? super T : 특정 타입과 그 타입의 부모들만 대입

// 메소드 sort(List<T> list, Comparator<? super T> c)
// sort(List<Apple> list, Comparator<? super Apple> c)
// Comparator<Apple>, Comparator<Fruit>, Comparator<Object> - Apple과 Apple의 조상까지만 가능

// sort(List<Toy> list, Comparator<? super Toy> c)
// Comparator<Toy>, Comparator<Object> - Toy 와 Toy 의 조상

public class FruitBox<T extends Fruit> extends Box3<T> {
  //
}
