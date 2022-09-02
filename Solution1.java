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

class Solution1 {
    public static int getPopulationInYear(int year) {
        Scanner sc = new Scanner(System.in);
        int firstYear = 2002;
        int finalYear = year - firstYear;
        int totalPop = 1256;
        int[] born = {37, 89, 92, 34, 76, 44};
        int[] dead = {9, 81, 10, 12, 17, 56};
        for(int i = 0; i < finalYear; i++) {
            totalPop = (totalPop + born[i]) - dead[i];
            // System.out.println("Population in is: " + totalPop);
        }
        sc.close();
        return totalPop;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int res = getPopulationInYear(year);
        System.out.println("Final Population is: " + res);
        sc.close();
    }
}
