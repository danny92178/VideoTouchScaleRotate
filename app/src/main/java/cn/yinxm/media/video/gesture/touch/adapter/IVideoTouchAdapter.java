package cn.yinxm.media.video.gesture.touch.adapter;

import android.view.TextureView;

import androidx.annotation.Nullable;

import cn.yinxm.media.video.gesture.touch.anim.IVideoTouchEndAnim;
import cn.yinxm.media.video.gesture.touch.handler.IVideoRotateHandler;

/**
 * 播放器手势触摸适配，手势与播放器之间的适配层
 * <p>
 *
 * @author yinxuming
 * @date 2020/5/14
 */
public interface IVideoTouchAdapter {

    @Nullable
    IVideoTouchEndAnim getVideoTouchEndAnim();

    IVideoRotateHandler getVideoRotateHandler();

    TextureView getTextureView();

    boolean isPlaying();

    boolean isFullScreen();
}
