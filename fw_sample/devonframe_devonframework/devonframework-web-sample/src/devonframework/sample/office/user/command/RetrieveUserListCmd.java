package devonframework.sample.office.user.command;

import devon.core.collection.LMultiData;
import devonframework.business.sd.LServiceProxy;
import devonframework.front.channel.context.LActionContext;
import devonframework.front.command.LAbstractCommand;
import devonframework.sample.office.user.biz.UserBiz;

public class RetrieveUserListCmd extends LAbstractCommand {

	@Override
	public void execute() throws Exception {
		UserBiz biz = LServiceProxy.getProxy("default", UserBiz.class);
		LMultiData resultList = biz.retrieveUserList(data);
		LActionContext.setAttribute("input", data);
		LActionContext.setAttribute("resultList", resultList);
		LActionContext.setAttribute("joblevelCodeList", null);
		LActionContext.setAttribute("skillCodeList", null);
	}

}
