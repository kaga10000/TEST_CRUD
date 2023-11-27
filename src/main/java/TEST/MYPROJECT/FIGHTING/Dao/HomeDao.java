package TEST.MYPROJECT.FIGHTING.Dao;

import java.util.List;

import TEST.MYPROJECT.FIGHTING.Dto.test;

public interface HomeDao {

	void test_write(test test);

	void test();

	List<test> select_test_post(Integer pageNum);

	List<test> select_read_page(String test_code);
 
	void test_update_contents(test test);

	void test_delete(String test_code);

	int getBoardCount();

}
