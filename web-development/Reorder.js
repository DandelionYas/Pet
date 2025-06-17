function initialize() {
const buttons = document.querySelectorAll('button');

buttons.forEach(button => {
button.addEventListener('click', event => {
        const div = button.parentElement; // Get the parent <div>
        if (button.classList.contains('downButton')) {
            const nextDiv = div.nextElementSibling;
            if (nextDiv) {
                div.parentNode.insertBefore(nextDiv, div); // Swap positions
            }
        } else if (button.classList.contains('upButton')) {
            const prevDiv = div.previousElementSibling;
            if (prevDiv) {
                div.parentNode.insertBefore(div, prevDiv); // Swap positions
            }
        }
    });
});
}
document.body.innerHTML = `
<div>
    <span>Prepare presentation</span>
    <button class="downButton" type="button">&darr;</button>
</div>
<div>
    <span>Read emails</span>
    <button class="downButton" type="button">&darr;</button>
    <button class="upButton" type="button">&uarr;</button></div>
<div>
    <span>Monthly report</span>
    <button class="upButton" type="button">&uarr;</button>
</div>`;

initialize();

document.querySelectorAll("button")[0].click();
document.querySelectorAll("button")[3].click();
document.querySelectorAll("button")[1].click();

console.log(document.body.innerHTML);