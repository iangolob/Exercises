#include <math.h>
#include <stdio.h>
typedef struct {
   double x;
   double y;
} tTocka;

double udaljToc(double x1, double y1, double x2, double y2) {
   return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
}

int main(void) {
   tTocka t1, t2;

   printf("Upisite koordinate 1. tocke > ");
   scanf("%lf %lf", &t1.x, &t1.y);
   printf("Upisite koordinate 2. tocke > ");
   scanf("%lf %lf", &t2.x, &t2.y);

   printf("%lf", udaljToc(t1.x, t1.y, t2.x, t2.y));
}