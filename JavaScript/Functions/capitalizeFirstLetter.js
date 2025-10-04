function capitalizeFirstLetter(str) {
    if (!str) return "";
    return str.charAt(0).toUpperCase() + str.slice(1);
}

// Example
console.log(capitalizeFirstLetter("hello")); // "Hello"
