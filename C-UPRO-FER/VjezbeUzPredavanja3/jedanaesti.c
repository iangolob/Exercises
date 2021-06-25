#include <stdio.h>

int main(void) {
   float napierConst = 2.71828f;
   float saturnSunDist = 1.43344e12f;
   float planckConst = 6.62607e-34f;
   printf("Napierova konstanta:\n%8.6f\n%6.2f\n%6.3f \n%14.10f \n \n"
          "Srednja udaljenost Saturna i Sunca:\n%20.6f \n%16.2f \n%7.4e \n"
          "\n%.6f \n%40.36f \n%.5e \n%19.10e",
          napierConst, napierConst, napierConst, napierConst, saturnSunDist,
          saturnSunDist, saturnSunDist, planckConst, planckConst, planckConst,
          planckConst);
}