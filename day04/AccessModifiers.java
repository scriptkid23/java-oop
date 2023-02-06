package day04;

public class AccessModifiers {
    private String topLevelPrivateProperty = "Top-level private value";
    public String top = "hello";

    public void topLevelPrivateMethod() {
        var inner = new InnerClass();
        System.out.println(inner.innerPrivateProperty);
        inner.innerPrivateMethod();
    }

    private class InnerClass {
        // private static String PROP = "Inner static"; //error
        private String innerPrivateProperty = "Inner private value";

        private void innerPrivateMethod() {
            System.out.println(topLevelPrivateProperty);
        }
    }

    private static class InnerStaticClass {
        private static String PROP = "Inner private static";
        private String innerPrivateProperty = "Inner private value";

        private void innerPrivateMethod() {
            var top = new AccessModifiers();
            System.out.println(top.topLevelPrivateProperty);
        }
    }

    public static void main(String... args) {
        var top = new AccessModifiers();

        top.topLevelPrivateMethod();

        System.out.println(InnerStaticClass.PROP);
        var inner = new InnerStaticClass();
        System.out.println(inner.innerPrivateProperty);
        inner.innerPrivateMethod();
    }
}