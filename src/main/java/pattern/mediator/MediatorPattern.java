/**
 * @Process: complete
 * @Project_Name: module
 * @Package_Name: pattern.mediator
 * @Made_By: JS
 * @The_creation_time: -
 * @File_Name: MediatorPattern.java
 * @Version : v11.0.12
 * @contents: -
 */

package pattern.mediator;

public class MediatorPattern {
    public static void main(String[] args) {

        ModeSwitch modeSwitch = new ModeSwitch();
        ModeMediator modeMediator = new ModeMediator();

        modeSwitch.setModeMediator(modeMediator);

        modeMediator.addListener(new ListView());
        modeMediator.addListener(new GalleryView());
        modeMediator.addListener(new DataDownloader());

        modeSwitch.toggleMode();
        // 리스트뷰 감춤
        // 갤러리뷰 보여줌
        // 갤러리뷰용 데이터 다운로드

        modeSwitch.toggleMode();
        // 리스트뷰 보여줌
        // 갤러리뷰 감춤
        // 리스트뷰용 데이터 다운로드
    }
}