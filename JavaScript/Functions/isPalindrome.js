function isPalindrome(str) {
    let clean = str.toLowerCase().replace(/[^a-z0-9]/g, "");
    return clean === clean.split("").reverse().join("");
}

// Example
console.log(isPalindrome("madam")); // true
console.log(isPalindrome("hello")); // false
