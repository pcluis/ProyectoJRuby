require 'rubygems'
require 'activerecord-jdbc-adapter'

class DocumentoDAO

  class Documento < ActiveRecord::Base
    belongs_to :socio
  end
  
  def self.create()
  	Documento.create!(tipo: 'DNI', numero: '12345678')
  end

end
