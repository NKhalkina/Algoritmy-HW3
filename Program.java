package ru.geekbrains.lesson3;

public class Program {

    public static void main(String[] args) {

        Employee employee2 = new Employee("DDDD", 32);

        Employee employee1 = new Employee("AAAAAA", 34);
        LinkedList<Employee> linkedList1 = new LinkedList<>();
        linkedList1.addFirst(new Employee("AAAAAA", 43));
        linkedList1.addFirst(new Employee("CCCC", 22));
        linkedList1.addFirst(employee1);
        linkedList1.addFirst(new Employee("EEEEE", 55));
        linkedList1.addFirst(new Employee("AAAAAA", 67));
        linkedList1.addFirst(new Employee("DDDD", 32));
        linkedList1.addFirst(new Employee("AAAAAA", 21));

        System.out.println(linkedList1);

        // linkedList1.sort(new EmployeeComparator(SortType.Ascending));

        // System.out.println();
        // System.out.println(linkedList1);

        // linkedList1.sort(new EmployeeComparator(SortType.Descending));

        // System.out.println();
        // System.out.println(linkedList1);

        // LinkedList<Employee>.Node node = linkedList1.contains(employee2);
        // if (node != null){
        //     System.out.println("Элемент найден!");
        //     System.out.println("Значение элемента: " + node.value);
        // }
        // else {
        //     System.out.println("Элемент не найден.");
        // }


        // linkedList1.removeFirst();

        // linkedList1.removeLast();

        linkedList1.reversList();

        System.out.println("-------------------разворот списка-------------------");
        System.out.println(linkedList1);

    }

}