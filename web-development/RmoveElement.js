function setup() {
    const removeButtons = document.querySelectorAll('.remove'); // Select all remove buttons
    // const removeButtons = document.getElementsByClassName('remove');

    removeButtons.forEach(button => {
        button.addEventListener('click', (event) => {
            const parentDiv = button.parentElement;  // Get the parent <div>
            parentDiv.remove();  // Remove the parent <div> from the DOM
        });
    });
}

// Example case.
document.body.innerHTML = `
<div class="image">
    <img src="https://bit.ly/3xXPxPR" alt="First">
    <button class="remove">X</button>
</div>
<div class="image">
    <img src="https://bit.ly/4de3sQr" alt="Second">
    <button class="remove">X</button>
</div>`;

setup();

document.getElementsByClassName("remove")[0].click();
console.log(document.body.innerHTML);