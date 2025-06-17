function createCheckDigit(membershipId) {
    // Write the code that goes here.
    let sum = 0;
    for (let i = 0; i < membershipId.length; i++) {
        const digit = parseInt(membershipId.charAt(i));
        sum += digit;
    }
    if (sum < 10) {
        return sum;
    } else {
        return createCheckDigit(sum.toString());
    }
}

console.log(createCheckDigit("55555"));