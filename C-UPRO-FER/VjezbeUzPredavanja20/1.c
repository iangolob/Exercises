#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
   int n;
   while (printf("Upisite n > "), scanf("%d", &n), !(n >= 3 && n <= 60)) {
      printf("Neispravan unos!\n");
   }

   srand((unsigned int)time(NULL));
   for (int i = 0; i < n; i++) {
      printf("%c", 'A' + rand() % ('Z' - 'A' + 1));
   }
   return 0;
}