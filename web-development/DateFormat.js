function formatDate(userDate) {
    // format from M/D/YYYY to YYYYMMDD
    let month = userDate.substring(0, userDate.indexOf('/'));
    let day = userDate.substring(userDate.indexOf('/') + 1, userDate.lastIndexOf('/'));
    let year = userDate.substring(userDate.lastIndexOf('/') + 1, userDate.length);
    month = month.length === 1 ? "0" + month : month;
    day = day.length === 1 ? "0" + day : day;
    return year + month + day;
}

function formatDate2(inputDate) {
    // Parse the input date string (M/D/YYYY)
    const dateParts = inputDate.split('/'); // Split the input by '/'
    const month = dateParts[0].padStart(2, '0'); // Ensure month is 2 digits
    const day = dateParts[1].padStart(2, '0');   // Ensure day is 2 digits
    const year = dateParts[2];                  // Year is already 4 digits

    return `${year}${month}${day}`;
}

console.log(formatDate("12/31/2014"));