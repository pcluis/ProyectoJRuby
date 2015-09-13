package uni.proyecto.jruby;

import java.util.ArrayList;
import java.util.List;

import org.jruby.embed.PathType;
import org.jruby.embed.ScriptingContainer;

public class Test {
	
	public static void main(String[] args) {
		
		String jrubyhome = "C:\\jruby-9.0.1.0";
		String rubyclass = "C:\\jruby-9.0.1.0\\rubyclasses\\test1.rb";
		
		ScriptingContainer container = new ScriptingContainer();
		List<String> paths = new ArrayList<String>();
		
		paths.add(jrubyhome);
		
		container.setLoadPaths(paths);
		
		container.runScriptlet(PathType.ABSOLUTE, rubyclass);
		
		Object test = container.get("Greeter");
		System.out.println(test.toString());
		
	}
	
}
