package com.android.svg.sample.drawables;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.android.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_wc_green_alpha extends SVGRenderer {

    public ic_wc_green_alpha(Context context) {
        super(context);
        mAlpha = 0.1f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        final float minScale = Math.min(scaleX, scaleY);
        
        mGroupStackedMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.set(mGroupStackedMatrix);
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        final float matrixScale1 = getMatrixScale(mGroupStackedMatrix);
        if (matrixScale1 == 0) {
            return;
        }
        
        mPath.reset();
        mPath.moveTo(5.5f, 22.0f);
        mPath.rLineTo(0f, -7.5f);
        mPath.lineTo(4.0f, 14.5f);
        mPath.lineTo(4.0f, 9.0f);
        mPath.rCubicTo(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        mPath.rLineTo(0f, 5.5f);
        mPath.lineTo(9.5f, 14.5f);
        mPath.lineTo(9.5f, 22.0f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.close();
        mPath.moveTo(5.5f, 22.0f);
        mPath.moveTo(18.0f, 22.0f);
        mPath.rLineTo(0f, -6.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rLineTo(-2.54f, -7.63f);
        mPath.cubicTo(18.18f, 7.55f, 17.42f, 7.0f, 16.56f, 7.0f);
        mPath.rLineTo(-0.12f, 0f);
        mPath.rCubicTo(-0.86f, 0.0f, -1.63f, 0.55f, -1.9f, 1.37f);
        mPath.lineTo(12.0f, 16.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.close();
        mPath.moveTo(18.0f, 22.0f);
        mPath.moveTo(7.5f, 6.0f);
        mPath.rCubicTo(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        mPath.rCubicTo(0.0f, -1.1100001f, -0.89f, -2.0f, -2.0f, -2.0f);
        mPath.rCubicTo(-1.1099997f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        mPath.rCubicTo(0.0f, 1.1100001f, 0.89f, 2.0f, 2.0f, 2.0f);
        mPath.close();
        mPath.moveTo(7.5f, 6.0f);
        mPath.moveTo(16.5f, 6.0f);
        mPath.rCubicTo(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        mPath.rCubicTo(0.0f, -1.1100001f, -0.89f, -2.0f, -2.0f, -2.0f);
        mPath.rCubicTo(-1.1100006f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        mPath.rCubicTo(0.0f, 1.1100001f, 0.89f, 2.0f, 2.0f, 2.0f);
        mPath.close();
        mPath.moveTo(16.5f, 6.0f);
        
        mRenderPath.reset();
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16711936, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}