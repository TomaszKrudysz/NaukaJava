package jezykJava;

import mojPierwszyPakiet.mojaPierwszaKlasaWIntellij;
/**
 * Created by tkrud on 14.04.2022.
 */
public class przykladowaKlasa {
    private mojaPierwszaKlasaWIntellij mojaPierwszaKlasaWIntellij;
    private int x;
    private int y;

    public przykladowaKlasa(){

    }
    public przykladowaKlasa(int x, int y){
        this.x=x;
        this.y=y;
    }
    private int dodajDwieLiczbyDoSiebie (int x, int y){
        return x + y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
