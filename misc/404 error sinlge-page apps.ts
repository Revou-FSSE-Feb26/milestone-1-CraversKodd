fetch('/api/product/${productId}')
.then (response=>response.json())
.then (product => {
    if (product.exist) {
    showProdutDetails(product);
} else {
window.location.href = '/not-found';
}
})

function showProdutDetails(product: any) {
    throw new Error("Function not implemented.");
}
