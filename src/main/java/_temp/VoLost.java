/**
 * @Process: init
 * @Project_Name: module
 * @Package_Name: test
 * @Made_By: JS
 * @The_creation_time: ----
 * @File_Name: VoLost.java
 * @contents: -
 */

package _temp;

class VoLost {
    private final String checkName;
    private final String name;

    private static final long serialVersionUID = 362498820763181265L;

    VoLost(String checkName, String name) {
        this.checkName = checkName;
        this.name = name;
    }

    public String getCheckName() {
        return checkName;
    }

    public String getName() {
        return name;
    }
}
