let products = [];


// 76. Product Listing
fetch("products.json")
    .then(response => response.json())
    .then(data => {

        products = data;

        displayProducts(products);
        addCategories();

    })
    .catch(error => {
        console.log("Error:", error);
    });


function displayProducts(products) {

    let productContainer = document.getElementById("products");

    productContainer.innerHTML = "";

    products.forEach(function(product) {

        let div = document.createElement("div");

        div.className = "product";

        div.innerHTML = `
            <h3>${product.name}</h3>
            <p>Category: ${product.category}</p>
            <p>Price: ₹${product.price}</p>
            <button class="view-btn">View Details</button>
        `;

        productContainer.appendChild(div);


        // 79. Open Modal
        let button = div.querySelector(".view-btn");

        button.addEventListener("click", function() {
            showProductDetails(product);
        });

    });
}



// 77. Category Filtering

let categoryFilter = document.getElementById("categoryFilter");

categoryFilter.addEventListener("change", function() {

    let category = categoryFilter.value;

    if (category === "all") {

        displayProducts(products);

    } else {

        let filteredProducts = products.filter(function(product) {
            return product.category === category;
        });

        displayProducts(filteredProducts);
    }

});



function addCategories() {

    let categories = [];

    products.forEach(function(product) {

        if (!categories.includes(product.category)) {
            categories.push(product.category);
        }

    });


    categories.forEach(function(category) {

        let option = document.createElement("option");

        option.value = category;
        option.innerText = category;

        categoryFilter.appendChild(option);

    });

}



// 78. Sorting

let sortPrice = document.getElementById("sortPrice");

sortPrice.addEventListener("change", function() {

    let sortedProducts = [...products];

    if (sortPrice.value === "low") {

        sortedProducts.sort(function(a, b) {
            return a.price - b.price;
        });

    }

    else if (sortPrice.value === "high") {

        sortedProducts.sort(function(a, b) {
            return b.price - a.price;
        });

    }

    displayProducts(sortedProducts);

});



// 79. Product Details Modal

function showProductDetails(product) {

    document.getElementById("modalName").innerText = product.name;

    document.getElementById("modalCategory").innerText =
        "Category: " + product.category;

    document.getElementById("modalPrice").innerText =
        "Price: ₹" + product.price;

    document.getElementById("modalDescription").innerText =
        product.description;

    document.getElementById("modal").style.display = "block";
}



// Close Modal

document.getElementById("closeModal").addEventListener("click", function() {

    document.getElementById("modal").style.display = "none";

});