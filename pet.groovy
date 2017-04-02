class HelloWorld{
	static void main(String[] args){
		
		//def pussy = new pet(name : 'cat', sound : 'meow');
		def pussy = new pet('cat','meow');
		
		println(pussy.name+" says "+pussy.sound);
		
	}

}
