class Address{
	static void main(String[] args){
		//Maps 
		def veerMap = [
		'name' : 'veer',
		'age' : 26,
		'address' : '3525 country square dr',
		'list' : [1, 2 , 3],
		'state' : 'TX'
		];
	
		println("Name " + veerMap['name']);
		println("age "+ veerMap.get('age'));
		veerMap.put(['city' , 'carrollton']);
		println("has city "+ veerMap.containsKey('city'));
		println(veerMap.size());
		
		//Range
		def onetoten = 1..10;
		def atoz = 'a'..'z';
		println(onetoten);
		println(atoz.size());
		println(atoz.get(2));
		println(atoz.getTo());
		println(atoz.getFrom());
		
		//  ==  != < <= > >=   conditional operators
		// && || ! logical operators
		// condition?true:false; terinary operators
		def x=10
		println(x>9?"x ix greaterthan 9":"x is less or equal to 9");
		
	}

}
