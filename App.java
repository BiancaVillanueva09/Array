public class App {
    public static void main (String[] args) {
        char[] myName = {'B', 'I', 'A', 'N', 'C', 'A'};

        System.out.println(myName[5]);
        System.out.println(myName[4]);
        System.out.println(myName[3]);
        System.out.println(myName[2]);
        System.out.println(myName[1]);
        System.out.println(myName[0]);

        //forward loop
        for (int i = 0; i < myName.length; i++) {
            System.out.println(myName[i]);
        }

        //reverse loop
        for (int i = myName.length - 1; i >= 0; i--) {
            System.out.println(myName[i]);
        }

        //FILTERING
        //vowels
        for (int i = 0; i < myName.length; i++) {
            if (myName[i] == 'A' || myName[i] == 'E' || myName[i] == 'I' || myName[i] == 'O' || myName[i] == 'U' ) {
                System.out.println(myName[i]);
            }
        }

        //consonant
        for (int i = 0; i < myName.length; i++) {
            if (! (myName[i] == 'A' || myName[i] == 'E' || myName[i] == 'I' || myName[i] == 'O' || myName[i] == 'U' )) {
                System.out.println(myName[i]);
            }
        } 



    }
}