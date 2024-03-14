package ch16.lecture.p1lambda;

public class C17ConstructorReference {
    public static void main(String[] args) {
        C17MyInterface1 obj1 = C17MyClass::new;
        C17MyInterface obj2 = new C17MyInterface() {
            @Override
            public C17MyClass method(String s, int i) {
                return new C17MyClass(s, i);
            }
        };
    }
}

class C17MyClass {
    C17MyClass() {
    }

    C17MyClass(String s, int i) {
    }
}

@FunctionalInterface
interface C17MyInterface1 {
    C17MyClass method();
}

@FunctionalInterface
interface C17MyInterface {
    C17MyClass method(String s, int i);
}