function appendChildren(decorateDiv) {
    // var allDivs = document.getElementsByTagName("div");
    var allDivs = Array.from(document.getElementsByTagName("div")); // Convert live HTMLCollection to static array

    for (var i = 0; i < allDivs.length; i++) {
        var newDiv = document.createElement("div");
        decorateDiv(newDiv);
        allDivs[i].appendChild(newDiv);
    }
}

// Example case
document.body.innerHTML = `
<div id="a">
  <div id="b">
  </div>
</div>`;

appendChildren(function(div) {}); // DecorateDiv does nothing

console.log(document.body.innerHTML);
