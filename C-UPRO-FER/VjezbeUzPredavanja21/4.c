#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
   srand((unsigned)time(NULL));

   int new, slova = 0, znamenke = 0, ostali = 0;
   for (int i = 0; i < 1000; i++) {
      new = rand() % (126 - 32 + 1) + 32;
      if (isalpha(new) != 0)
         slova++;
      if (isdigit(new) != 0)
         znamenke++;
      if (isalnum(new) == 0)
         ostali++;
   }
   printf("Slova  :%d\nZnamenke: %d\nOstali  :%d", slova, znamenke, ostali);
   return 0;
}