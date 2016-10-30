import java.util.Random;
class TANZROBOTER extends ROBOTER
{
    TANZROBOTER(WELT welt)
    {
        super(welt);
    }
    TANZROBOTER(int startx, int starty, char blickrichtung, WELT welt)
    {
        super(startx, starty, blickrichtung, welt);
    }
    public void Umdrehen()
    {
        RechtsDrehen();
        RechtsDrehen();
    }
    public void Vorsichtigerschritt()
    {
        if(IstWand())
        {
            Umdrehen();
        }
        else
        {
            if(IstRoboter())
            {
                LinksDrehen();
            }
            else
            {
                Schritt();
            }
        }
    }
    public void VorsichtigerRechtschritt()
    {
		RechtsDrehen();
		if(IstWand())
		{
			RechtsDrehen();
		}
		else
		{
			if(IstRoboter())
			{
				RechtsDrehen();
			}
			else
			{
				Schritt();
				LinksDrehen();
			}
		}
    }
public void Tanzen()
{
	int zufall;
	zufall = (int) (Math.random()*4) ;
	if(zufall==0)
	{
		LinksDrehen();
	}
	else
	{
	   if(zufall==1)
	    {
		      RechtsDrehen();
	    }
	     else
	    {
		      if(zufall==2)
		      {
			         Vorsichtigerschritt();
		      }
		      else
	        {
		          if(zufall==3)
		          {
		              VorsichtigerRechtschritt();
		          }
		          else
		          {
		          }
		      }
	    }
  }
}
	public void LangeTanzen()
	{
		for(int i = 0; i < 10;i++)
		{
			Tanzen();
		}
	}
}
/*
:D
*/
/*
                   -`
                  .o+`
                 `ooo/
                `+oooo:
               `+oooooo:
               -+oooooo+:
             `/:-:++oooo+:
            `/++++/+++++++:
           `/++++++++++++++:
          `/+++ooooooooooooo/`
         ./ooosssso++osssssso+`
        .oossssso-````/ossssss+`
       -osssssso.      :ssssssso.
      :osssssss/        osssso+++.
     /ossssssss/        +ssssooo/-
   `/ossssso+/:-        -:/+osssso+-
  `+sso+:-`                 `.-/+oso:
 `++:.                           `-/+/
 .`                                 `/
*/
