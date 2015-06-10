package ex3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//Pure annotations approach for managing the lifecycle
@Component("bean3") //No need to configure this bean in the xml
public class LifecycleBean3 {

	@Resource
	private ApplicationContext ctx;

	@PostConstruct
	public void setup() {
		//some custom initialization
		System.out.println("@PostContruct method of LifecycleBean3 called..");
	}

	@PreDestroy
	public void cleanup() {
		//some custom cleanup
		System.out.println("@PreDestroy method of LifecycleBean3 called..");
	}	
}
