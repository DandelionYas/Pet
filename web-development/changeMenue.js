function initialize() {
    const buttons = document.querySelectorAll("button");
    buttons.forEach((button) => {
        button.addEventListener('click', event => {
            const div = button.parentElement; // Get the parent <div>
            const prevDiv = div.previousElementSibling;
            if (prevDiv) {
                div.parentNode.insertBefore(div, prevDiv); // Swap positions
            }
        });
    });
}

document.body.innerHTML = `
<div id="list">
  <div>
    <span>Read emails</span>
  </div>
  <div>
    <span>Prepare presentation</span><button type="button">&uarr;</button>
  </div>
  <div>
    <span>Monthly report</span><button type="button">&uarr;</button>
  </div>
</div>`;

initialize();
document.getElementsByTagName("button")[1].click();
document.getElementsByTagName("button")[0].click();

// Monthly report should become the first task, followed by Read emails and Prepare presentation.
console.log(document.getElementById('list').children);