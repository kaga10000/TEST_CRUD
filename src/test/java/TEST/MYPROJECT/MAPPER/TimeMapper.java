package TEST.MYPROJECT.MAPPER;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	public String getTime2();
	
	@Select("SELECT SYSDATE FROM DUAL")
	public String getTime();
}
