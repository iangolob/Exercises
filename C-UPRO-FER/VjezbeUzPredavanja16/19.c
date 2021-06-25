#include <math.h>
#include <stdio.h>
typedef struct {
   double x;
   double y;
} tTocka;

double udaljToc(tTocka *pt1, tTocka *pt2) {
   return sqrt(pow(pt1->x - pt2->x, 2) + pow(pt1->y - pt2->y, 2));
}

int main(void) {
   tTocka t1, t2;

   printf("Upisite koordinate 1. tocke > ");
   scanf("%lf %lf", &t1.x, &t1.y);
   printf("Upisite koordinate 2. tocke > ");
   scanf("%lf %lf", &t2.x, &t2.y);

   printf("%lf", udaljToc(&t1, &t2));
}