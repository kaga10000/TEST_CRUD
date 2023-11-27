package TEST.MYPROJECT.FIGHTING.Dto;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;
import lombok.experimental.Accessors;
@Alias("test")
@Data
@Accessors(chain = true)
public class test {
	private int test_code;
	private String test_title;
	private String test_contents;
}