package com.state;
class Silent implements MobileAlertState
{
    @Override
    public void alert(AlertStateContext ctx) 
    {
        System.out.println("silent...");
    }
 
}