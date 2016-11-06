/**
 *@author Глазунов А.С.
 */
public enum Direction {

    TOP("Верх"),
    LEFT("Лево"),
    BOTTOM("Вниз"),
    RIGHT("Право"),;

    private String str;

    Direction(String str){
        this.str = str;
    }

    public String toString(){
        return str;
    }
}
