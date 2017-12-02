/*
 *
 * Copyright ⓒ LG CNS, Inc. All rights reserved.
 * 
 * Do Not Erase This Comment!!!
 * 
 * 본 프로그램의 모든 내용은 LG CNS "SmartChannelPlatform" 이하 SCP의 자산이므로 
 * 어떤한 경우라도 허락없이 재배포 하거나 LG CNS 외부로의 유출이 금지되어 있습니다.
 * 
 * 프로젝트에서 SCP를 사용하거나 SCP를 변경한 경우 프로젝트 정보와 변경된 내용을 SCP 팀에 알려야 한다.
 */

package devonframework.sample.office.employee.biz;

import devon.core.collection.LData;
import devon.core.collection.LMultiData;
import devon.core.exception.LException;
import devonframework.persistent.autodao.LCommonDao;

public class EmployeeBiz {

	public LMultiData retrieveEmployeeList(LData input) throws LException {

		LMultiData result = new LMultiData();
		LCommonDao dao = new LCommonDao("employee/retrieveEmployeeList", input, "default");
		result = dao.executeQuery();
		return result;

	}

}
