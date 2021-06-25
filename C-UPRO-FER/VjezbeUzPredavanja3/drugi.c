#include <math.h>
#include <stdio.h>

int main(void) {
   float r;
   printf("Unesi radijus:");
   scanf("%f", &r);
   if (r > 0) {
      printf("Volumen kugle radijusa %f je %f", r, pow(r, 3) * 4 / 3 * 3.14f);
   } else {
      printf("Neispravan radijus kugle");
   }
   return 0;
}