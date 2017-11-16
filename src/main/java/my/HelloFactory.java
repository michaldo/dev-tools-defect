package my;

import org.springframework.beans.factory.FactoryBean;

public class HelloFactory implements FactoryBean<Hello> {

	private String name;

	public HelloFactory(Boolean name) {
		System.out.println("Factory for " + name);
		this.name = name.toString();
	}

	@Override
	public Hello getObject() throws Exception {
		return new Hello(name);
	}

	@Override
	public Class<?> getObjectType() {
		return Hello.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}