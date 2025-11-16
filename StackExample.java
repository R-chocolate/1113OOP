
class MyStack<T> extends java.util.LinkedList<T> {
    public void push(T item) {
        addLast(item);
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            return removeLast();
        }
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int size() {
        return super.size();
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + '\'' + ", age=" + age + '}';
    }
}

public class StackExample {
    public static void main(String[] args) {
        MyStack<Integer> sstack = new MyStack<>();
    }
}
