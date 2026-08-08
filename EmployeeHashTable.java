public class EmployeeHashTable
{
    private LinkedList3<Employee>[] hashArray;

    private static final int SIZE = 10;

    @SuppressWarnings("unchecked")
    public EmployeeHashTable()
    {
        hashArray = (LinkedList3<Employee>[]) new LinkedList3[SIZE];
        for (int i = 0; i < SIZE; i++)
        {
            hashArray[i] = new LinkedList3<Employee>();
        }
    }

    private int computeHash(String name)
    {
        int hash = 0;
        for (int i = 0; i < name.length(); i++)
        {
            hash += name.charAt(i);
        }
        return hash % SIZE;
    }

    public void add(Employee employee)
    {
        int hash = computeHash(employee.getName());
        hashArray[hash].addToStart(employee);
        System.out.println(
            employee.getName()
            + " added to bucket "
            + hash
        );
    }

    public Employee get(String name)
    {
        int hash = computeHash(name);
        return hashArray[hash].getByEmployeeName(name);
    }

    public int getBucket(String name)
    {
        return computeHash(name);
    }

    public void displayTable()
    {
        System.out.println("\nHASH TABLE");
        for (int i = 0; i < SIZE; i++)
        {
            System.out.println("\nBucket " + i + ":");
            if (hashArray[i].isEmpty())
            {
                System.out.println("   Empty");
            }
            else
            {
                hashArray[i].outputList();
            }
        }
    }
}