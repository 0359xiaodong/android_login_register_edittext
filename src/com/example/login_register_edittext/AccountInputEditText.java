package com.example.login_register_edittext;

import android.content.Context;
import android.util.AttributeSet;

/**
��Ȩ���У���Ȩ����(C)2013���������
�ļ����ƣ�com.goopai.carshop.ui.custom.LoginEditText.java
ϵͳ��ţ�
ϵͳ���ƣ�4S_Android
ģ���ţ�
ģ�����ƣ�
����ĵ���
�������ڣ�2013-11-19 ����4:57:58
�� �ߣ�������
Version: 1.0
����ժҪ����¼�õ�EditText
���еĴ�������������Σ���������������������෽������
�ļ�����:
 */
public class AccountInputEditText extends drawBottomEditText{

	

	public AccountInputEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public AccountInputEditText(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void filterText(CharSequence s, int start, int before, int count) {
		// TODO Auto-generated method stub
//		String editable =this.getText().toString();  
//        String str = TextFilter.loginAccountStringFilter(editable.toString());
//        if(!editable.equals(str)){
//            this.setText(str);
//            //�����µĹ������λ��  
//            this.setSelection(str.length());
//        }
	}
	
	

}
