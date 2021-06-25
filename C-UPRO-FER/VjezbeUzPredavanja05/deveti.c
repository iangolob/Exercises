#include <stdio.h>

int main(void) {
   int s = 0, br = 0;
   do {
      scanf("%d", &br);
      s = s + br;
   } while (br % 3 == 0 || br % 7 == 0);
   printf("suma = %d", s);
   s = 0;
   br = 0;
   while (br % 3 == 0 || br % 7 == 0) {
      scanf("%d", &br);
      s = s + br;
      }
   printf("suma = %d", s);
   return 0;
}