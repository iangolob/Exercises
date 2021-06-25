#include <stdio.h>

int main(void) {
   unsigned int n;
   char c[100] = {0}, h[100] = {0};

   printf("Upisite dekadski broj > ");
   scanf("%du", &n);

   int i = 0;
   while (n > 0) {
      c[i] = n % 16;
      n = n / 16;
      i++;
   }
   c[i] = '\0';
   i = 0;
   while (c[i] != '\0') {

      if (c[i] <= 9) {
         c[i] += '0';
      } else {
         c[i] += 'A' - 10;
      }

      i++;
   }

   printf("Heksadekadski: %s", c);
   return 0;
}