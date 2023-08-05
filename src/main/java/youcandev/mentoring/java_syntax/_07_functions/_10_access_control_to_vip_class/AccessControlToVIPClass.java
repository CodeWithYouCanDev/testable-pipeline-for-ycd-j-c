package youcandev.mentoring.java_syntax._07_functions._10_access_control_to_vip_class;

/*
Kontrola dostępu do klasy VIP
 */
public class AccessControlToVIPClass {

    public static void main(String[] args) {
        accessToClass("noInvite");
    }

    public static void accessToClass(String invitation) {
        //wpisz swój kod tutaj
        if (invitation.equals("noInvite")) {
            return;
        }
        System.out.println("Witamy w klasie VIP, " + invitation);
        System.out.println("Ciesz się specjalnymi przywilejami, " + invitation);
    }
}
