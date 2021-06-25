#include <stdio.h>

int main(void) {
   int x, y, z;
   scanf("%d %d %d", &x, &y, &z);
   if ((x < y && y < z) || (x > y && y > z)) {
      printf("Brojevi su poredani i razliciti");
   } else {
      printf("Brojevi nisu poredani ili nisu razliciti");
   }
   return 0;
}