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
  create_table :shows, force: true do |t|
    t.string :name
  end

  create_table :episodes, force: true do |t|
    t.string :name
    t.belongs_to :show, index: true
  end
end

class Show < ActiveRecord::Base
  has_many :episodes, inverse_of: :show
end

class Episode < ActiveRecord::Base
  belongs_to :show, inverse_of: :episodes, required: true
end

# Create a few records...
show = Show.create!(name: 'Big Bang Theory')

first_episode = show.episodes.create!(name: 'Pilot')
second_episode = show.episodes.create!(name: 'The Big Bran Hypothesis')

episode_names = show.episodes.pluck(:name)

class Greeter < ActiveRecord::Base

  def self.say_hi(name = "hola")
    puts "Hi from activerecord #{name}"
  end

end

Greeter.say_hi