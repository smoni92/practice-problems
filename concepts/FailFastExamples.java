package concepts;

import java.util.Objects;

//Inner classes defined here for simplicity
class InnerObject {
    private final String innerObjectString;

    public InnerObject(String barString) {
        this.innerObjectString = barString;
    }

    public String getInnerObjectString() {
        return innerObjectString;
    }
}

class OuterObject {
    private final InnerObject innerObject;

    public OuterObject(InnerObject innerObject) {
        this.innerObject = innerObject;
    }

    public void printInnerObjectString() {
        System.out.println("Inner Object String: " + innerObject.getInnerObjectString());
    }
}

class OuterObjectFailFast {

    private final InnerObject innerObject;

    public OuterObjectFailFast(InnerObject innerObject) {
        this.innerObject = Objects.requireNonNull(innerObject, "innerObject must not be null");
    }

    public void printInnerObjectString() {
        System.out.println("Inner Object String: " + innerObject.getInnerObjectString());
    }
}

public class FailFastExamples {

    public static void main(String[] args) {

        System.out.println("Calling OuterObject Method...");
        //Throws NullPointerException only when invoking the actual method.
        try {
            OuterObject outerObject = new OuterObject(null);
            outerObject.printInnerObjectString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println();

        //Throws NullPointerException when initializing the variable in constructor with custom message.
        System.out.println("Calling OuterObject FailFast Method...");
        try {
            OuterObjectFailFast outerObjectFailFast = new OuterObjectFailFast(null);
            outerObjectFailFast.printInnerObjectString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println();
    }
}
