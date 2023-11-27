package TEST.MYPROJECT.FIGHTING;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import TEST.MYPROJECT.MAPPER.TimeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TimeMapperTests {

	@Autowired
	private TimeMapper timeMapper;
	@Test
	public void testGetTime2() {
		System.out.println(timeMapper.getTime2());
		System.out.println("MAPPER TEST");
	}
	@Test
	public void testGetTime() {
		System.out.println(timeMapper.getTime());
	}
}
