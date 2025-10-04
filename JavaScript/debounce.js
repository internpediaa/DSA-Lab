function debounce(func, delay) {
    let timer;
    return function(...args) {
        clearTimeout(timer);
        timer = setTimeout(() => {
            func.apply(this, args);
        }, delay);
    };
}

// Example: Search box typing
function searchQuery(q) {
    console.log("Searching for:", q);
}

const debouncedSearch = debounce(searchQuery, 1000);

// Simulating user typing
debouncedSearch("J");
debouncedSearch("Ja");
debouncedSearch("Jav");
debouncedSearch("Java"); 
// ✅ Only "Searching for: Java" will run after 1 sec
