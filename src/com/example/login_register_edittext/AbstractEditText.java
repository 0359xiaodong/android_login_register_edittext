package com.example.login_register_edittext;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;

/**
��Ȩ���У���Ȩ����(C)2013���������
�ļ����ƣ�com.goopai.carshop.ui.custom.BaseEditText.java
ϵͳ��ţ�
ϵͳ���ƣ�4S_Android
ģ���ţ�
ģ�����ƣ�
����ĵ���
�������ڣ�2013-11-18 ����8:45:24
�� �ߣ�������
Version: 1.0
����ժҪ���Զ��������ı�����࣬ʵ���˶��������ݵĹ���
���еĴ�������������Σ���������������������෽������
�ļ�����:
 */
public abstract class AbstractEditText extends EditText implements TextWatcher{

	public AbstractEditText(Context context, AttributeSet attrs) {
		// TODO Auto-generated constructor stub
		super(context,attrs);
		this.addTextChangedListener(this);
	}

	public AbstractEditText(Context context) {
		// TODO Auto-generated constructor stub
		this(context, null);
	}

	@Override
	public void afterTextChanged(Editable s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		// TODO Auto-generated method stub
		filterText(s, start, before, count);
	}
	
	protected abstract void filterText(CharSequence s, int start, int before, int count);

}
