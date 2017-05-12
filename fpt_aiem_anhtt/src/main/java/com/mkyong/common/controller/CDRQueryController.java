package com.mkyong.common.controller;

import com.mkyong.common.entities.User;
import com.mkyong.common.model.CDR;
import com.mkyong.common.model.CDRRequest;
import com.mkyong.common.model.CDRResponse;
import com.mkyong.common.services.UserImpl;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CDRQueryController {
	@Autowired
	private UserImpl userImpl;

	@RequestMapping(value = { "/queryCDR" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	@ResponseBody
	public final Map<Object, Object> doPost(@RequestBody CDRRequest request) {
		User user = this.userImpl.getUserByPhoneNumber(request.getPhoneNumber());
		Long timeCall = Long.valueOf(request.getStopTime().getTime() - request.getStartTime().getTime());
		Integer newBalance = Integer.valueOf(user.getBalance().intValue() - timeCall.intValue() / 60);
		user.setBalance(Integer.valueOf(newBalance.intValue() > 0 ? newBalance.intValue() : 0));
		this.userImpl.saveUser(user);

		Map<Object, Object> response = new HashMap();
		CDRResponse data = new CDRResponse();
		data.setPhoneNumber(request.getPhoneNumber());
		data.setDIDNumber(request.getDidNumber());
		data.setReturnCode(0);
		data.setReturnMsg("");

		UUID idOne = UUID.randomUUID();
		List<CDR> cdrs = new ArrayList();

		CDR cdr = new CDR();
		cdr.setStart(request.getStartTime());
		cdr.setEnd(request.getStopTime());
		cdr.setDuration(request.getStopTime().getTime() - request.getStartTime().getTime());
		cdr.setCaller(request.getPhoneNumber());
		cdr.setCallee(request.getPhoneNumber());
		cdr.setHangupcause("ANSWERED");
		cdr.setUsed_credit(1.2D);
		cdr.setCurrency("VND");
		cdr.setCallid(idOne.toString());
		cdrs.add(cdr);

		data.setCdr(cdrs);

		response.put("returnCode", Integer.valueOf(data.getReturnCode()));
		response.put("returnMsg", data.getReturnMsg());
		response.put("phoneNumber", data.getPhoneNumber());
		response.put("cdr", data.getCdr());
		response.put("DIDNumber", data.getDIDNumber());

		return response;
	}
}
