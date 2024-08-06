package Day_4;


public class Count {

        public static void main(String[] args) {
            String str = "I am Ashutosh kumar . 7763913208 ashutosh@gmail.com";
            count(str);
        }

        public static void count(String x) {
            //Convert string to char array.......
            char[] ch = x.toCharArray();

            int letter = 0;
            int space = 0;
            int num = 0;
            int other = 0;

            for (int i = 0; i < x.length(); i++) {
                if (Character.isLetter(ch[i])) {
                    letter++;
                }

                else if (Character.isDigit(ch[i])) {
                    num++;
                }

                else if (Character.isSpaceChar(ch[i])) {
                    space++;
                }

                else {
                    other++;
                }
            }
            System.out.println("String is:"+"I am Ashutosh kumar . 7763913208 ashutosh@gmail.com");
            System.out.println("letter: " + letter);
            System.out.println("space: " + space);
            System.out.println("number: " + num);
            System.out.println("other: " + other);
        }
    }

