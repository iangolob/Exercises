#include <stdio.h>

int main(void) {

   float x;
   while (scanf("%f", &x) == 1) {
      printf("%6.2f\n", x);
   }
   char c = getchar();

   if (c == EOF) {
      printf("Kraj datoteke");
   } else {
      fprintf(stderr, "Greska kod znaka %c", c);
   }
   return 0;
}