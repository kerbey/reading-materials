import java.util.Scanner;
public class readingMaterial
{
	Scanner input= new Scanner(System.in);
	private String Title, Author, bookDescription, primaryCharacters, publisher, editor;
	private int Pages;
	public String getTitle()
	{
		return Title;
	}
	public void setTitle(String title)
	{
		Title = title;
	}
	public String getAuthor()
	{
		return Author;
	}
	public void setAuthor(String author)
	{
		Author = author;
	}
	public int getPages()
	{
		return Pages;
	}
	public void setPages(int pages)
	{
		Pages = pages;
	}
	public String getBookDescription()
	{
		return bookDescription;
	}
	public void setBookDescription(String bookDescription)
	{
		this.bookDescription = bookDescription;
	}
	public String getPrimaryCharacters()
	{
		return primaryCharacters;
	}
	public void setPrimaryCharacters(String primaryCharacters)
	{
		this.primaryCharacters = primaryCharacters;
	}
	public String getPublisher()
	{
		return publisher;
	}
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	public String getEditor()
	{
		return editor;
	}
	public void setEditor(String editor)
	{
		this.editor = editor;
	}	
}
