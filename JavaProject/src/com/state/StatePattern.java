package com.state;
class StatePattern 
{
    public static void main(String[] args) 
    {
        AlertStateContext stateContext = new AlertStateContext();
        //stateContext.setState(new Vibration());
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Vibration());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();        
    }
}