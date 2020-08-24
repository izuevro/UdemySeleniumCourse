package constants;

public class Constant {

    public static class TimeoutVariables {
        private static final int IMPLICIT_WAIT = 5;
        private static final int EXPLICIT_WAIT = 10;

        public static int getImplicitWait() {
            return IMPLICIT_WAIT;
        }

        public static int getExplicitWait() {
            return EXPLICIT_WAIT;
        }
    }

    public static class Urls {
        private static final String MOBILE_PAYMENT_URL = "https://next.privat24.ua/mobile?lang=en";
        private static final String CAR_LOANS_URL = "https://next.privat24.ua/auto-credit/order?lang=en";

        public static String getMobilePaymentUrl() {
            return MOBILE_PAYMENT_URL;
        }

        public static String getCarLoansUrl() {
            return CAR_LOANS_URL;
        }
    }

    public static class MobileReplenishmentTestData {
        private static final String MOBILE_PAYMENT_PHONE_NUMBER = "987654321";
        private static final String MOBILE_PAYMENT_CARD = "4506909324274797";
        private static final String MOBILE_PAYMENT_CARD_EXP_DATE = "0622";
        private static final String MOBILE_PAYMENT_CARD_SVV = "327";

        public static String getMobilePaymentPhoneNumber() {
            return MOBILE_PAYMENT_PHONE_NUMBER;
        }

        public static String getMobilePaymentCard() {
            return MOBILE_PAYMENT_CARD;
        }

        public static String getMobilePaymentCardExpDate() {
            return MOBILE_PAYMENT_CARD_EXP_DATE;
        }

        public static String getMobilePaymentCardSvv() {
            return MOBILE_PAYMENT_CARD_SVV;
        }
    }
}
