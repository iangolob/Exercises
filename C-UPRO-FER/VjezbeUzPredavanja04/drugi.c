#include <stdio.h>

int main(void) {
   int a, b;
   int pr;

   printf("Upisite dva cijela broja > ");
   scanf("%d %d", &a, &b);
   if (a == b) {
      printf("Brojevi su jednaki.\na = b = %d", a);
   } else if (a > b) {
      pr = a;
      a = b;
      b = pr;
      printf("Zamjena je obavljena.\na = %d, b = %d", a, b);
   } else {
      printf("Zamjena nije obavljena.\na = %d, b = %d", a, b);
   }
   return 0;
}