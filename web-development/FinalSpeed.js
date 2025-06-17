function calculateFinalSpeed(initialSpeed, inclinations) {
    for (let i = 0; i < inclinations.length; i++) {
        initialSpeed -= inclinations[i];  // Add each inclination value to initial speed
    }
    return initialSpeed <= 0 ? 0 : initialSpeed ;
}

console.log(calculateFinalSpeed(60, [0, 30, 0, -45, 0]));