public class EmployeeHashTableApp
{
    public static void main(String[] args)
    {
        EmployeeHashTable hashTable = new EmployeeHashTable();
        Employee employee1 =
                new Employee("Amy", new Date("January", 10, 2020));
        Employee employee2 =
                new Employee("May", new Date("February", 15, 2021));
        Employee employee3 =
                new Employee("John", new Date("March", 20, 2019));
        Employee employee4 =
                new Employee("Sarah", new Date("April", 5, 2022));
        Employee employee5 =
                new Employee("David", new Date("May", 12, 2018));
        Employee employee6 =
                new Employee("Emma", new Date("June", 25, 2023));
        System.out.println("ADDING EMPLOYEES");
        System.out.println("----------------");
        hashTable.add(employee1);
        hashTable.add(employee2);
        hashTable.add(employee3);
        hashTable.add(employee4);
        hashTable.add(employee5);
        hashTable.add(employee6);

        hashTable.displayTable();
        System.out.println("\nRETRIEVING EXISTING EMPLOYEES");
        System.out.println("-----------------------------");
        displaySearchResult(hashTable, "Amy");
        displaySearchResult(hashTable, "John");
        displaySearchResult(hashTable, "Emma");
        System.out.println("\nSEARCHING FOR A NON-EXISTING EMPLOYEE");
        System.out.println("--------------------------------------");
        displaySearchResult(hashTable, "Michael");
        System.out.println("\nCOLLISION TEST");
        System.out.println("--------------");
        int amyBucket = hashTable.getBucket("Amy");
        int mayBucket = hashTable.getBucket("May");
        System.out.println("Amy hashes to bucket: " + amyBucket);
        System.out.println("May hashes to bucket: " + mayBucket);
        if (amyBucket == mayBucket)
        {
            System.out.println(
                    "Collision confirmed: Amy and May are stored in the same bucket."
            );
        }
        else
        {
            System.out.println(
                    "Amy and May do not collide with this hash function."
            );
        }
        System.out.println("\nRETRIEVING EMPLOYEES AFTER COLLISION");
        System.out.println("------------------------------------");
        displaySearchResult(hashTable, "Amy");
        displaySearchResult(hashTable, "May");
    }

    public static void displaySearchResult(
            EmployeeHashTable hashTable,
            String name)
    {
        Employee employee = hashTable.get(name);
        if (employee != null)
        {
            System.out.println("Found: " + employee);
        }
        else
        {
            System.out.println(name + " was not found.");
        }
    }
}