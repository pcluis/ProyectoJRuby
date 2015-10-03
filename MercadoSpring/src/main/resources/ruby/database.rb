require 'rubygems'
require 'activerecord-jdbcpostgresql-adapter'

ActiveRecord::Base.establish_connection(
  :adapter => 'postgresql',
  :host => "localhost",
  :database => 'mercadospring',
  :username => 'postgres',
  :password => '123456'
)

ActiveRecord::Schema.define do
  create_table :socios, force: true do |t|
    t.string   :nombres				,limit: 50
    t.string   :paterno				,limit: 50
    t.string   :materno				,limit: 50
    t.date     :fechanacimiento
    t.integer  :sexo
    t.integer  :estadocivil
    t.integer  :tipodocumento
    t.string   :numerodocumento
    t.binary   :foto
    t.binary   :huella
    t.binary   :firma
    t.timestamps null: true
  end

  create_table :documentos, force: true do |t|
    t.string   :tipo					,limit: 20
    t.string   :numero					,limit: 12
    t.belongs_to :socios, index: true
    t.timestamps null: false
  end
  
  create_table :domicilios, force: true do |t|
    t.string   :direccion				,limit: 100, null: false
    t.string   :codigoubigeo			,limit: 6, null: false
    t.belongs_to :socios, index: true
    t.timestamps null: false
  end
  
  create_table :fichas, force: true do |t|
    t.datetime :fecharegistro			,null: false
    t.integer  :estado					,null: false
    t.string   :observacion				,limit: 150, default: ""
    t.timestamps null: false
  end
  
  create_table :establecimientos, force: true do |t|
    t.string   :tipo
    t.string   :numero
    t.string   :pabellon
    t.string   :giro
    t.integer  :estado
    t.decimal  :precio
    t.string   :mapakey
    t.timestamps null: false
  end
  
  create_table :establecimientofotos, force: true do |t|
    t.binary   :foto
    t.string   :descripcion
    t.belongs_to :establecimiento, index: true
    t.timestamps null: false
  end
  
  create_table :sociofichas, force: true do |t|
    t.integer  :estado
    t.decimal  :preciocompra
    t.belongs_to :socios, :fichas, :establecimientos
    t.timestamps null: false
  end
  
end

##
#class Show < ActiveRecord::Base
#  has_many :episodes, inverse_of: :show
#end
#
#class Episode < ActiveRecord::Base
#  belongs_to :show, inverse_of: :episodes, required: true
#end
#
# Create a few records...
#show = Show.create!(name: 'Big Bang Theory')
#
#first_episode = show.episodes.create!(name: 'Pilot')
#second_episode = show.episodes.create!(name: 'The Big Bran Hypothesis')
#
#episode_names = show.episodes.pluck(:name)
##

class Establecimiento < ActiveRecord::Base
  
end


Establecimiento.create!(tipo: 'P', numero: '1', pabellon: 'A', giro: nil, estado: 0, precio: 1500, mapakey: 'ap1')
Establecimiento.create!(tipo: 'P', numero: '2', pabellon: 'A', giro: nil, estado: 0, precio: 1500, mapakey: 'ap2')
Establecimiento.create!(tipo: 'P', numero: '3', pabellon: 'A', giro: nil, estado: 0, precio: 1500, mapakey: 'ap3')
Establecimiento.create!(tipo: 'P', numero: '4', pabellon: 'A', giro: nil, estado: 0, precio: 1500, mapakey: 'ap4')
Establecimiento.create!(tipo: 'E', numero: '1', pabellon: 'A', giro: nil, estado: 0, precio: 1000, mapakey: 'ae1')
Establecimiento.create!(tipo: 'E', numero: '2', pabellon: 'A', giro: nil, estado: 0, precio: 1000, mapakey: 'ae2')
Establecimiento.create!(tipo: 'E', numero: '3', pabellon: 'A', giro: nil, estado: 0, precio: 1000, mapakey: 'ae3')
Establecimiento.create!(tipo: 'E', numero: '4', pabellon: 'A', giro: nil, estado: 0, precio: 1000, mapakey: 'ae4')
Establecimiento.create!(tipo: 'E', numero: '5', pabellon: 'A', giro: nil, estado: 0, precio: 1000, mapakey: 'ae5')
Establecimiento.create!(tipo: 'E', numero: '6', pabellon: 'A', giro: nil, estado: 0, precio: 1000, mapakey: 'ae6')
Establecimiento.create!(tipo: 'E', numero: '7', pabellon: 'A', giro: nil, estado: 0, precio: 800, mapakey: 'ae7')
Establecimiento.create!(tipo: 'E', numero: '8', pabellon: 'A', giro: nil, estado: 0, precio: 900, mapakey: 'ae8')
Establecimiento.create!(tipo: 'E', numero: '9', pabellon: 'A', giro: nil, estado: 0, precio: 900, mapakey: 'ae9')
Establecimiento.create!(tipo: 'P', numero: '5', pabellon: 'A', giro: nil, estado: 0, precio: 2000, mapakey: 'ap5')
Establecimiento.create!(tipo: 'P', numero: '6', pabellon: 'A', giro: nil, estado: 0, precio: 2000, mapakey: 'ap6')
Establecimiento.create!(tipo: 'P', numero: '7', pabellon: 'A', giro: nil, estado: 0, precio: 2000, mapakey: 'ap7')

