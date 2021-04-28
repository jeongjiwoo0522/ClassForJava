package test_0428_3;

public class Button {

	interface OnClickListener {
		void onClick();
	}
	
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		this.listener.onClick();
	}
}
