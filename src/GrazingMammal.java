public abstract class GrazingMammal extends Mammal implements RuminantTester
{
    public void grazes()
    {
        String className = this.getClass().getSimpleName();
        System.out.println("I am a " + className + ". I am grazing.");
    }

    @Override
    public void testHasMultipleStomachs()  {
        String className = this.getClass().getName();
        if (this instanceof Ruminant)
            System.out.println("I am a " + className + ". I have multiple stomachs.");
        else
            System.out.println("I am a " + className + ". I do not have multiple stomachs.");
    }

    @Override
    public void testIfRuminant()  {
        String className = this.getClass().getName();
        if (this instanceof Ruminant )
            System.out.println("I am a " + className + ". I am a Ruminant.");
        else
            System.out.println("I am a " + className + ". I am not a Ruminant.");
    }
}
