package telran.reflection.method;

import java.lang.reflect.Method;

public class MethodInvocationApp {
    public static void main(String[] args) {
        Tests tests = new Tests();
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("There is should be arguments: <method name> and <parameter>");
            }
            Method method = Tests.class.getDeclaredMethod(args[0], String.class);
            method.setAccessible(true);
            method.invoke(tests, args[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
