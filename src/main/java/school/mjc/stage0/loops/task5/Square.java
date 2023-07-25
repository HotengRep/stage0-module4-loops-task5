package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        char brick = '8';
        char empty = ' ';

        for( int y=0 ; y < sideLength; y++)
        {
            for (int x = 0; x <sideLength; x++)
            {

                if(y != 0 && y != sideLength-1 && x != 0 && x != sideLength-1)
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
