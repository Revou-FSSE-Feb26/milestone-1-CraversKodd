<nav>
  <ul>
    <li<a href="#/products">Our products</a></li>
    <li<a href="#/services">Our services</a></li>
  </ul>
</nav>

<h1>Welcome to Antapani</h1>
<div id="placeholder">
    <p>Learn more about <a href="#/products">our stuff</a> and <a href="#ervice"> our service</p>
</div>
<script>
    window.addEventListener('haschange' , function goToPage(){
    const pageToLoad = window.location.hash.slice(1);
    document.getElementById('placeholder').innerHTML = load(pageToLoad);
})
</script>