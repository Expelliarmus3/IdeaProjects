public class Data {
    public static void main(String[] args) {
        String s1= "This is a text";
        //toUppercase(), toLowercase()
        String s2= s1.toLowerCase();
        System.out.println(s2);
        System.out.println(s1.toUpperCase());
        //length
        System.out.println(s1.length());
        //isEmpty()
        System.out.println(s1.isEmpty());
        //isBlank()
        System.out.println(s1.isBlank());
        //charAt()
        System.out.println(s1.charAt(0));
        //indexOf(), lastIndexOf()
        System.out.println(s1.indexOf('t'));
        System.out.println(s1.lastIndexOf('t'));
        //concat()
        String s3= "Yea";
        System.out.println(s3.concat(s1));

        System.out.println("I am "+1+8+" years old.");
        System.out.println("I am "+(1+8)+" years old.");//here arithmetic operations occurs

    }
}
