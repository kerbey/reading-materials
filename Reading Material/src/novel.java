
public class novel extends readingMaterial
{
	public novel()
	{
		super();
	}
	public String novelChoices()
	{
		System.out.println(" Which novel would you like to read?");
		System.out.println("(catcher in the rye, Lord of the flies, Great Gatsby)");
		String novel=input.nextLine();
		if(novel.contains("catcher in the rye"))
		{
			setTitle("Catcher In The Rye");
			setAuthor("JD Salinger");
			setEditor("Joseph Dewey");
			setPublisher("Little, Brown and Company");
			setPages(400);	
			setPrimaryCharacters("Ackley, Holden Caulfield, Stradlater, Jane Gallagher and, D.B. Caulfield");
			setBookDescription("novel title: "+getTitle()+" by "+getAuthor()+" which has a total of "+getPages()+" pages"
					+ "\n Here are some characters: "+getPrimaryCharacters()+
					"\n edited by "+getEditor()+" published by "+getPublisher());
		}
		else if (novel.contains("lord of the flies"))
		{
			setTitle("Lord Of The Flies");
			setAuthor("William Golding");
			setEditor("Barbara Boyall");
			setPublisher("Faber & Faber");
			setPages(277);	
			setPrimaryCharacters("Piggy, Jack, Ralph, Eric, Simon, Roger");
			setBookDescription("novel"+getTitle()+" by "+getAuthor()+" which has a total of "+getPages()+" pages"
					+ "\n Here are some characters: "+getPrimaryCharacters()+
					"\n edited by "+getEditor()+" published by "+getPublisher());
		}
		else 
		{
			setTitle("Great Gatsby");
			setAuthor("F. Scott Fitxgerald");
			setEditor("Maxwell Perkins");
			setPublisher("Scribner");
			setPages(180);
			setPrimaryCharacters("Jay Gatsby, Nick Carraway, Daisy and Tom Buchanan, Jordan Baker");
			setBookDescription("novel title: "+getTitle()+" by "+getAuthor()+" which has a total of "+getPages()+" pages"
					+ "\n Here are some characters: "+getPrimaryCharacters()+
					"\n edited by "+getEditor()+" published by "+getPublisher());
		}
		return getBookDescription();
	}
}
