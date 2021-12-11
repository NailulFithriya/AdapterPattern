package StrategyPattern;

public class RubbishBin{
    private Rubbish rubbish;

    public void setRubbishBin(Rubbish rubbish){
        this.rubbish = rubbish;
    }

    public Rubbish getRubbishBin(){
        return rubbish;
    }

    public void TakeRubbish(){
        System.out.println(rubbish.getRubbish());
    }
}
