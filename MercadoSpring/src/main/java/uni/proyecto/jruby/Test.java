package uni.proyecto.jruby;

import java.util.ArrayList;
import java.util.List;

import org.jruby.embed.PathType;
import org.jruby.embed.ScriptingContainer;
import org.jruby.runtime.builtin.IRubyObject;

public class Test {
	
	public static void main(String[] args) {
		
		String jrubyhome = "C:\\jruby-9.0.1.0";
		String rubyclass = "\\src\\main\\resources\\ruby\\database.rb";
		
		ScriptingContainer container = new ScriptingContainer();
		List<String> paths = new ArrayList<String>();
		
		paths.add(jrubyhome);
		
		//HOME DIRECTORY DEBE APUNTAR A LA CARPETA DEL JRUBY
		container.setHomeDirectory(jrubyhome);
		//EL PATHTYPE RELATIVE HACE REFERENCIA A LA CARPETA DE NUESTO PROYECTO
		container.runScriptlet(PathType.RELATIVE, rubyclass);
		
		Object test = container.get("Greeter");

		container.callMethod(test, "say_hi", "gdfg");
		IRubyObject a = (IRubyObject) container.get("Greeter");
		System.out.println(a.callMethod(a.getRuntime().getCurrentContext(), "say_hi"));
		
		System.out.println(test.toString());
		
	}
	
}
