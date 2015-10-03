require 'rubygems'
require 'activerecord-jdbc-adapter'

class Socio < ActiveRecord::Base
  	has_many :documentos
  	
  	def self.nuevoSocio param = "sin parametro"
  	  s = Socio.new
  	  s.nombres = param
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