class Farm 
{     
  private Animal[] aBunchOfAnimals = new Animal[4];

	public Farm()     {       
      aBunchOfAnimals[0] = new Cow("cow","moo");           
      aBunchOfAnimals[1] = new Chick("chick", "cluck", "blahblah");       
      aBunchOfAnimals[2] = new Pig("pig","oink"); 
      aBunchOfAnimals[3] = new NamedCow("Bob", "hello");
        }


   public void animalSounds()    {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)      
      {          
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
      }   
    } 
}





