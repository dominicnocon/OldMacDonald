class Chick implements Animal 
{     
     private String dType, dSound1, dSound2;
	public Chick(String type, String sound1, String sound2){
		dType = type;
		dSound1 = sound1;
		dSound2 = sound2;
	}
	public Chick(){
		dType = "unknown";
		dSound1 = "unknown";
		dSound2 = "unknown";
	}

	
	public String getSound(){
		if ((Math.random()*2)>1)
			return dSound2;
		else return dSound1;
	}
 	public String getType(){return dType;}
}
