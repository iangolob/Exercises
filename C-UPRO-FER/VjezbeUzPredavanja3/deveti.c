#include <stdio.h>

int main(void) {
   int x1, x2, x3, x4, x5;
   scanf("%d %d %d %d %d", &x1, &x2, &x3, &x4, &x5);
   int i = 0;
   if (x1 > 0)
      i++;
   if (x2 > 0)
      i++;
   if (x3 > 0)
      i++;
   if (x4 > 0)
      i++;
   if (x5 > 0)
      i++;
   if (i >= 3) {
      printf("Barem tri su veca od nule");
   } else {
      printf("Brojevi nisu poredani ili nisu razliciti");
   }
}