package arrays;

public class Pokemon {
private int level;
private int hp;
private String name;
private boolean poisoned;

public void pokemon(String name, int level ){
hp = 100;
this.poisoned = false;
this.name=name;
this.level=level;

}
public void iChooseYou(String name){
	System.out.println(name+","+name);

}
public int getHP(){
	return hp;
}
public String getName(){
	return name;
}
	
public void attack(Pokemon target,Attack attack){
	if(Math.random()<.9){
		attack.attack(target);
		System.out.println("the attack hit");
	}
	else{ System.out.println("the attack hit");
}
	}
}


