#include <stdio.h>

int main(void) {
   char c[9] = {0};

   int i = 0;
   printf("Upisite brojeve > ");

   scanf("%d", &c[i]);
   while (c[i] >= 'A' && c[i] <= 'Z' && i < 7) {
      i++;
      scanf("%d", &c[i]);
   }
   c[i] = '\0';

   for (int j = 0; j < 9; j++) {
      printf("%c", c[j]);
   }
   printf("%s\n", c);

   return 0;
}