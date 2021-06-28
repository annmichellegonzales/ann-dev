"use strict"


function renderShop(shop) {
    // keeps h1 and p together
    let html = '<div class="coffee w-50 d-inline-flex align-items-baseline mb-4">';
    html += '<h2>' + shop.name + '</h2>';
    html += '<p class="ml-2">' + shop.roast + '</p>';
    html += '</div>';

    return html;
}


function renderShops(shops) {
    let html = '';
    for (let i = 0; i < shops.length; i++) {
        html += renderShop(shops[i]);
    }

    return html;
}


function updateShops(e) {
    e.preventDefault(); // don't submit the form, we just want to update the data
    let selectedRoast = roastSelection.value.toLowerCase();
    let selectedShop = shopSelection.value.toLowerCase();
    let filteredShops = [];
    let newShopListing = [];

    for (let i = 0; i < shops.length; i++) {
        let roast = shops[i].roast;
        if (roast === selectedRoast || selectedRoast === "all") {
            filteredShops.push(shops[i]);
        }
    }

    for (let i = 0; i < filteredShops.length; i++) {
        let name = (filteredShops[i].name).toLowerCase();
        if (name === selectedShop || name.includes(selectedShop)) {
            newShopListing.push(filteredShops[i])
        }
    }

    shopList.innerHTML = renderShops(newShopListing);
}



function newBrew(e) {
    e.preventDefault(); // don't submit the form, we just want to update the data
    let addedBrew = {
        id: shops.length + 1,
        name: newShop.value.toLowerCase(),
        roast: newRoastSelection.value.toLowerCase(),
    }
    shops.push(addedBrew);
    shopList.innerHTML = renderShops(shops);
}




// from http://www.ncausa.org/About-Coffee/Coffee-Roasts-Guide
let shops = [
    {id: 1, name: 'KillStar', roast: '<a href="https://us.killstar.com/?utm_source=KILLSTAR%20UK%20Store&utm_medium=redirect&utm_campaign=GeoIP_Country_Redirect">Killstar.com</a>'},
    {id: 2, name: 'Half City', roast: 'light'},
    {id: 3, name: 'Cinnamon', roast: 'light'},
    {id: 4, name: 'City', roast: 'medium'},
    {id: 5, name: 'American', roast: 'medium'},
    {id: 6, name: 'Breakfast', roast: 'medium'},
    {id: 7, name: 'High', roast: 'dark'},
    {id: 8, name: 'Continental', roast: 'dark'},
    {id: 9, name: 'New Orleans', roast: 'dark'},
    {id: 10, name: 'European', roast: 'dark'},
    {id: 11, name: 'Espresso', roast: 'dark'},
    {id: 12, name: 'Viennese', roast: 'dark'},
    {id: 13, name: 'Italian', roast: 'dark'},
    {id: 14, name: 'French', roast: 'dark'},
];

let shopList = document.querySelector('#shops');
let submitButton = document.querySelector('#submit');
let roastSelection = document.querySelector('#roast-selection');
let shopSelection = document.querySelector('#shop-selection');
let newRoastSelection = document.querySelector('#roast-selection-new');
let newShop = document.querySelector('#shop-new');
let newSubmitButton = document.querySelector('#submit-new');

shopList.innerHTML = renderShops(shops);

submitButton.addEventListener('click', updateShops);
roastSelection.addEventListener('change', updateShops);
shopSelection.addEventListener('input', updateShops);
newSubmitButton.addEventListener('click', newBrew);