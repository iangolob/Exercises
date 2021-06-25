#include <stdio.h>

int main(void) {
   int s = 0, br = 0;
   do {
      s = s + br;
      scanf("%d", &br);
   } while (br % 3 == 0 || br % 7 == 0);
   printf("suma = %d", s);
   s = 0;
   br = 0;
   scanf("%d", &br);
   while (br % 3 == 0 || br % 7 == 0) {
      s = s + br;
      scanf("%d", &br);
   }
   printf("suma = %d", s);
   return 0;
}