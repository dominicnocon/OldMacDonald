class Cow implements Animal 
{     
     protected String dType, dSound;
  public Cow(String type, String sound){
  	dType = type;
  	dSound = sound;
  }
  public Cow(){
  	dType = "unknown";
  	dSound = "unknown";
  }
 public String getSound(){return dSound;}
 public String getType(){return dType;}
}
