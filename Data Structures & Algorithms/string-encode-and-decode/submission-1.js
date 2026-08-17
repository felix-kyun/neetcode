class Solution {
    
    encode(input) {
        let count = "";
        let encodedString = "";
        if (input.length === 0) return "";
        else if (input.length > 0) {
            count = `${input[0].length}`;
            encodedString = `${input[0]}`;
        }
        for (let i = 1; i < input.length; i++) {
            count = `${count},${input[i].length}`;
            encodedString = `${encodedString}${input[i]}`;
        }
        return `${count}#${encodedString}`;
    }

    decode(input) {
        if (input.length === 0) return []; 
        const output = [];
        const outputLengthMap = getLengths(input);
        let cursor = input.indexOf("#") + 1;
        for (const length of outputLengthMap) {
            output.push(input.slice(cursor, cursor + length));
            cursor += length;
        }
        return output;
    }
}

function getLengths(input) {
    const length = input.indexOf("#");
    const lengthString = input.slice(0, length);
    return lengthString.split(",").map(Number);
}