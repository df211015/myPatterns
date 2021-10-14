package com.example.demo100;

import cn.yichehuoban.op.usedcarapi.comm.PermissionUtils;
import cn.yichehuoban.op.usedcarapi.dto.DealerAccountVo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo100Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo100Application.class, args);

//		Request req = new Request();
//		req.setRequestStr("<script>,hello,敏感词汇！");
//		Response res = new Response();
//		res.setResponseStr("<script>,hello,敏感词汇！");
//
//		FilterChain chain = new FilterChain();
//		chain.addFilter(new HtmlFilterImpl()).addFilter(new SensitiveFilterImpl());
//		chain.doFilter(req, res);

//		BeanUtils.copyProperties(carBasicVo, simpleCarBasicVo);

//		CarBasicVo carBasicVo = new CarBasicVo();
//		carBasicVo.setId(100);
//		carBasicVo.setUserName("张三");
//		carBasicVo.setAge(10);
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(2010,01,14);
//		carBasicVo.setBirthday(calendar.getTime());
//		carBasicVo.setMoney(100d);
//		carBasicVo.setDesc("测试描述");
//		CarBasicVo.Innercls1 innercls1 = new CarBasicVo.Innercls1();
//		innercls1.setInnerStr("我的测试");
//		carBasicVo.setInnercls001(innercls1);
//
//		SimpleCarBasic simpleCarBasicVo = new SimpleCarBasic();
//		SimpleCarBasic.Innercls2 innercls2 = new SimpleCarBasic.Innercls2();
//		simpleCarBasicVo.setInnercls001(innercls2);
//
//		BeanUtils.copyProperties(carBasicVo, simpleCarBasicVo);
//		BeanUtils.copyProperties(carBasicVo.getInnercls001(),simpleCarBasicVo.getInnercls001());

		//{"token":"5a390bb60e0a4699812c1e568d14d443","env":"test","sysCode":"app","authorization":"5a390bb60e0a4699812c1e568d14d443","accountId":null,"dealerId":null,"tcDealerId":null}
		DealerAccountVo userInfoByToten = PermissionUtils.getUserInfoByToten("test", "5a390bb60e0a4699812c1e568d14d443", "app");

		String str = "";
	}

}