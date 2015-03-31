
public class technicalJournals extends readingMaterial
{
	public technicalJournals()
	{
		super();
	}
	public String technicalJournalChoice()
	{
		System.out.println(" Which technicaljournal would you like to read?");
		System.out.println("(International Journal of Advanced Laser and Optical Engineering,"
				+ "\n '' Advanced Computer Science and Information Technology,"
				+ "\n '' Advanced Electrochemical Research)");
		String magazineChoice=input.nextLine();
		if(magazineChoice.contains("International Journal of Advanced Laser and Optical Engineering"))
		{
			setTitle("Advanced Laser and Optical Engineering");
			setAuthor("Jeffrey Beall");
			setPublisher("Zeev Zalevsky");
			setEditor(" Dr. Sayed Gholam Hassan Tabatabaei");
			setPages(544);	
			setBookDescription("Title: International Journal of "+getTitle()+" published by "+getPublisher()+
					"\n which has a total of "+getPages()+" pages; Author: "+getAuthor()+" editor: "+getEditor());
		}
		else if (magazineChoice.contains("Advanced Computer Science and Information Technology"))
		{
			setTitle("Advanced Computer Science and Information Technology");
			setAuthor("Leslie Willcocks");
			setPublisher("Zeev Zalevsky");
			setEditor(" Dr. Sayed Gholam Hassan Tabatabaei");
			setPages(444);	
			setBookDescription("Title: International Journal of "+getTitle()+" published by "+getPublisher()+
					"\n which has a total of "+getPages()+" pages; Author: "+getAuthor()+" editor: "+getEditor());
		}
		else 
		{
			setTitle("Advanced Electrochemical Research");
			setAuthor("Chris Sauer");
			setPublisher("Zeev Zalevsky");
			setEditor(" Dr. Sayed Gholam Hassan Tabatabaei");
			setPages(555);
			setBookDescription("Title: International Journal of "+getTitle()+" published by "+getPublisher()+
					"\n which has a total of "+getPages()+" pages; Author: "+getAuthor()+" editor: "+getEditor());
		}
		return getBookDescription();
	}
}
