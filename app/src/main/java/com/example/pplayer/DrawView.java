package com.example.pplayer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by 启 on 2014/9/7.
 */
public class DrawView extends View{

    public float currentX = 40;
    public float currentY = 50;
    Paint p = new Paint();
    public DrawView(Context context) {
        super(context);
    }
    public DrawView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        p.setColor(Color.RED);
        canvas.drawCircle(currentX, currentY, 15, p);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        currentX = event.getX();
        currentY = event.getY();
        //通知当前组件重绘制自己
        invalidate();
        return true;
    }
}
