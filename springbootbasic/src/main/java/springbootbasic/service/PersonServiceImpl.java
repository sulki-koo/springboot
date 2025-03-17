package springbootbasic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import springbootbasic.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	List<Person> personList = null;

	public PersonServiceImpl() {
		personList = new ArrayList<Person>();
		personList.add(new Person(1, "홍길동", 20));
		personList.add(new Person(2, "강감찬", 30));
	}

	@Override
	public List<Person> getPersonList() {
		return personList;
	}

	@Override
	public Person getPerson(int pid) {
		for (Person person : personList) {
			if (person.getPid() == pid) {
				return person;
			}
		}
		return null;
	}

}
