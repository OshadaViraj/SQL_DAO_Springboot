package pl.danielblacha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.danielblacha.dao.BookDao;
import pl.danielblacha.dao.UserDao;
import pl.danielblacha.model.Book;
import pl.danielblacha.model.User;
import pl.danielblacha.model.UserDetails;

@SpringBootApplication
public class MyLibraryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(MyLibraryApplication.class, args);

		/*
		BookDao dao=ctx.getBean(BookDao.class);
		Book book=new Book("Spring jest super","author","isbn");
		dao.save(book);
		ctx.close();
*/


		UserDao userDao=ctx.getBean(UserDao.class);
		User user=new User("johny123","paspas122","johny@wp.pl");
		UserDetails details=new UserDetails("John","Smith","Mickiewicza 34, Warszawa");
		user.setUserDetails(details);

		userDao.save(user);

		ctx.close();
	}
}
