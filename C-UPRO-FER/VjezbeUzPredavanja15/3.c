#include <stdio.h>

void poredaj(double *xp, double *yp, double *zp) {
   double pom;

   if (*xp > *yp) {
      pom = *xp;
      *xp = *yp;
      *yp = pom;
   }
   if (*xp > *zp) {
      pom = *xp;
      *xp = *zp;
      *zp = pom;
   }
   if (*yp > *zp) {
      pom = *yp;
      *yp = *zp;
      *zp = pom;
   }
   return;
}

int main(void) {
   double x, y, z;

   printf("Upisite tri realna broja > ");
   scanf("%lf %lf %lf", &x, &y, &z);

   poredaj(&x, &y, &z);

   printf("%lf %lf %lf", x, y, z);
   return 0;
}