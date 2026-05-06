package coreEngine;

public class MathIndexTrigger implements MathIntendLink
{
    public boolean isMathIntent(String input) {
        String[] mathTriggers = {"calculate", "solve", "derivative", "matrix", "integral", "equation", "math", "add", "multiply"};
        for (String trigger : mathTriggers) {
            if (input.contains(trigger)) {
                return true;
            }
        }
        return false;
    }
}
