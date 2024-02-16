package util;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// java.util.List
// 3. Stack - LIFO(Last in First out)방식 (수직으로 쌓여서 처음 들어온 게 가장 나중에 나오는 형식)
//              수식계산, 수식괄호검사, undo/redo(실행취소/다시실행), 웹브라우저의 뒤로/앞으로
// 4. Queue - FIFO(Finrst in First out)방식 (처음 들어온 게 처음 나감)
//              최근사용문서, 인쇄작업 대기목록, 버퍼

public class StackEx1 {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    Queue<String> queue = new LinkedList<>();

    // stack : push() / pop() 메소드가 구현되어 있음
    stack.push("0");
    stack.push("1");
    stack.push("2");
    stack.push("3");
    stack.push("4");

    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }

    // offer(), poll()
    queue.offer("사과");
    queue.offer("딸기");
    queue.offer("배");
    queue.offer("바나나");
    queue.offer("수박");

    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }
  }
}
