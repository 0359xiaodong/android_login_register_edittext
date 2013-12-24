package com.example.login_register_edittext;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;

/**
��Ȩ���У���Ȩ����(C)2013���������
�ļ����ƣ�com.goopai.shenma.custom.drawBottomEditText.java
ϵͳ��ţ�
ϵͳ���ƣ�Shenma
ģ���ţ�
ģ�����ƣ�
����ĵ���
�������ڣ�2013-12-20 ����5:52:39
�� �ߣ�������
Version: 1.0
����ժҪ���ܹ����еײ��߿���Լ����߶�����EditText
���еĴ�������������Σ���������������������෽������
�ļ�����:
 */
public class drawBottomEditText extends AbstractEditText {

	public drawBottomEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		setDefaultPaint();
	}

	private Paint mPaint=new Paint();;
	
	public drawBottomEditText(Context context) {
		this(context,null);
	}

	@Override
	protected void filterText(CharSequence s, int start, int before, int count) {
	}
	
	public void setPainterColor(int color){
		mPaint.setColor(color);
	}
	
	public void setPainterWidth(float w){
		mPaint.setStrokeWidth(w);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		//����������
		canvas.drawLine(0, this.getHeight()-1,0,this.getHeight()-10, mPaint);
		canvas.drawLine(getWidth()-2, this.getHeight()-1,getWidth()-2,this.getHeight()-10, mPaint);
		// ������  
        canvas.drawLine(1, this.getHeight() - 1, this.getWidth() - 2, this.getHeight() - 1, mPaint);
	}
	
	private void setDefaultPaint(){
		mPaint.setColor(getResources().getColor(R.color.login_default_painter_color));
		mPaint.setStyle(Style.STROKE);
		mPaint.setStrokeWidth(2.5f);
	}

}
