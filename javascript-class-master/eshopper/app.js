var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');

var indexRouter = require('./routes/index.js');
var usersRouter = require('./routes/users.js');
var errorRouter = require('./routes/404.js');
var blog_singleRouter = require('./routes/blog-single.js');
var blogRouter = require('./routes/blog.js');
var cartRouter = require('./routes/cart.js');
var checkoutRouter = require('./routes/checkout.js');
var contact_usRouter = require('./routes/contact-us.js');
var loginRouter = require('./routes/login.js');
var product_detailsRouter = require('./routes/product-details.js');
var shopRouter = require('./routes/shop.js');

var app = express();

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

app.use('/index.html', indexRouter);
app.use('/users', usersRouter);
app.use('/404.html', errorRouter);
app.use('/blog-single.html', blog_singleRouter);
app.use('/blog.html', blogRouter);
app.use('/cart.html', cartRouter);
app.use('/checkout.html', checkoutRouter);
app.use('/contact-us.html', contact_usRouter);
app.use('/login.html', loginRouter);
app.use('/product-details.html', product_detailsRouter);
app.use('/shop.html', shopRouter);

// catch 404 and forward to error handler
app.use(function(req, res, next) {
  next(createError(404));
});

// error handler
app.use(function(err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});

module.exports = app;
