public class MyInteger {
    private int value;

    public int getValue() {
        return value;
    }

    public MyInteger(int value) {
        MyInteger myInteger = new MyInteger(value);
        myInteger.value = value;
        myInteger.getValue();

    }

    public boolean isEven() {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd() {
        if (value % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime() {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int value) {
        if (value % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        if (myInteger.value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(MyInteger myInteger) {
        if (myInteger.value % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(MyInteger myInteger) {
        for (int i = 2; i < myInteger.value; i++) {
            if (myInteger.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int value) {
        if (this.value == value) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(MyInteger myInteger) {
        if (this.value == myInteger.value) {
            return true;
        } else {
            return false;
        }
    }

}
