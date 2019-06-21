#include <stdio.h>
int main()
{
	int n,number;
	number=1;
	scanf("%d",&n);
	while(number<=n)
	{
		if(number%2 != 0)
			printf("%d\n",number);	
		number++;
	}
	return 0;
}