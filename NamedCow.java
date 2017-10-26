class NamedCow extends Cow
{
	private String dName;
	public NamedCow(String type, String sound){
		dType = type;
		dSound = sound;
		
	}
 	public String getName(){
 		return dName;
 	}
}