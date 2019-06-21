#include<stdio.h>
int main()
{
  int num,second;
  scanf("%d",&num);
  second=(num/10)%10;
  printf("%d",second);
  return 0;
}