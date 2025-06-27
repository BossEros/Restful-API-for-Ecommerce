<h1 align="center">🛒 Store Application</h1>
<h3 align="center"><em>A full-featured Spring Boot e-commerce backend</em></h3>

<p align="center">
  <strong>Authentication • Product Management • Cart • Checkout</strong><br>
  Secure, extensible, and built with modern Java technologies.
</p>

<hr>

<h2>✨ Features</h2>

<ul>
  <li><strong>🔐 Authentication</strong> – Login/logout, JWT tokens, user sessions</li>
  <li><strong>📦 Product Management</strong> – Full CRUD with category organization</li>
  <li><strong>🛒 Shopping Cart</strong> – Add/update/delete/clear items per user</li>
  <li><strong>💳 Checkout</strong> – Seamless Stripe integration</li>
</ul>

<hr>

<h2>🧰 Tech Stack</h2>

<ul>
  <li><strong>Spring Boot 3+</strong> – Core backend framework</li>
  <li><strong>Spring Security + JWT</strong> – Secure, stateless authentication</li>
  <li><strong>MySQL</strong> – Relational database for persistence</li>
  <li><strong>Stripe API</strong> – Payment processing</li>
  <li><strong>Flyway</strong> – Versioned DB migrations</li>
  <li><strong>MapStruct</strong> – Fast and type-safe object mapping</li>
  <li><strong>Lombok</strong> – Reduces boilerplate Java code</li>
</ul>

<hr>

<h2>⚙️ Getting Started</h2>

<h4>✅ Prerequisites</h4>
<ul>
  <li>Java 17+</li>
  <li>Maven</li>
  <li>MySQL</li>
</ul>

<h4>📦 Setup Instructions</h4>

<pre><code class="language-sh">
# Clone the project
git clone https://github.com/BossEros/store.git
cd store
</code></pre>

<h4>🔧 Configure the application</h4>
<ul>
  <li>Edit your DB config in <code>src/main/resources/application-dev.yaml</code></li>
  <li>Create a <code>.env</code> or set these environment variables:</li>
</ul>

<pre><code class="language-env">
JWT_SECRET=your_jwt_secret
STRIPE_SECRET_KEY=your_stripe_key
SPRING_PROFILES_ACTIVE=dev
</code></pre>

<hr>

<h2>📡 API Overview</h2>

<h4>🔐 Authentication</h4>
<ul>
  <li><code>POST /auth/login</code> – Login with credentials</li>
  <li><code>POST /auth/refresh</code> – Refresh your token</li>
  <li><code>GET /auth/me</code> – Get current authenticated user</li>
</ul>

<h4>📦 Products</h4>
<ul>
  <li><code>GET /products</code> – List all products</li>
  <li><code>GET /products/{id}</code> – Get a single product</li>
  <li><code>POST /products</code> – Add a new product</li>
  <li><code>PUT /products/{id}</code> – Update product details</li>
  <li><code>DELETE /products/{id}</code> – Delete a product</li>
</ul>

<h4>🛒 Shopping Cart</h4>
<ul>
  <li><code>POST /carts</code> – Create a new cart</li>
  <li><code>GET /carts/{cartId}</code> – View cart contents</li>
  <li><code>POST /carts/{cartId}/items</code> – Add item to cart</li>
  <li><code>PUT /carts/{cartId}/items/{productId}</code> – Update item quantity</li>
  <li><code>DELETE /carts/{cartId}/items/{productId}</code> – Remove item from cart</li>
  <li><code>DELETE /carts/{cartId}/items</code> – Clear the cart</li>
</ul>

<h4>💳 Checkout</h4>
<ul>
  <li><code>POST /checkout</code> – Start checkout process</li>
  <li><code>POST /checkout/webhook</code> – Stripe webhook listener</li>
</ul>

<hr>

<h2>🧪 Sample Request (Login)</h2>

<pre><code class="language-json">
POST /auth/login
Content-Type: application/json

{
  "email": "user@example.com",
  "password": "securepassword"
}
</code></pre>

<hr>

<h2>📄 License</h2>

<p>This project is licensed under the <a href="LICENSE">MIT License</a>.</p>

<hr>

<h2>📬 Contact</h2>

<p>For support or contributions:</p>
<ul>
  <li><strong>Email:</strong> itschristiandavevilanofficial@gmail.com</li>
  <li><strong>GitHub:</strong> <a href="https://github.com/BossEros">BossEros</a></li>
</ul>

<hr>

<h2>🤝 Contributing</h2>

<p>Pull requests are welcome! For major changes, please open an issue first to discuss what you'd like to modify.</p>
