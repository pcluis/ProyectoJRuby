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
		String sociorb = "\\src\\main\\resources\\ruby\\model\\socio.rb";
		String documentorb = "\\src\\main\\resources\\ruby\\model\\documento.rb";
		
		ScriptingContainer container = new ScriptingContainer();
		List<String> paths = new ArrayList<String>();
		
		paths.add(jrubyhome);
		
		//HOME DIRECTORY DEBE APUNTAR A LA CARPETA DEL JRUBY
		container.setHomeDirectory(jrubyhome);
		//EL PATHTYPE RELATIVE HACE REFERENCIA A LA CARPETA DE NUESTO PROYECTO
		container.runScriptlet(PathType.RELATIVE, rubyclass);
		
		//SE CARGA EL SOCIO.RB
		container.runScriptlet(PathType.RELATIVE, sociorb);
		
		container.runScriptlet(PathType.RELATIVE, documentorb);
		
		//RECORDAR QUE DENTRO DEL GET SE PONE EL NOMBRE DE LA CLASE
		Object test = container.get("Greeter");
		container.callMethod(test, "say_hi", "gdfg");
		
		//IRUBYOBJECT REPRESENTA UN OBJETO DE RUBY
		IRubyObject a = (IRubyObject) container.get("Greeter");
		a.callMethod(a.getRuntime().getCurrentContext(), "say_hi");
		
		//INVOCANDO CREAR SOCIO DE SOCIO.RB
		IRubyObject b = (IRubyObject) container.get("SocioDAO");
		b.callMethod(b.getRuntime().getCurrentContext(), "create");
		
		//AMBAS MANERAS PARA INVOCAR LAS CLASES RUBY SON CORRECTAS
		//USANDO EL CONTAINER DIRECTAMENTE O USANDO LA INTERFAZ IRUBYOBJECT
		
		System.out.println("====Finalizando demo====");
		
	}
	
}
