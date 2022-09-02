// Calculate population 
// The population of a town in the year 2002 was 1256. Given the follwing statistics
// on birth and death, write a program to calculate the total population in a given year(2003-2008).
// Year | People Born | People Died
// 2003 | 37          | 09
// 2004 | 37          | 81
// 2005 | 37          | 10
// 2006 | 37          | 12
// 2007 | 37          | 17
// 2008 | 37          | 56

import java.util.*;

class Solution {
    public static int getPopulationInYear(int end) {
        Scanner sc = new Scanner(System.in);
        int totalPop = 1256;
        int start = 0;
        for(int i = start; i < end; i++) {
            System.out.print("enter no of born: ");
            int born = sc.nextInt();
            System.out.print("enter no of dead: ");
            int dead = sc.nextInt();
            totalPop = (totalPop + born) - dead;
            System.out.println("Population in is: " + totalPop);
        }
        sc.close();
        return totalPop;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter firstYear: ");
        int firstYear = sc.nextInt();
        System.out.print("enter secondYear: ");
        int secondYear = sc.nextInt();
        int end = secondYear- firstYear + 1;
        int res = getPopulationInYear(end);
        System.out.println("Final Population is: " + res);
        sc.close();
    }
    public void run() {
    }
}