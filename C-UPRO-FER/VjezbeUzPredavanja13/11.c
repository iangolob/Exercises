#include <math.h>
#include <stdio.h>

double fakt(int x) {
   double rez = 1;
   for (int i = 2; i <= x; i++) {
      rez *= x;
   }
   return rez;
}

double sinus(double x, int y) {
   if (y > 1) {
      return pow(-1, y + 1) * pow(x, 2 * y - 1) / fakt(2 * y - 1) +
             sinus(x, y - 1);
   } else {
      return x;
   }
}

int main(void) {
   double t;
   int n;
   scanf("%lf %d", &t, &n);
   printf("%.20lf \n%.20lf \n%.20lf", sinus(t, n), sin(t),
          sinus(t, n) - sin(t));
   return 0;
}