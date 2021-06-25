#include <stdio.h>

int main(void) {
   int n, a, b;
   printf("1. a + b\n2. a - b\n3. a * b\n4. a / b\nUpisite redni broj "
          "operacije > ");
   scanf("%d", &n);

   if (n <= 4 && n >= 1) {
      printf("Upisite operande > ");
      scanf("%d %d", &a, &b);
      switch (n) {
      case 1:
         printf("%d + %d = %d", a, b, a + b);
         break;
      case 2:
         printf("%d - %d = %d", a, b, a - b);
         break;
      case 3:
         printf("%d * %d = %d", a, b, a * b);
         break;
      case 4:
         if (b != 0) {
            printf("%d / %d = %d", a, b, a / b);
         } else {
            printf("Neispravni operandi");
         }
         break;
      }
   }

   return 0;
}