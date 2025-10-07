let operation = '';
let log;
function addToOperation(value) {
    operation += value;
    document.getElementById('operation').value = operation;
}

function clearOperation() {
    operation = '';
    document.getElementById('operation').value = operation;
}

function calculate() {
    try {
        log = operation;
        operation = eval(operation).toString();
        document.getElementById('operation').value = log + " = " + operation;
    } catch (error) {
        document.getElementById('operation').value = 'Error';
        operation = '';
    }
}
