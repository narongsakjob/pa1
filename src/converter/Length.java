package converter;


public enum Length implements Unit{
	
	METER("Meter" ,1.0),
	KILOMETER("Kilometer" , 1000.0),
	MILE("Mile" , 1609.344),
	FOOT("Foot" , 0.3048),
	WA("Wa" , 2.0),
	CENTIMETER("Centimeter" , 0.01);
	
	
	public final String name;
	public final double value;
	/**
	 * 
	 * @param name inherited name
	 * @param value inherited inherited
	 */
	 private Length(String name,double value){
		 this.name = name;
		 this.value = value;
	 }
	 /**
	  * @return value
	  */
	 public double getValue(){
		 return value;
	 }
	 /**
	  * @return name
	  */
	 public String toString(){
		 return name ;
	 }

	 
}
