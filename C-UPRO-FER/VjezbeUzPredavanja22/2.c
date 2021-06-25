#include <stdio.h>
int main(void) {
   char niz1[20], niz2[20];
   float x;
   double y;
   int m = -1, n = -1, r1, r2;
   r1 = scanf("%f %d %lf", &x, &m, &y);
   r2 = scanf("%s %*c %s %d", niz1, niz2, &n);
   printf("|%d|%d|\n", m, r1);
   printf("|%f|%lf|\n", x, y);
   printf("|%s|\n", niz1);
   printf("|%s|\n", niz2);
   printf("|%d|%d|\n", n, r2);
   printf("|%c|", getchar());
   return 0;
}