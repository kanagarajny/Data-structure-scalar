public boolean IsPrime(N)
{
	//factors will always occurs in pairs
	//18, 1*18, 2*9, 3*6 ,
	//if one factor is I then the pair of i will n/i, so we can check till sqrt(n);
	
	for (int i=2;i*i<N;i++)
	{
		
	
	// prime wont have have any factors from 2 to n.
	//prime will always have 1 and n-1 as factor 
	
		if (N%i==0)
		{
			return false;
			
		}
	}
	 return true ;
}

//TC:o(sqrt(n);

// given a number want to find all prime numbers from range from 1-N
public void printprimes(int num)
{
	for(int i=2;i*i<num;i++)
	{
		if(Isprime(i))
		{
			print (i);
		}
		
	}
}
//TC:o(num*sqrt(n));

//seives algo

public ArrayList<Integer> seives(int num)
{
	boolean [] prime=new boolean[num+1]; //because i want the index to be straightforward values as I.
	  Arrays.fill(prime, true );// intialize all value as true 
	  prime[0],prime[1]=false;
	ArrayList<Integer> ans= new ArrayList <Integer>();
	for(int i=2;i*i<prime.length;i++)
	{
		if(prime[i])
		{
			//going to get the multiples of prime and mark it as false.
			//want to start from i*i because for example 5. 5*2 is already false by 2  5*3 is already false by 3  5*4 is already false by 2 
			//lets say if we are starting 5*5 we need to increment with multiple of that value (5) 25,30,35
			for(int j=i*i;j<n;j+i)
			{
				prime[j]=false;
				
			}
		}
		
	}
		for(int i=2;i*i<prime.length;i++)
		{
			if(prime[i]==true)
			{
				ans.add(prime[i]);
			}
		}
		return ans;
		
		

}

//for 2 loop will run for n/2 , for 3 n/3 , for 4 n/4 so on

//n/2+n/3+n/5+n/7....n/n  
//n(1/2+1/3+1/5+1/7+1/11+....1/n) sum of all reciprocals will (log(log)(n)) if n=32  logn=2^5  n=log(5) which is less than n.