Establecimiento.create!(tipo: 'P', numero: '1', pabellon: 'B', giro: nil, estado: 0, precio: 1200, mapakey: 'bp1')
Establecimiento.create!(tipo: 'P', numero: '2', pabellon: 'B', giro: nil, estado: 0, precio: 1200, mapakey: 'bp2')
Establecimiento.create!(tipo: 'P', numero: '3', pabellon: 'B', giro: nil, estado: 0, precio: 1200, mapakey: 'bp3')
Establecimiento.create!(tipo: 'P', numero: '4', pabellon: 'B', giro: nil, estado: 0, precio: 1200, mapakey: 'bp4')
Establecimiento.create!(tipo: 'J', numero: '1', pabellon: 'B', giro: nil, estado: 0, precio: 400, mapakey: 'bj1')
Establecimiento.create!(tipo: 'J', numero: '2', pabellon: 'A', giro: nil, estado: 0, precio: 400, mapakey: 'bj2')
Establecimiento.create!(tipo: 'J', numero: '3', pabellon: 'B', giro: nil, estado: 0, precio: 400, mapakey: 'bj3')
Establecimiento.create!(tipo: 'J', numero: '4', pabellon: 'B', giro: nil, estado: 0, precio: 400, mapakey: 'bj4')
Establecimiento.create!(tipo: 'E', numero: '1', pabellon: 'B', giro: nil, estado: 0, precio: 1200, mapakey: 'be1')
Establecimiento.create!(tipo: 'E', numero: '2', pabellon: 'B', giro: nil, estado: 0, precio: 1100, mapakey: 'be2')
Establecimiento.create!(tipo: 'E', numero: '3', pabellon: 'B', giro: nil, estado: 0, precio: 1100, mapakey: 'be3')
Establecimiento.create!(tipo: 'E', numero: '4', pabellon: 'B', giro: nil, estado: 0, precio: 1000, mapakey: 'be4')
Establecimiento.create!(tipo: 'P', numero: '5', pabellon: 'B', giro: nil, estado: 0, precio: 2000, mapakey: 'bp5')
Establecimiento.create!(tipo: 'P', numero: '6', pabellon: 'B', giro: nil, estado: 0, precio: 2000, mapakey: 'bp6')
Establecimiento.create!(tipo: 'P', numero: '7', pabellon: 'B', giro: nil, estado: 0, precio: 2000, mapakey: 'bp7')

Establecimiento.create!(tipo: 'P', numero: '1', pabellon: 'C', giro: nil, estado: 0, precio: 1500, mapakey: 'cp1')
Establecimiento.create!(tipo: 'P', numero: '2', pabellon: 'C', giro: nil, estado: 0, precio: 1200, mapakey: 'cp2')
Establecimiento.create!(tipo: 'P', numero: '3', pabellon: 'C', giro: nil, estado: 0, precio: 1500, mapakey: 'cp3')
Establecimiento.create!(tipo: 'P', numero: '4', pabellon: 'C', giro: nil, estado: 0, precio: 1200, mapakey: 'cp4')
Establecimiento.create!(tipo: 'J', numero: '1', pabellon: 'C', giro: nil, estado: 0, precio: 600, mapakey: 'cj1')
Establecimiento.create!(tipo: 'J', numero: '2', pabellon: 'C', giro: nil, estado: 0, precio: 400, mapakey: 'cj2')
Establecimiento.create!(tipo: 'J', numero: '3', pabellon: 'C', giro: nil, estado: 0, precio: 500, mapakey: 'cj3')
Establecimiento.create!(tipo: 'J', numero: '4', pabellon: 'C', giro: nil, estado: 0, precio: 800, mapakey: 'cj4')
Establecimiento.create!(tipo: 'J', numero: '5', pabellon: 'C', giro: nil, estado: 0, precio: 400, mapakey: 'cj5')
Establecimiento.create!(tipo: 'J', numero: '6', pabellon: 'C', giro: nil, estado: 0, precio: 300, mapakey: 'cj6')





class Greeter < ActiveRecord::Base

  def self.say_hi(name = "hola")
    puts "Hi from activerecord #{name}"
  end

end