// Marvish Chandra

/* 
V = volume of the receiver tank
t = time for the receiver to go from upper to lower pressure limits
C = free air needed
pa = atmosphere pressure
p1 = maximum tank pressure
p2 = minimum tank pressure
*/ 

fun refuelingAir(V,p1,p2,C,pa):
    (V * (p1-p2)) / C * pa