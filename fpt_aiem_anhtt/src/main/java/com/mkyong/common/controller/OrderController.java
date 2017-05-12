package com.mkyong.common.controller;

import com.google.gson.Gson;
import com.mkyong.common.entities.User;
import com.mkyong.common.model.Active;
import com.mkyong.common.model.ActiveList;
import com.mkyong.common.model.Credit;
import com.mkyong.common.model.OrderRequest;
import com.mkyong.common.services.UserImpl;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
	@Autowired
	private UserImpl userImpl;

	@RequestMapping(value = { "/" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String printWelcome(ModelMap model) {
		return "hello";
	}

	@RequestMapping(value = { "/checkCallAPI" }, method = {
			org.springframework.web.bind.annotation.RequestMethod.POST })
	@ResponseBody
	public String hello(@RequestBody OrderRequest request) throws Exception {
		sendPost(request.getPhoneNumber());
		return "Ok";
	}

	@RequestMapping(value = { "/wellcome" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String wellcome() throws Exception {
		return "wellcome";
	}

	private void sendPost(Integer phoneNumber) throws Exception {
		UUID idOne = UUID.randomUUID();
		User user = new User();
		user.setPhoneNumber("+84" + phoneNumber.toString());
		user.setCreditId(idOne.toString());
		user.setBalance(Integer.valueOf(100000));
		this.userImpl.saveUser(user);

		String URL_SECURED_BY_BASIC_AUTHENTICATION = "https://partner.tw.juiker.net/3rdParty/ISR/subscribePackageV2";

		HttpClient client = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost(URL_SECURED_BY_BASIC_AUTHENTICATION);

		ActiveList activeList = new ActiveList();

		Active active = new Active();
		active.setActivate(true);
		active.setPhoneNumber(phoneNumber.toString());
		active.setDIDNumber("");
		active.setPackageId(553);

		List<Credit> credits = new ArrayList();
		Credit credit = new Credit();
		credit.setCreditID(idOne.toString());
		credit.setCreditType("money");
		credit.setCurrency("VND");
		credit.setExpiry(0);
		credit.setPayType(2);
		credit.setPriority(50);
		credit.setQuantity(5000);

		credits.add(credit);

		active.setCredits(credits);
		Gson gson = new Gson();
		activeList.getActivateList().add(active);
		String test = gson.toJson(activeList);
		String testSub = test.replace("packageId", "package");

		StringEntity postingString = new StringEntity(testSub);

		post.setEntity(postingString);
		post.setHeader("Content-type", "application/json");
		post.setHeader("Authorization", "Basic SVBUN3lWOHJNeFdUVjpHRmViTEp1WHdGUTZZRkUy");

		HttpResponse response = client.execute(post);
		System.out.println("\nSending 'POST' request to URL : " + URL_SECURED_BY_BASIC_AUTHENTICATION);
		System.out.println("Post parameters : " + post.getEntity());
		System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		System.out.println(result.toString());
	}
}
