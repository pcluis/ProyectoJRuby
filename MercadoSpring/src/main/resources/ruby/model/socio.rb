require 'rubygems'
require 'activerecord-jdbc-adapter'

class SocioDAO

  class Socio < ActiveRecord::Base
  	has_many :documentos
  end

  def self.create()
  	Socio.create!(nombres: 'Luis')
  end

end