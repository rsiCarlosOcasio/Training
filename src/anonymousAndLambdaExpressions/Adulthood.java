package anonymousAndLambdaExpressions;

public class Adulthood {
    private IAge human = new IAge() {
        @Override
        public int getAge() { return 21; }
    };        
    public int getDogAge() { return dog.getAge(); }
    private IAge dog = () -> 5;        
    public int getHumanAge() { return human.getAge(); }
}
