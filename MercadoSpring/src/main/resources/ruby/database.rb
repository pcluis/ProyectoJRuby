require 'rubygems'
require 'activerecord-jdbc-adapter'

ActiveRecord::Base.establish_connection(
  :adapter => 'mysql',
  :host => "localhost",
  :database => 'mercadospring',
  :username => 'root',
  :password => 'mysql'
)

ActiveRecord::Schema.define do
  create_table :socios, force: true do |t|
    t.string   :nombres				,limit: 50
    t.string   :paterno				,limit: 50
    t.string   :materno				,limit: 50
    t.date     :fechanacimiento
    t.integer  :sexo
    t.integer  :estadocivil
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

class Greeter < ActiveRecord::Base

  def self.say_hi(name = "hola")
    puts "Hi from activerecord #{name}"
  end

end

Greeter.say_hi