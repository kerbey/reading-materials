
public class textBook extends readingMaterial
{	
	public textBook()
	{
		super();
	}
	public String TextBookChoices()
	{
		System.out.println(" Which textbook would you like to read?");
		System.out.println("(calculus, history, statistics)");
		String tBook=input.nextLine();
		if(tBook.contains("calculus"))
		{
			setTitle("Calculus 1");
			setAuthor("Bob Larson");
			setEditor("Katharine Viner");
			setPublisher("Arthur Ochs Sulzberger");
			setPages(999);			
			setBookDescription("Book title: "+getTitle()+" by "+getAuthor()+" which has a total of "+getPages()+" pages."
					+"\n edited by "+getEditor()+" published by "+getPublisher());
		}
		else if (tBook.contains("history"))
		{
			setTitle("History 101");
			setAuthor("John Jacob");
			setEditor("Ben Bradlee");
			setPublisher("Random House Inc.");
			setPages(2000);	
			setBookDescription("Book title: "+getTitle()+" by "+getAuthor()+" which has a total of "+getPages()+" pages."
					+"\n edited by "+getEditor()+" published by "+getPublisher());
		}
		else if (tBook.contains("statistics"))
		{
			setTitle("statistics");
			setAuthor("McDoug Little");
			setEditor("William Shawn");
			setPublisher("Square One Publishers Inc.");
			setPages(5000);
			setBookDescription("Book title: "+getTitle()+" by "+getAuthor()+" which has a total of "+getPages()+" pages."
					+"\n edited by "+getEditor()+" published by "+getPublisher());	
		}
		return getBookDescription();
	}
	
}
