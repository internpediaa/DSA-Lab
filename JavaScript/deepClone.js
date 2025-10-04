function deepClone(obj) {
    if (obj === null || typeof obj !== "object") {
        return obj; // return primitive values as is
    }

    if (Array.isArray(obj)) {
        return obj.map(item => deepClone(item));
    }

    const cloned = {};
    for (let key in obj) {
        if (obj.hasOwnProperty(key)) {
            cloned[key] = deepClone(obj[key]);
        }
    }
    return cloned;
}

// Example
const original = { name: "Ali", skills: ["JS", "Node"], address: { city: "Delhi" } };
const copy = deepClone(original);

copy.address.city = "Mumbai";
console.log(original.address.city); // "Delhi" ✅ original is untouched
