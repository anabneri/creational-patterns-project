package anabneri.prototype.animation;



import anabneri.prototype.animation.model.Person;
import anabneri.prototype.animation.model.PersonSamples;

import java.util.ArrayList;
import java.util.List;

public class ClientAnimation {
	private static List<Person> frames = new ArrayList<Person>();
	
	public static void animate() throws InterruptedException {
		System.out.println("*********************************");
		System.out.println("* ");
		System.out.println("* Adjust your screen's height!");
		System.out.println("* ");
		System.out.print("*********************************");
		Thread.sleep(3000);
		for(Person frame: frames) {
			frame.draw();
			Thread.sleep(500);
		}
		System.out.println("**********************");
		System.out.println("* ");
		System.out.println("* The End!");
		System.out.println("* ");
		System.out.print("**********************");
	}

	// mudo a instancia da pessoa atual, utlizando uma copia
	public static Person addLeft(Person p) throws CloneNotSupportedException {
		Person person = (Person) p.clone();
		person.left();
		frames.add(person);
		return person;
	}

	public static Person addRight(Person p) throws CloneNotSupportedException {
		Person person = (Person) p.clone();
		person.right();
		frames.add(person);
		return person;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		PersonSamples samples = new PersonSamples();
		
		Person person = samples.get("stickMan");
//		Person person = samples.get("fatMan");
		frames.add(person);
		person = addLeft(person);
		person = addLeft(person);
		person = addLeft(person);
		person = addRight(person);
		person = addRight(person);
		person = addRight(person);
		person = addRight(person);
		person = addRight(person);
		person = addRight(person);
		person = addRight(person);
		person = addLeft(person);
		person = addLeft(person);
		person = addLeft(person);
		animate();
	}
}
