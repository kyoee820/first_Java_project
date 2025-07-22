package JavaMaster.annotation.general.overried;

public class OverriedMain {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.printMessage();
        p1.printMessageNotOverride();

        Parent p2 = new Child();
        p2.printMessage();
        p2.printMessageNotOverride();
    }
}
