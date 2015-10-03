package uni.proyecto.util;

import org.jruby.embed.PathType;
import org.jruby.embed.ScriptingContainer;

public class JRuby{
	
	public String JRUBYHOME = "C:\\jruby-9.0.1.0";
	public String JRUBYINITDB = "\\src\\main\\resources\\ruby\\database.rb";
	public String SOCIORB = "\\WEB-INF\\classes\\ruby\\model\\socio.rb";
	
	private ScriptingContainer container = new ScriptingContainer();

	public JRuby() {
		
		container.setHomeDirectory(JRUBYHOME);
		
	}
	
	public void crearDB(){
		
		container.runScriptlet(PathType.RELATIVE, JRUBYINITDB);
		
	}
	
	public ScriptingContainer getContainer() {
		return container;
	}
	
}
