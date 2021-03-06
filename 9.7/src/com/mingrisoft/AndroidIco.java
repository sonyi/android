package com.mingrisoft;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class AndroidIco extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		FrameLayout ll=(FrameLayout)findViewById(R.id.frameLayout1);	//获取布局文件中的帧布局管理器
		ll.addView(new MyView(this));	//将自定义视图添加到帧布局管理器中
	}
	public class MyView extends View{

		public MyView(Context context) {
			super(context);
		}

		@Override
		protected void onDraw(Canvas canvas) {
			Paint paint=new Paint();	//采用默认设置创建一个画笔
			paint.setAntiAlias(true);	//使用抗锯齿功能
			paint.setColor(0xFFA4C739);	//设置画笔的颜色为绿色
			//绘制机器人的头
			RectF rectf_head=new RectF(10, 10, 100, 100);
			rectf_head.offset(100, 20);
			canvas.drawArc(rectf_head, -10, -160, false, paint);	//绘制弧
			//绘制眼睛
			paint.setColor(Color.WHITE);	//设置画笔的颜色为白色
			canvas.drawCircle(135, 53, 4, paint);	//绘制圆
			canvas.drawCircle(175, 53, 4, paint);	//绘制圆
			paint.setColor(0xFFA4C739);	//设置画笔的颜色为绿色
			//绘制天线
			paint.setStrokeWidth(2);	//设置笔触的宽度
			canvas.drawLine(120, 15, 135, 35, paint);	//绘制线
			canvas.drawLine(190, 15, 175, 35, paint);	//绘制线
			//绘制身体
			canvas.drawRect(110, 75, 200, 150, paint);	//绘制矩形
			RectF rectf_body=new RectF(110,140,200,160);
			canvas.drawRoundRect(rectf_body, 10, 10, paint);	//绘制圆角矩形
			//绘制胳膊
			RectF rectf_arm=new RectF(85,75,105,140);
			canvas.drawRoundRect(rectf_arm, 10, 10, paint);	//绘制左侧的胳膊
			rectf_arm.offset(120, 0);							//设置在X轴上偏移120像素
			canvas.drawRoundRect(rectf_arm, 10, 10, paint);	//绘制右侧的胳膊	
			//绘制腿
			RectF rectf_leg=new RectF(125,150,145,200);
			canvas.drawRoundRect(rectf_leg, 10, 10, paint);	//绘制左侧的腿
			rectf_leg.offset(40, 0);							//设置在X轴上偏移40像素
			canvas.drawRoundRect(rectf_leg, 10, 10, paint);	//绘制右侧的腿				
			super.onDraw(canvas);
		}
	}
}
