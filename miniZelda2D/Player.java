import java.awt.*;
import java.awt.Rectangle;

public class Player extends Rectangle{
    public int spd = 10;
    public boolean right, up, down, left;

    public Player(int x, int y){
        super(x, y, 32, 32);
    }

    public void tick(){//logica
        if (right && World.isFree(x+spd,y)){
            x+=spd;
        }
        else if (left && World.isFree(x-spd,y)){
            x-=spd;
        }
        else if (up && World.isFree(x,y-spd)){
            y-=spd;
        }
        else if (down && World.isFree(x,y+spd)){
            y+=spd;
        }

    }
    public void render(Graphics g){ //renderização
        g.drawImage(Spritesheet.player_front,x,y,32,32, null);

    }
}
