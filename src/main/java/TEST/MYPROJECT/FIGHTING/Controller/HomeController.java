package TEST.MYPROJECT.FIGHTING.Controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import TEST.MYPROJECT.FIGHTING.Dao.HomeDao;
import TEST.MYPROJECT.FIGHTING.Dto.test;
import TEST.MYPROJECT.FIGHTING.MM.HomeService;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private HomeService hs;
	private HomeDao hdao;

	ModelAndView mav;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Integer pageNum) {
		mav = hs.home(pageNum);
		return mav;
	}
	@RequestMapping(value = "test_read_page", method = RequestMethod.GET)
	public ModelAndView test_read_page(@RequestParam("test_code") String test_code) {
		mav = hs.test_read_page(test_code);
		mav.setViewName("Testdb/test_read_page");
		return mav;
	}
	@RequestMapping(value = "test_update_page", method = RequestMethod.GET)
	public ModelAndView test_update_page(@RequestParam("test_code") String test_code) {
		mav = hs.test_read_page(test_code);
		mav.setViewName("Testdb/test_update_page");
		return mav;
	}
	@RequestMapping(value = "test_update_contents", produces="text/plain; charset=UTF-8")
	public String test_update_contents(test test){
		hs.test_update_contents(test);
		return "redirect:/";
	}
	@RequestMapping(value = "test_delete")
	public String test_delete(@RequestParam("test_code") String test_code){
		hs.test_delete(test_code);
		return "redirect:/";
	}

	@RequestMapping(value = "test_write")
	public ModelAndView test_write(test test, HttpServletRequest req, HttpServletResponse response) throws IOException {
		mav = hs.test_write(test, req, response);
		return mav;
	}
}
