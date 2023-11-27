package TEST.MYPROJECT.FIGHTING.MM;

import java.io.IOException;
import java.io.Writer;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import TEST.MYPROJECT.FIGHTING.Dao.HomeDao;
import TEST.MYPROJECT.FIGHTING.Dto.test;
import TEST.MYPROJECT.FIGHTING.Dto.Paging;

/**
 * Handles requests for the application home page.
 */
@Service
public class HomeService {
	@Autowired
	private HomeDao hdao;

	ModelAndView mav;

	 private String Paging(Integer pageNum) {
			int maxNum = hdao.getBoardCount(); // 총 게시물 카운트메소드
			int listCount = 10; // 페이지당 글의 개수
			int pageCount = 10; // 그룹당 페이지 개수
			Paging paging = new Paging(maxNum, pageNum, listCount, pageCount);
			return paging.makeHtmlPaging();
		}
	public ModelAndView test_write(test test, HttpServletRequest req, HttpServletResponse response) throws IOException {
		mav = new ModelAndView();
		String test_title = req.getParameter("test_title");
		String test_contents = req.getParameter("test_contents");
		test.setTest_title(test_title).setTest_contents(test_contents);
		if (test_title != null && test_contents != "") {
			hdao.test_write(test);
		} else {
			Writer out = response.getWriter();
			String message = URLEncoder.encode("내용을 입력하세용!!", "UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			out.write("<script type=\"text/javascript\">alert(decodeURIComponent('" + message
					+ "'.replace(/\\+/g, '%20'))); history.go(-1);</script>");
			out.flush();
			response.flushBuffer();
			out.close();
			return null;
		}
		mav.setViewName("Testdb/testdb2");
		return mav;
	}

	public ModelAndView home(Integer pageNum) {
		mav = new ModelAndView();
		List<test> post_list = null;
		pageNum = (pageNum == null) ? 1 : pageNum;
		System.out.println(pageNum);
		post_list = hdao.select_test_post(pageNum);
		System.out.println(post_list);
		mav.addObject("post_list", post_list);
		mav.setViewName("home");
		mav.addObject("Paging",Paging(pageNum));
		return mav;
	}
	public ModelAndView test_read_page(String test_code) {
		mav = new ModelAndView();
		List<test> post_list = null;
		post_list = hdao.select_read_page(test_code);
		System.out.println(post_list);
		mav.addObject("post_list", post_list);
		return mav;
	}

	public void test_update_contents(test test) {
		hdao.test_update_contents(test);
	}

	public void test_delete(String test_code) {
		hdao.test_delete(test_code);
		
	}
}
