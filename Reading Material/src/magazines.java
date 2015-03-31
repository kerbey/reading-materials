
public class magazines extends readingMaterial
{
	public magazines()
	{
		super();
	}
	public String magazineChoices()
	{
		System.out.println(" Which magazine would you like to read?");
		System.out.println("(Cosmopolitan, Bon Appétit, Fast Company)");
		String magazineChoice=input.nextLine();
		if(magazineChoice.contains("cosmopolitan"))
		{
			setTitle("Cosmopolitan");
			setPublisher("Hearst Magazines");
			setEditor("Amy Odell");
			setPages(39);	
			setBookDescription("Magazine title: "+getTitle()+" published by "+getPublisher()+" which has a total of "+getPages()+" pages"
					+"\n edited by "+getEditor());
		}
		else if (magazineChoice.contains("Bon Appetit"))
		{
			setTitle("Bon Appetit");
			setPublisher("Pamela Drucker Mann");
			setEditor("Adam Rapoport");
			setPages(66);	
			setBookDescription("Magazine title: "+getTitle()+" published by "+getPublisher()+" which has a total of "+getPages()+" pages"
					+"\n edited by "+getEditor());
		}
		else 
		{
			setTitle("Fast Company");
			setPublisher("Fast Company Inc.");
			setEditor("Noah Robischon & Rick Tetzeli");
			setPages(55);
			setBookDescription("Magazine title: "+getTitle()+" published by "+getPublisher()+" which has a total of "+getPages()+" pages"
					+"\n edited by "+getEditor());
		}
		return getBookDescription();
	}
}
