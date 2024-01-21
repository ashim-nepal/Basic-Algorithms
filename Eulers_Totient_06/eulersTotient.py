# A simple Python code to calculate
# Euler's Totient Function
#
'''
- Euler's Totient Function
- Ashim Nepal
'''
# We will be using Euclidean GCD algorithm too
# I had done it Euclidean GCD previously in java and it is what it looks in python
def gcd(a,b):
    if (a==0):
        return b
    # Implementing recursive Function for GCD
    return gcd(b % a, a)

# Now the main Totient Function
def phi(x):
    result=1
    for i in range(2,x):
        if(gcd(i,x)==1):
            result+=1
    return result

# Main code begins
# Using a loop to find Totient values up to 15
for j in range(1,16):
    print()
    print(f"Euler's Totient PHI({j})= {phi(j)}\n")



