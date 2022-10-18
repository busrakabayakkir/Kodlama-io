import entities.Courses;
import coreLoging.DataBaseLogger;
import coreLoging.FileLogger;
import coreLoging.ILogger;
import coreLoging.MailLogger;
import entities.Categories;
import entities.Educator;

public class Main {

	public static void main(String[] args) {
		
		ILogger[]loggers = { new DataBaseLogger(),new FileLogger(),new MailLogger()};
		
		Courses course1 = new Courses();
		course1.setCourseName("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)");
		course1.setDescription("2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını");
		//course1.setEducatorName();
		course1.setImageText("Photo1");
		course1.setPrice(0);
		
		
		
		Categories category1 = new Categories();
		category1.setCategoryName("Programlama");
		
		
		Educator educator1 = new Educator();
		educator1.setEducatorName("Engin Demiroğ");
		educator1.setEducatorInfo("abcdefg");
		educator1.setEducatorImage("image1");
 		
		
		System.out.println(course1.getImageText()+"   "+course1.getCourseName()+"   "+course1.getDescription()+"   "+course1.getPrice()+category1.getCategoryName()+educator1.getEducatorImage()+educator1.getEducatorName() );

	}
	
}



                    