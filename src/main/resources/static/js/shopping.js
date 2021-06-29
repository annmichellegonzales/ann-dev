"use strict"

function renderShop(shop) {
    // keeps h1 and p together
    let html = '<div class="shop w-50 d-inline-flex align-items-baseline mb-4">';
    html += '<h2>' + shop.name + '</h2>';
    html += '<p class="ml-2">' + shop.type + '</p>';
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
    let selectedType = typeSelection.value.toLowerCase();
    let selectedShop = shopSelection.value.toLowerCase();
    let filteredShops = [];
    let newShopListing = [];

    for (let i = 0; i < shops.length; i++) {
        let type = shops[i].roast;
        if (type === selectedType || selectedType === "all") {
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



function newShopping(e) {
    e.preventDefault(); // don't submit the form, we just want to update the data
    let addedShopping = {
        id: shops.length + 1,
        name: newShop.value.toLowerCase(),
        type: newTypeSelection.value.toLowerCase(),
    }
    shops.push(addedShopping);
    shopList.innerHTML = renderShops(shops);
}


let shops = [
    {id: 1, name: 'KillStar', type: 'witchy fashion'},
    {id: 2, name: 'Foxblood', type: 'witchy fashion'},
    {id: 3, name: 'BlackCraft', type: 'witchy fashion'},
    {id: 4, name: '13 Moons', type: 'tools'},
    {id: 5, name: 'Tragic Beautiful', type: 'witchy fashion'},
    {id: 6, name: 'Demonia', type: 'witchy fashion'},
    {id: 7, name: 'Magickal Winds', type: 'tools'},
    {id: 8, name: 'Darkothica', type: 'home decor'},
    {id: 9, name: 'Cursed by Design', type: 'home decor'},
    {id: 10, name: 'Sin in Linen', type: 'home decor'},
];

let shopList = document.querySelector('#shops');
let submitButton = document.querySelector('#submit');
let typeSelection = document.querySelector('#type-selection');
let shopSelection = document.querySelector('#shop-selection');
let newTypeSelection = document.querySelector('#type-selection-new');
let newShop = document.querySelector('#shop-new');
let newSubmitButton = document.querySelector('#submit-new');

shopList.innerHTML = renderShops(shops);

submitButton.addEventListener('click', updateShops);
typeSelection.addEventListener('change', updateShops);
shopSelection.addEventListener('input', updateShops);
newSubmitButton.addEventListener('click', newShopping);