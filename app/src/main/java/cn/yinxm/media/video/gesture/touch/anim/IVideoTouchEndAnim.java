package cn.yinxm.media.video.gesture.touch.anim;

/**
 * <p>
 *
 * @author yinxuming
 * @date 2020/12/24
 */
public interface IVideoTouchEndAnim {

    void setEndAnimScale(float scale);

    void setEndAnimRotate(float currentRotate, float rotateEndFixDegrees);

    void startAnim();

    void endPrevAnim();
}