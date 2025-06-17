function ensure(value) {
    if (arguments.length === 0) {
        console.log('No arguments!');
        throw new Error('No arguments!')
    } else if (value === undefined) {
        console.log('undefined!');
        throw new Error('undefined!');
    }  else {
        return value;
    }
}

try {
    console.log(ensure(null));
} catch(err) {
    console.log(err);
}