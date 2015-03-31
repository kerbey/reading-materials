import java.util.Scanner;
public class Main
{
	public static void main(String []args)
	{//super class is called reading material
	//subclasses are the different types of reading materials 
		textBook text= new textBook();
		String Text=text.TextBookChoices();
		System.out.println(Text);
		System.out.println();
		novel Novel= new novel();
		String novelBook=Novel.novelChoices();
		System.out.println(novelBook);
		System.out.println();
		magazines mag= new magazines();
		String Magazines=mag.magazineChoices();
		System.out.println(Magazines);
		System.out.println();
		technicalJournals techJournal= new technicalJournals();
		String TechJournal= techJournal.technicalJournalChoice();
		System.out.println(TechJournal);
	}
}
