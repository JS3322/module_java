package pattern.state;

public class Program {
    public static void main(final String[] args) {
        final ModeSwitch modeSwitch = new ModeSwitch();

        modeSwitch.onSwitch(); // "FROM LIGHT TO DARK" 출력
        modeSwitch.onSwitch(); // "FROM DARK TO LIGHT" 출력
        modeSwitch.onSwitch(); // "FROM LIGHT TO DARK" 출력
        modeSwitch.onSwitch(); // "FROM DARK TO LIGHT" 출력
    }
}