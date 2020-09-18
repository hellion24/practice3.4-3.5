public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft.x=x1;
        topLeft.y=y1;
        bottomRight.x=x2;
        bottomRight.y=y2;
        topLeft.xSpeed=xSpeed;
        bottomRight.xSpeed=xSpeed;
        topLeft.ySpeed=ySpeed;
        bottomRight.ySpeed=ySpeed;
    }

    public boolean speedCheck(){
        if(bottomRight.xSpeed==topLeft.xSpeed && bottomRight.ySpeed==topLeft.ySpeed){
            return true;
        }
        else return false;
    }    @Override
    public void moveUp() {
        topLeft.y+=topLeft.ySpeed;
        bottomRight.y+=bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y-=topLeft.ySpeed;
        bottomRight.y-=bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x-=topLeft.xSpeed;
        bottomRight.x-=bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x+=topLeft.xSpeed;
        bottomRight.x+=bottomRight.xSpeed;
    }

    public String toString(){
        if(speedCheck()){
            return "coordinates of the top-left point of the rectangle ("+topLeft.x+";"+topLeft.y+"), bottom-right ("+bottomRight.x+";"+bottomRight.y+")";
        }
        else return "speeds don't match";
    }
}
