package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        char brick = '8';
        char empty = ' ';

        for( int y=0 ; y < cathetusLength; y++)
        {
            for (int x = 0; x <cathetusLength; x++)
            {
              if( x > y) {
                  System.out.print(empty);
                  continue;
              }
              System.out.print(brick);
            }
            System.out.print('\n');
        }

    }
    }
