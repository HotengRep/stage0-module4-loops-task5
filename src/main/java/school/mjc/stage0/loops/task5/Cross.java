package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {

        char brick = '8';
        char empty = ' ';

        for( int y=0 ; y < sideLength; y++)
        {
            for (int x = 0; x <sideLength; x++)
            {

                if(y != sideLength/2 && x != sideLength/2 )
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
