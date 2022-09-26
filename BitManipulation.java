//BIT MANIPULATION 
//MSB -is always used to store the -ve numbers
//how to store neagtive numbers take two's complementAND 1 -->how to take twos complement -->TAKE not of that number-->
//properties of the operator 
//A&1==1 will denote that number(A) is odd number else A&1==0 denotes that number (A)is even number.
//left shift n<<1=n*2^1  n<<2=n^2^2  1<<n=1*2^n
//right shift n>>1=n/2^1
//if n=n>>1 means we are moving one bit outside
//if n=n<<1 means moving one bit inside.

//for a given bit and i th position tell whether the bit is set or unset 

public boolean checkbit (int n , int i)
{
	if(((n>>i)&1)==1)
	{
		return true ;
		
	}return false;

}

//tc =sc=o(1)
//given the number return the count of set bits. 
public int countsetbits(int n)
{
	int count=0;
	while(n>0)
	{
		if (n&1==1)
		{
			count++;
			
		}
		n=n>>1;
	}
	return count;
}
//tc =log(n) because in every step we are dividing n by 2.


//given an array of elements every elements appear twice expect one element 
public int FindUnique(int A[])
{
	int xor=0;
	for(int i=0;i<A.length;A++)
	{
		xor^=A[i];
		
	}return xor;
}
//tc=o(n)

//given a number and ith bit clear the bit at that position i.e:unset that bit to zero.

public int UnsetBit(int N, int i){
	int mask = ~( 1 << i );
	int ans = (mask & N);
	return ans;
	
}

//given a number and ith bit, clear the bit from i to 0 position .
public int UnsetfromO(int N, int i){
	int mask = ( -1 << i );
	int ans =N & mask;
	return ans;
	
}



//given the number and the ith  bit we need mark all bits as zero from msb to that bit;
public int UnsetfromMsb(int N, int ){
	int mask=(1<<i)-1;
	int ans= mask & N;
	return ans;
}

//given array of elements every elements appear thrice  expect one element find that unique element 
public int Uniquethrice(int []A)
{
	for (int i=0; i<32;i++)//to check bit postion of all the elements in the array 
	{
		int sum=0
		int count=0;
		for(int j=0;j<A.length;j++)
		{
			if(checkbit(A[j],i))
			{
				count++;
			}
		}
		
		if(count%3==1)
		{
			sum=(1<<i) + sum;
		}
		
		
	}return sum ;
}

//tc=o(n)


//given a array of elements all the elements appear twice expect two numbers return those two numbers
public int[] FindtwoUniqueNumbers(int A[]){
	//find xor of that two numbers 
	int xor = 0;
	int ans1 = 0;
	int ans2 = 0;
	for (int i =  0; i < A.length; i++){
		xor ^= A[i];
	}
	//find the set bit of xor value
	for (int i = 0; i < 32; i++){
		if (checkbit(xor,i)){
			pos=i;
			break;
		}
	}
	for (int i = 0; i < A.length; i++){
		if (((1<<pos) & A[i])==1){
			ans2 ^= A[i];	
		}
		else{
			ans1 ^= A[i];

		}
	}
	int min = Math.min(ans1, ans2); 
	int max = Math.max(ans1, ans2); 
	return (int new []{min, max})

	
	
}
//tc :o(n)

//given an array of length n  contains 1 to n+2 elements find those two missing elements.
public int[] FindtwoMissing(int [] A){
	
}  
