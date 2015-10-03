require 'rubygems'
require 'activerecord-jdbc-adapter'

ActiveRecord::Base.establish_connection(
  :adapter => 'postgresql',
  :host => "localhost",
  :database => 'mercadospring',
  :username => 'postgres',
  :password => '123456'
)

class Socio < ActiveRecord::Base
  	has_many :documentos
  	
  	def self.nuevoSocio socio = nil
  	  data = JSON.parse(socio)
  	  puts data
  	  s = Socio.new(data)
  	  if s.save
  	  	puts s.nombres 
  	  else
  	    puts s.errors.full.messages
  	  end
  	end
  	
  	def self.leerSocio id = nil
  	  if id.present?
  	  	s = Socio.find(id)
  	  	ActiveRecord::Base.include_root_in_json = true
  	  	s.to_json
  	  end
  	end
  	
end