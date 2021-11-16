package lab3;

public class Time 
{ 
private int hour;     // 0 - 23
private int minute;   // 0 - 59

private int second;   // 0 - 59

public Time() 
{ 
		setTime( 0, 0, 0 ); 
}

public Time( int h ) 
{ 
		setTime( h, 0, 0 ); 
}

public Time( int h, int m ) 
{ 
		setTime( h, m, 0 ); 
}

public Time( int h, int m, int s ) 
{ 
		setTime( h, m, s ); 
}

public void setTime( int h, int m, int s )
{
		setHour( h );   
		setMinute( m );  
		setSecond( s );  
}

public void setHour( int h ) 
{ 	
	   hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); 
}

public void setMinute( int m ) 
{ 
		minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); 
}


public void setSecond( int s ) 
{ 
		second = ( ( s >= 0 && s < 60 ) ? s : 0 ); 
}

public int getHour() 
{
	 return hour;
 }


public int getMinute()
 {
	  return minute;
 }

public int getSecond() 
{
	 return second;
 }

public String toMilitaryString()
{
   return ( hour < 10 ? "0" : "" ) + hour +
          ( minute < 10 ? "0" : "" ) + minute;
}
public String toString()
{
   return ( ( hour == 12 || hour == 0 ) ? 12 : hour % 12 ) +
          ":" + ( minute < 10 ? "0" : "" ) + minute +
          ":" + ( second < 10 ? "0" : "" ) + second +
          ( hour < 12 ? " AM" : " PM" );		
}

public void tick()
{
   setSecond( second + 1 );

   if ( second == 0 )
      incrementMinute();
}

public void incrementMinute()
{
   setMinute( minute + 1 );

   if ( minute == 0 )
      incrementHour();
}

public void incrementHour()
   { setHour( hour + 1 ); }
} 