package TEST.MYPROJECT.FIGHTING.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DbtestController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value = "testdb")
	public String testDB() {
		System.out.println("TEST");
		return "Testdb/testdb";
	}
	@RequestMapping(value = "testdb2")
	public String testDB2() {
		System.out.println("TEST2");
		return "Testdb/testdb2";
	}
}
