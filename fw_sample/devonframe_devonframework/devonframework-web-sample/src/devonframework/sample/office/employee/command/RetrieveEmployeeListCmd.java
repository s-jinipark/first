package devonframework.sample.office.employee.command;

import devon.core.collection.LMultiData;
import devonframework.business.sd.LServiceProxy;
import devonframework.front.channel.context.LActionContext;
import devonframework.front.command.LAbstractCommand;
import devonframework.sample.office.employee.biz.EmployeeBiz;

public class RetrieveEmployeeListCmd extends LAbstractCommand {

	@Override
	public void execute() throws Exception {
		EmployeeBiz biz = LServiceProxy.getProxy("default", EmployeeBiz.class);
		LMultiData resultList = biz.retrieveEmployeeList(data);
		LActionContext.setAttribute("input", data);
		LActionContext.setAttribute("resultList", resultList);
		LActionContext.setAttribute("joblevelCodeList", null);
		LActionContext.setAttribute("skillCodeList", null);
	}

}