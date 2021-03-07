package base;

import aop.AutoWiredBean;
import aop.SimpleAopBean;
import base.aop.AopDemo;
import base.transaction.TransactionBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Boostrap {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        SimpleAopBean aopBean = context.getBean(SimpleAopBean.class);
        AutoWiredBean bean = aopBean.getAutoWiredBean();
        System.out.println(bean);
/*        TransactionBean bean = context.getBean(TransactionBean.class);
        bean.process();*/
    }
	
}
