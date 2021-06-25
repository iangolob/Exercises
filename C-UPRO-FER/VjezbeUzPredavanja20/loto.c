#include "loto.h"
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

static _Bool izvucena[39] = {0};
static int izvucenih = 0;

int dajSljedecuKuglicu(void) {
   static int first = 1;
   if (first) {
      srand((unsigned int)time(NULL));
      first = 0;
   }
   //  printf("oo\n");
   int next;
   if (izvucenih < 7) {
      izvucenih++;
      while (next = rand() % 39 + 1, izvucena[next] == 1)
         ;
      izvucena[next] = 1;
   } else {
      next = -1;
   }
   return next;
}

void resetirajBubanj(void) {
   izvucenih = 0;
   for (int i = 1; i <= 39; i++) {
      izvucena[i] = 0;
   }
   return;
}