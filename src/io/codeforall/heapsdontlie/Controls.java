package io.codeforall.heapsdontlie;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controls implements KeyboardHandler {

    MyCursor cursor;

    public Controls(MyCursor cursor){
        this.cursor = cursor;
        init();
    }

    private boolean spacePressed;
    private boolean clearPressed;

    private void init(){

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent pressedUp = new KeyboardEvent();
        pressedUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedUp.setKey(KeyboardEvent.KEY_UP);
        keyboard.addEventListener(pressedUp);

        KeyboardEvent pressedDown = new KeyboardEvent();
        pressedDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedDown.setKey(KeyboardEvent.KEY_DOWN);
        keyboard.addEventListener(pressedDown);

        KeyboardEvent pressedLeft = new KeyboardEvent();
        pressedLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedLeft.setKey(KeyboardEvent.KEY_LEFT);
        keyboard.addEventListener(pressedLeft);

        KeyboardEvent pressedRight = new KeyboardEvent();
        pressedRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedRight.setKey(KeyboardEvent.KEY_RIGHT);
        keyboard.addEventListener(pressedRight);

        KeyboardEvent pressedSpace = new KeyboardEvent();
        pressedSpace.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedSpace.setKey(KeyboardEvent.KEY_SPACE);
        keyboard.addEventListener(pressedSpace);

        KeyboardEvent releaseSpace = new KeyboardEvent();
        releaseSpace.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        releaseSpace.setKey(KeyboardEvent.KEY_SPACE);
        keyboard.addEventListener(releaseSpace);

        KeyboardEvent pressedC = new KeyboardEvent();
        pressedC.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedC.setKey(KeyboardEvent.KEY_C);
        keyboard.addEventListener(pressedC);

        KeyboardEvent pressedS = new KeyboardEvent();
        pressedS.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedS.setKey(KeyboardEvent.KEY_S);
        keyboard.addEventListener(pressedS);

        KeyboardEvent releaseS = new KeyboardEvent();
        releaseS.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        releaseS.setKey(KeyboardEvent.KEY_S);
        keyboard.addEventListener(releaseS);

        KeyboardEvent pressedL = new KeyboardEvent();
        pressedL.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        pressedL.setKey(KeyboardEvent.KEY_L);
        keyboard.addEventListener(pressedL);

        KeyboardEvent releaseL = new KeyboardEvent();
        releaseL.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        releaseL.setKey(KeyboardEvent.KEY_L);
        keyboard.addEventListener(releaseL);

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_DOWN:
                if (clearPressed){
                    cursor.clear();
                }
                if (spacePressed){
                    cursor.paint();
                }

                cursor.moveDown();
                break;
            case KeyboardEvent.KEY_UP:
                if (clearPressed){
                    cursor.clear();
                }
                if (spacePressed){
                    cursor.paint();
                }

                cursor.moveUp();
                break;
            case KeyboardEvent.KEY_LEFT:
                if (clearPressed){
                    cursor.clear();
                }
                if (spacePressed){
                    cursor.paint();
                }
                cursor.moveLeft();
                break;
            case KeyboardEvent.KEY_RIGHT:
                if (clearPressed){
                    cursor.clear();
                }
                if (spacePressed){
                    cursor.paint();
                }

                cursor.moveRight();
                break;
            case KeyboardEvent.KEY_SPACE:
                cursor.paint();
                spacePressed=true;
                break;
            case KeyboardEvent.KEY_C:
                cursor.clear();
                clearPressed=true;
                break;
            /*case KeyboardEvent.KEY_S:
                cursor.save();
                break;
            case KeyboardEvent.KEY_L:
                cursor.load();
                break;*/
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_SPACE:
                spacePressed=false;
                break;
            case KeyboardEvent.KEY_C:
                clearPressed=false;
                break;
            case KeyboardEvent.KEY_S:
                //cursor.saveRelease();
                break;
        }

    }
}