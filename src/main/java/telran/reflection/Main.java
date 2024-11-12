package telran.reflection;

import java.lang.reflect.Constructor;

public class Main {

    private static final String BASE_PACKAGE = "telran.reflection";
    
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                throw new IllegalArgumentException(
                    "There should be 3 arguments: class name, sportsman name, specific parameter"
                );
            }
    
            String className = BASE_PACKAGE + "." + args[0];
            Class<Sportsman> clazz = (Class<Sportsman>) Class.forName(className);
            Constructor<Sportsman> constructor = clazz.getConstructor(String.class, String.class);
            Sportsman sportsman = constructor.newInstance(args[1], args[2]);
            sportsman.action();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(args[0] + "Class not found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     
    }
}