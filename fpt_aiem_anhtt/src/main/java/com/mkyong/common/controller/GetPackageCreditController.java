package com.mkyong.common.controller;

import com.mkyong.common.entities.User;
import com.mkyong.common.model.Credit;
import com.mkyong.common.model.GetPackageCreditRequest;
import com.mkyong.common.model.GetPackageCreditResponse;
import com.mkyong.common.services.UserImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GetPackageCreditController {
	@Autowired
	private UserImpl userImpl;

	@RequestMapping(value = { "/getPackageCredit" }, method = {
			org.springframework.web.bind.annotation.RequestMethod.POST })
	@ResponseBody
	public final Map<Object, Object> doPost(@RequestBody GetPackageCreditRequest request,
			HttpServletResponse responseServelet) throws Exception {
		Map<Object, Object> response = new HashMap();
		GetPackageCreditResponse data = new GetPackageCreditResponse();

		data.setPhoneNumber(request.getPhoneNumber());
		data.setDIDNumber(request.getDidNumber());
		data.setReturnCode(0);
		data.setReturnMsg("");

		User user = this.userImpl.getUserByPhoneNumber(request.getPhoneNumber());
		if (user == null) {
			UUID idOne = UUID.randomUUID();
			user = new User();
			user.setPhoneNumber(request.getPhoneNumber());
			user.setCreditId(idOne.toString());
			user.setBalance(Integer.valueOf(100));
			this.userImpl.saveUser(user);
		}
		List<Map<Object, Object>> packages = new ArrayList();
		Map<Object, Object> packageElm = new HashMap();
		List<Credit> credits = new ArrayList();
		Credit credit = new Credit();
		credit.setCreditID(user.getCreditId());
		credit.setCreditType("money");
		credit.setCurrency("VND");
		credit.setExpiry(0);
		credit.setPayType(2);
		credit.setPriority(50);
		credit.setQuantity(user.getBalance().intValue());

		credits.add(credit);
		packageElm.put("credits", credits);
		packageElm.put("package", Integer.valueOf(553));
		packages.add(packageElm);

		data.setPackages(packages);

		response.put("returnCode", Integer.valueOf(data.getReturnCode()));
		response.put("returnMsg", data.getReturnMsg());
		response.put("phoneNumber", data.getPhoneNumber());
		response.put("packages", data.getPackages());
		response.put("DIDNumber", data.getDIDNumber());

		return response;
	}
}
