package StaticAndInstanceBlock.Practice;

class Counter {
    static int count;

    static {
        count = 10;
        System.out.println(count); // 10
    }

    {
        count++;
        System.out.println(count); // 1st Counter() --> 11, // 2nd Counter() --> 13
    }

    Counter() {
        count++; // 1st Counter() --> 12, // 2nd Counter() --> 14
        System.out.println(count);
    }

    public static void main(String[] args) {
        new Counter(); // 12
        new Counter(); // 14
    }
}
