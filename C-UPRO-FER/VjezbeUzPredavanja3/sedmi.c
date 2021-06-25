#include <stdio.h>

int main(void) {
   float x, y;
   scanf("%f %f", &x, &y);
   if ((((x >= 5.f) && (x <= 20.f)) || ((y >= 5.f) && (y <= 20.f))) && x < y) {
      printf("Istina je");
   } else {
      printf("Nije istina");
   }
   return 0;
}