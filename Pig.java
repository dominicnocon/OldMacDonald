class Pig implements Animal 
{     
      private String dType, dSound;
	public Pig(String type, String sound){
		dType = type;
		dSound = sound;
	}
	public Pig(){
		dType = "unknown";
		dSound = "unknown";
	}
	public String getSound(){return dSound;}
 	public String getType(){return dType;}
}
