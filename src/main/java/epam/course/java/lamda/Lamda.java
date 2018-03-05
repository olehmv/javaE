package epam.course.java.lamda;

import epam.course.java.workflow.Task;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lamda {
    public static void main(String[] args) {
        List<Manager> managers = Arrays.asList(new Manager("Vova",5,"London"), new Manager("Ira",6,"Lviv"), new Manager("Ivan",7,"Lviv"), new Manager("Ostap",8,"Lviv"), new Manager("Ylia",3,"Lviv"));
        List<Manager> collect = managers.stream().limit(4).collect(Collectors.toList());
        assert collect.size()==4:"size is not  4";
        List<Manager> managerList = managers.stream().filter(m -> m.name.startsWith("M")).collect(Collectors.toList());
        assert managerList.size()==0:"size is not 0";
        managers.stream().map(m->{
            return m;
        });
        List<Manager> moreThen5YearExp = managers.stream().filter(m -> m.exiriance > 5).collect(Collectors.toList());
        assert moreThen5YearExp.size()==3;
        List<Manager> mannagersFromLondon = managers.stream().filter(m -> m.city.equals("London")).collect(Collectors.toList());
        assert mannagersFromLondon.size()==1;
        OptionalDouble average = managers.stream().mapToInt(m -> m.exiriance).average();
        System.out.println(average.getAsDouble());
        managers.stream().map(m->m.exiriance+1)
    }
}
