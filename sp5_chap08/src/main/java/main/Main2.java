package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberNotFoundException;
import spring.WrongIdPasswordException;

public class Main2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppCtx.class);

        MemberDao md = ctx.getBean(MemberDao.class);
        System.out.println(md.countTest());
//        System.out.println(md.selectMemberTest2(1));
        System.out.println(md.selectByEmail("Hong@naver.com"));
		ctx.close();

	}
}
