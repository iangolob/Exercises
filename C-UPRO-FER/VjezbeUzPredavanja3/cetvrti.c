#include <stdio.h>
#define FTOC 3.1f
int main(void) {
   float n;
   printf("Program za konverziju Fahrenheit - Celsius ili obrnuto. Za F u C "
          "upisite 1, a za C u F bilo koji drugi cijeli broj > ");
   int i;
   scanf("%d", &i);
   if (i == 1) {
      printf("Upisite temperaturu izrazenu u stupnjevima Fahrenheit >");
      scanf("%f", &n);
      printf("%.3f st. F = %.3f st. C", n, n * FTOC);
   } else {
      printf("Upisite temperaturu izrazenu u stupnjevima Celsius >");
      scanf("%f", &n);
      printf("%.3f st. C = %.3f st. F", n, n / FTOC);
   }
   return 0;
}