public abstract class Mammal
{
    public  void nursesYoung()
    {
        String className = this.getClass().getSimpleName();
        System.out.println("I am a " + className + ". I am  nursing.");
    }
}
