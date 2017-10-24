class NamedCow extends Cow
{
	private String dName;
	public NamedCow(String type, String sound, String name){
		dType = type;
		dSound = sound;
		dName = name;
	}
 	public String getName(){
 		return dName;
 	}
}