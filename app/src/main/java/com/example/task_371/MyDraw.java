package com.example.task_371;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyDraw extends View {
    public MyDraw (Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();

        paint.setColor(Color.argb(255,0,119,45));
        canvas.drawRect(0, 1000, getWidth(),getBottom(), paint);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(50, 50, 70, paint);
        canvas.drawLine(50,50, 350, 70, paint);
        canvas.drawLine(50,50, 350, 70, paint);
        canvas.drawLine(50,50, 340, 90, paint);
        canvas.drawLine(50,50, 335, 110, paint);
        canvas.drawLine(50,50, 330, 135, paint);
        canvas.drawLine(50,50, 315, 150, paint);
        canvas.drawLine(50,50, 300, 170, paint);
        canvas.drawLine(50,50, 275, 200, paint);
        canvas.drawLine(50,50, 250, 230, paint);
        canvas.drawLine(50,50, 220, 270, paint);
        canvas.drawLine(50,50, 180, 310, paint);
        paint.setColor(Color.argb(255, 180, 70,50));
        canvas.drawRect(70, 950, 420, 1300, paint);
        canvas.drawRect(630, 1200, 650, 1350, paint);

        Path path = new Path();
        path.moveTo(245, 700);
        path.lineTo(70, 950);
        path.lineTo(420, 950);
        path.lineTo(245, 700);
        canvas.drawPath(path, paint);


        paint.setColor(Color.GRAY);
        canvas.drawRect(800, 1230, 1000, 1255, paint);
        canvas.drawRect(830, 1255, 850, 1310, paint);
        canvas.drawRect(950, 1255, 970, 1310, paint);

        paint.setColor(Color.GREEN);
        canvas.drawOval(520, 700, 760, 1220, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        paint.setColor(Color.BLACK);
        canvas.drawRect(69, 950, 421, 1301, paint);
        canvas.drawRect(280, 1070, 380, 1300, paint);
        canvas.drawRect(100, 1000, 240, 1150, paint);
        canvas.drawCircle(245, 850, 50, paint);
        canvas.drawPath(path, paint);
        canvas.drawRect(799, 1230, 1000, 1256, paint);
        canvas.drawRect(829, 1256, 850, 1311, paint);
        canvas.drawRect(949, 1256, 971, 1311, paint);
        paint.setColor(Color.argb(255,0,130,53));
        canvas.drawOval(519, 700, 760, 1221, paint);

        paint.setColor(Color.BLUE);
        for (int i = 1015; i < 1150; i+=25) {
            canvas.drawLine(100, i, 240, i, paint);
        }
        for (int i = 120; i < 240; i+=25) {
            canvas.drawLine(i, 1000, i, 1150, paint);
        }
        canvas.drawLine(242, 802, 290, 830, paint);
        canvas.drawLine(225, 805, 293, 845, paint);
        canvas.drawLine(212, 813, 293, 863, paint);
        canvas.drawLine(203, 825, 287, 875, paint);
        canvas.drawLine(198, 837, 280, 887, paint);
        canvas.drawLine(196, 850, 270, 895, paint);
        canvas.drawLine(198, 867, 255, 900, paint);

        paint.setColor(Color.WHITE);
        canvas.drawLine(310, 1070, 380, 1125, paint);
        canvas.drawLine(340, 1070, 380, 1100, paint);
        for (int i = 0; i < 160; i+=25) {
            canvas.drawLine(280, 1070+i, 380, 1150+i, paint);
        }
        canvas.drawLine(280, 1245, 350, 1300, paint);
        canvas.drawLine(280, 1270, 320, 1300, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawLine(50,50, 350, 70, paint);
        canvas.drawLine(50,50, 350, 70, paint);
        canvas.drawLine(50,50, 340, 90, paint);
        canvas.drawLine(50,50, 335, 110, paint);
        canvas.drawLine(50,50, 330, 135, paint);
        canvas.drawLine(50,50, 315, 150, paint);
        canvas.drawLine(50,50, 300, 170, paint);
        canvas.drawLine(50,50, 275, 200, paint);
        canvas.drawLine(50,50, 250, 230, paint);
        canvas.drawLine(50,50, 220, 270, paint);
        canvas.drawLine(50,50, 180, 310, paint);

    }
}
