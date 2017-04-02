import groovy.transform.ToString;

@ToString(includeNames = true, includeFields = true)
class species{
	def name;
	def sound;
	
	def run(){
		println("$name runs");
	}
	
	def makeSound(){
		println("$name says $sound");
	}
	
	def Animal(name,sound){
		this.name=name;
		this.sound = sound;
	}
}
