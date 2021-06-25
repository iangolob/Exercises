#include "loto.h"
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
   for (int i = 0; i < 10; i++) {
      printf("%2d. izvlacenje: ", i + 1);
      for (int j = 0; j < 7; j++) {
         printf("%3d", dajSljedecuKuglicu());
      }
      printf("\n");
      resetirajBubanj();
   }
   return 0;
}