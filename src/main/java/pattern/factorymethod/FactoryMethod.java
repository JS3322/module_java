/**
 * @Process: complete
 * @Project_Name: module
 * @Package_Name: pattern.factorymethod
 * @Made_By: JS
 * @The_creation_time: ----
 * @File_Name: FactoryMethod.java
 * @contents: -
 */

package pattern.factorymethod;

class FactoryMethod {

    public static void main(String[] args) {
        new Console().withoutFactory();
        new Console().withFactory();
    }
}