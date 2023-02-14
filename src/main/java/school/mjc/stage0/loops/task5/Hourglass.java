package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int halfLength;
        if(height%2 == 0){
            halfLength = (height+1)/2;
        }else{
            halfLength = height/ 2 + height % 2;
        }


        // Top half of hourglass
        for (int i = 0; i < halfLength; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < height - 2 * i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        // Bottom half of hourglass
        for (int i = halfLength - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < height - 2 * i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}