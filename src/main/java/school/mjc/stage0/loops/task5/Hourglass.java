package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        char brick = '8';
        char empty = ' ';

        for( int y=0 ; y < height; y++)
        {
            for (int x = 0; x <height; x++)
            {
                if( y < height /2 )
                {
                    if(x < y || x > height-y-1) {
                        System.out.print(empty);
                        continue;
                    }
                }else {
                    if(x< height - y-1 || x > y){
                        System.out.print(empty);
                        continue;
                    }
                }

                System.out.print(brick);
            }
            System.out.print('\n');
        }
    }
}
