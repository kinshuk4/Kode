package ex7;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class ThreadScope implements Scope {

	private final ThreadLocal threadScope = new ThreadLocal() {
		protected Object initialValue() {
			return new HashMap();
		}
	};

	public Object get(String name, ObjectFactory objectFactory) {
		Map scope = (Map) threadScope.get();
		Object object = scope.get(name);
		if (object == null) {
			object = objectFactory.getObject();
			scope.put(name, object);
		}
		return object;
	}

	public Object remove(String name) {
		Map scope = (Map) threadScope.get();
		return scope.remove(name);
	}

	public String getConversationId() {
		return Thread.currentThread().getName();
	}

	@Override
	public Object resolveContextualObject(String arg0) {
		return threadScope;
	}

	public void registerDestructionCallback(String name, Runnable callback) {
		//not supported by our implementation
	}
}
