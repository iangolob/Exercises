#include <stdio.h>
int main(void) {
   printf("|%d|\n", 10);
   printf("|%5d|\n", 10);
   printf("|%1d|\n", 10);
   printf("|%s|\n", "Ana");
   printf("|%5s|\n", "Ana");
   printf("|%2s|\n", "Ana");
   printf("|%x|\n", 27);
   printf("|%6x|\n", 27);
   printf("|%o|\n", 9);
   printf("|%6o|\n", 9);
   printf("|%1o|\n", 9);
   printf("|%f|%7.4f|%7.2f|\n", 23.127, 23.127, 23.127);
   printf("|%e|%8.4e|%.2e|\n", 0.00021278, 0.00021278, 0.00021278);
   return 0;
}