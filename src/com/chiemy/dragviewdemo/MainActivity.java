package com.chiemy.dragviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;


public class MainActivity extends Activity implements OnLongClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.imageView1).setOnLongClickListener(this);
        findViewById(R.id.imageView2).setOnLongClickListener(this);
        findViewById(R.id.imageView3).setOnLongClickListener(this);
    }


	@Override
	public boolean onLongClick(View v) {
		DragShadowBuilder shadowBuilder = new DragShadowBuilder(v);
		v.startDrag(null, shadowBuilder, ((ImageView)v).getDrawable(), 0);
		return true;
	}
}
