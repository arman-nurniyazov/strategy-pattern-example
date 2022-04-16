package uz.devops;

import uz.devops.base.OperationAdd;
import uz.devops.base.OperationMultiply;
import uz.devops.base.OperationSubstract;

public class Main {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("3 + 2 = " + context.executeStrategy(3, 2));

        context = new Context(new OperationSubstract());
        System.out.println("3 - 2 = " + context.executeStrategy(3, 2));

        context = new Context(new OperationMultiply());
        System.out.println("3 * 2 = " + context.executeStrategy(3, 2));
    }
}
