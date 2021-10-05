/**
 * @Process: complete
 * @Project_Name: module
 * @Package_Name: pattern.state
 * @Made_By: JS
 * @The_creation_time: ----
 * @File_Name: Program.java
 * @contents: -
 */

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