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
    public void VorsichtigerSchritt()
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
    public void VorsichtigerRechtsSchritt()
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
    
    switch (zufall) {
        case 0: LinksDrehen(); break;
        case 1: RechtsDrehen(); break;
        case 2: VorsichtigerSchritt(); break;
        case 3: VorsichtigerRechtsSchritt(); break;
    }
}
    public void Tanzen(int wiederholungen)
    {
        for(int i = 0; i < wiederholungen; i++)
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
