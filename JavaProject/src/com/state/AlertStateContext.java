package com.state;

class AlertStateContext {

	private MobileAlertState currentState;
	
	AlertStateContext(){
		currentState=new Silent();
	}
	public void setState(MobileAlertState state) {
		currentState = state;
	}

	public void alert() {
		currentState.alert(this);
	}
}