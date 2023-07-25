package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        char brick = '8';
        char empty = ' ';

        for( int y=0 ; y < height; y++)
        {
            for (int x = 0; x <length; x++)
            {

                if(y != 0 && y != height-1 && x != 0 && x != length-1)
                {
                    System.out.print(empty);
                    continue;
                }

                System.out.print(brick);
            }
            System.out.print('\n');
        }
    }
}
