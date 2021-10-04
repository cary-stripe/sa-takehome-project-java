# Take home project
This is a simple e-commerce application that a customer can use to purchase a book, but it's missing the payments functionality —  your goal is to integrate Stripe to get this application running!

## Candidate instructions
You'll receive these in email.

## Application overview
This demo is written in Java with the [SparkJava](https://sparkjava.com/) web framework. You'll need to retrieve a set of testmode API keys from the Stripe dashboard (you can create a free test account [here](https://dashboard.stripe.com/register)) to run this locally.

We are using the [Bootstrap](https://getbootstrap.com/docs/4.6/getting-started/introduction/) CSS framework. It is the most popular CSS framework in the world and is pretty easy to get started with — feel free to modify public/css if you like.

We are also making use of [Handlebars](https://handlebarsjs.com/) as our front end templating engine.

Finally, the [Stripe Java SDK](https://github.com/stripe/stripe-java) is already imported for you to use.

To simplify this project, we're also not using any database here, either. Instead `Server.java` includes a simple switch statement to read the GET params for `item`.

To get started

Please first run:

```
$ git clone https://github.com/cary-stripe/sa-takehome-project-java.git && cd sa-takehome-project-java
```

After you are in the project root directory to complete the light set up please first rename `sample.env` to `.env` and replace the values with both your publishable and secret key from your Stripe Dashboard.

We are using the [dotenv-java library](https://github.com/cdimascio/dotenv-java). This library has already been installed for you to use.
Please see link for additional usage information.

Once you have set up your environment file, in order to build and run, you can run the following commands

```
$ ./gradlew build
$ ./gradlew run
```

Finally, navigate to [http://localhost:4567](http://localhost:4567) to view the index page.
