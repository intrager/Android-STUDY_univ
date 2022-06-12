package com.iducs.graphicpractice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.View;

public class MyView extends View {
    private int count;
    private int what;

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.YELLOW);
        setOnCreateContextMenuListener(new OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.setHeaderTitle("도형 선택");
                contextMenu.add(0, 1, 0, "선");
                contextMenu.add(0, 2, 0, "면");
                contextMenu.add(0, 3, 0, "원");
                contextMenu.add(0, 4, 0, "타원");
                contextMenu.add(0, 5, 0, "부채꼴");
                contextMenu.add(0, 6, 0, "텍스트");
            }
        });
    }

    public void setting(int w, int c) {
        what = w;
        count = c;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR);
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setTextSize(100);
        paint.setStrokeWidth(20);
        switch(what) {
            case 1:
                for(int i = 0; i < count; i++) {
                    canvas.drawLine(100, 100 + (50 * i), 600, 100 + (50 * i), paint);
                }
                break;
            case 2:
                canvas.drawRect(100, 200, 300, 300, paint);
                break;
            case 3:
                for(int i = 0; i < count; i++) {
                    canvas.drawCircle(300 + (150 * i), 500, 100, paint);
                }
                break;
            case 4:
                canvas.drawOval(new RectF(30, 50, 400, 600), paint);
                break;
            case 5:
                canvas.drawArc(new RectF(30, 50, 400, 600), 0, 90, true, paint);
                break;
            case 6:
                canvas.drawText("This is a test", 100, 350, paint);
                break;
            default:
                break;
        }
    }
}
