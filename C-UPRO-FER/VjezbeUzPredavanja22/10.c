#include <stdio.h>

int main(void) {
   char c;
   while (c = getchar(), c != EOF) {
      putchar(c);
   }

   return 0;
}