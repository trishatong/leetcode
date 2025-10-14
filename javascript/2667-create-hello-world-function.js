// 2667. Create Hello World Function
// Write a function createHelloWorld. It should return a new function that always returns "Hello World".

/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    // ...args is a rest parameter; accepts a variable number of arguments and store them in an array
    return function(...args) { 
        return "Hello World";
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */