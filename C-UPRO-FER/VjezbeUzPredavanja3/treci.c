#include <stdio.h>

int main(void) {
   int n1, n2;
   scanf("%d %d", n1, n2);
   if (n1 > 100 && n2 < 100 || n1 < 100 && n2 > 100) {
      printf("Je.");
   }
   return 0;
}