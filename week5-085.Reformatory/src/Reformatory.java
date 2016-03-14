public class Reformatory 
{
    private int weightsMeasure = 0;
    public int weight(Person person) 
    {
        this.weightsMeasure++;
        return person.getWeight();
    }
    public void feed(Person person)
    {
       person.setWeight(person.getWeight()+1);
    }
    public int totalWeightsMeasured()
    {
        return this.weightsMeasure;
    }

}
