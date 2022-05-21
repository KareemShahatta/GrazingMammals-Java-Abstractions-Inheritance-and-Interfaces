public class Ruminant extends GrazingMammal
{
    public void chewsCud()
    {
        String className = this.getClass().getSimpleName();
        System.out.println("I am a " + className + ". I am chewing cud.");
    }
}
