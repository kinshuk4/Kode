package com.vaani.spring.outcontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * Domain object that will not be instantiated in Spring.
 * 
 * @author Nicolas Frankel
 */
@Configurable(dependencyCheck = true)
public class DomainObject {

	/** The object to be injected by Spring. */
	private Injectable injectable;

	public Injectable getInjectable() {

		return injectable;
	}

	@Autowired
	public void setInjectable(Injectable injectable) {

		this.injectable = injectable;
	}
}
