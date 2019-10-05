import java.util.*;

class CustomStack<T> extends ArrayList<T> {

    public void pushRight(T o) {
        add(o);
    }

    public T popRight() {
        return remove(size() - 1);
    }

    public T peekRight(){
      return get(size()-1);
    }
    public  T popLeft(){ return remove(0); }
    public  T peekLeft(){ return get(0);}
    public  void pushLeft(T s){
        add(0, s);
    }
}

public class Lesson3_stack {
    public  static  void main(String[] args){
        Stack<Character> stack = new Stack<>();
        int i;
        String reverceWord = "Пробуем перевернуть буквы";
        for(i=0; i< reverceWord.length();i++) stack.push(reverceWord.charAt(i));

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();

        run();
        runStatndartQueue(reverceWord);
        runStatndartQueue1(reverceWord);

    }
    public  static void runStatndartQueue(String reverceWord){
        CustomStack<Character> stack = new CustomStack();
        for (int i = 0;i < reverceWord.length(); i++){
            stack.pushRight(reverceWord.charAt(i));
        }
        while(!stack.isEmpty()){
            System.out.print(stack.popLeft());
        }
        System.out.println();
    }
    public  static void runStatndartQueue1(String reverceWord){
        CustomStack<Character> stack = new CustomStack();
        for (int i = 0;i < reverceWord.length(); i++){
            stack.pushLeft(reverceWord.charAt(i));
        }
        while(!stack.isEmpty()){
            System.out.print(stack.popLeft());
        }
        System.out.println();
    }
    public static void run(){
        String reverceWord = "Пробуем перевернуть буквы";
        int i;
        Character s;
        CustomStack<Character> myStack = new CustomStack<>();
        for(i=0; i< reverceWord.length();i++) myStack.pushRight(reverceWord.charAt(i));
        System.out.println(myStack.peekRight());
        while(!myStack.isEmpty()){
            System.out.print(myStack.popRight());
        }
        System.out.println();

    }
}
