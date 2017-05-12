package com.mkyong.common.controller;

import com.mkyong.common.entities.User;
import com.mkyong.common.services.UserImpl;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SubrisePackageController {
	@Autowired
	private UserImpl userImpl;

	@RequestMapping(value = { "/subscribePackage" }, method = {
			org.springframework.web.bind.annotation.RequestMethod.POST })
	@ResponseBody
	public final Map<Object, Object> doPost(@RequestBody String request) {
		Map<Object, Object> data = new HashMap();
		data.put("returnCode", Integer.valueOf(0));

		JSONObject jsonObj = new JSONObject(request);
		JSONArray activateList = jsonObj.getJSONArray("activateList");
		JSONObject activate = activateList.getJSONObject(0);
		String phoneNumber = activate.getString("phoneNumber");

		User user = this.userImpl.getUserByPhoneNumber(phoneNumber);
		if (user == null) {
			JSONArray credits = activate.getJSONArray("credits");
			JSONObject credit = credits.getJSONObject(0);
			String creditId = credit.getString("creditID");

			user = new User();
			user.setPhoneNumber(phoneNumber);
			user.setCreditId(creditId);
			user.setBalance(Integer.valueOf(100));
			this.userImpl.saveUser(user);
		}
		return data;
	}
}