interface interfaceOne {
    void methodOne();
}

interface interfaceTwo {
    void methodTwo();
}

class MyClass implements interfaceOne, interfaceTwo {
    @Override
    public void methodOne() {
        System.out.println("Interface One");
    }

    @Override
    public void methodTwo() {
        System.out.println("Interface Two");
    }
}

class MultipleInheritance {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.methodOne();
        myClass.methodTwo();
    }
}