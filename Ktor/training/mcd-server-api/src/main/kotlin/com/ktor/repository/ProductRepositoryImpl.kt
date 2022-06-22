package com.ktor.repository

import com.ktor.models.ApiResponse
import com.ktor.models.Product

class ProductRepositoryImpl : ProductRepository {

    companion object{
        const val PREV_PAGE = "prevPage"
        const val NEXT_PAGE = "nextPage"
    }

    override val product: Map<Int, List<Product>> by lazy{
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5,
            6 to page6
        )
    }

    override val page1: List<Product> = listOf(
        Product(
            id = 1,
            name = "Big Mac",
            price = 3.99,
            image = "/product/images/bigmac.jpg",
            description = "Mouthwatering perfection starts with two 100% pure beef patties and Big Mac® sauce sandwiched between a sesame seed bun. It’s topped off with pickles, crisp shredded lettuce, finely chopped onion and American cheese for a 100% beef burger with a taste like no other. ",
            category = "Burgers",
            favorite = true,
            calories = "550 Cal.",
            protein = "25 g",
            carbs = "45 g",
            fat = "30 g",
            ingredients = listOf(
                "Big Mac Bun",
                "Beef patty",
                "Shredded Lettuce",
                "Big Mac Sauce",
                "Pasteurized Process American Cheese",
                "Pickle Slices",
                "Onions"
            )
        ),
            Product(
                id = 2,
                name = "Double Cheeseburger",
                price = 1.69,
                image = "/product/images/double_cheeseburger.jpg",
                description = "The McDonald's Double Cheeseburger features two 100% pure beef burger patties seasoned with just a pinch of salt and pepper. It's topped with tangy pickles, chopped onions, ketchup, mustard and two slices of melty American cheese.",
                category = "Burgers",
                favorite = true,
                calories = "450 cal.",
                protein = "25 g",
                carbs = "34 g",
                fat = "24 g",
                ingredients = listOf(
                    "Regular Bun",
                    "Beef Patty",
                    "Pasteurized Process American Cheese",
                    "Pickle Slices",
                    "Ketchup",
                    "Onions",
                    "Mustard"
                )
            ),
        Product(
            id = 3,
            name = "McDouble",
            price = 2.60,
            image = "/product/images/mcdouble.jpg",
            description = "The classic McDouble® burger stacks two 100% pure beef patties seasoned with just a pinch of salt and pepper. ",
            category = "Burgers",
            favorite = true,
            calories = "400 Cal.",
            protein = "20 g",
            carbs = "33 g",
            fat = "20 g",
            ingredients = listOf(
                "Regular Bun",
                "Beef Patty",
                "Pasteurized Process American Cheese",
                "Pickle Slices",
                "Ketchup",
                "Onions",
                "Mustard"
            )
        ),
        Product(
            id = 4,
            name = "Cheeseburger",
            price = 1.00,
            image = "/product/images/cheeseburger.jpg",
            description = "Our simple, classic cheeseburger begins with a 100% pure beef burger seasoned with just a pinch of salt and pepper. The McDonald’s Cheeseburger is topped with a tangy pickle, chopped onions, ketchup, mustard, and a slice of melty American cheese. ",
            category = "Burgers",
            favorite = false,
            calories = "300 Cal.",
            protein = "15 g",
            carbs = "32 g",
            fat = "13 g",
            ingredients = listOf(
                "Regular Bun",
                "Beef Patty",
                "Pasteurized Process American Cheese",
                "Pickle Slices",
                "Ketchup",
                "Onions",
                "Mustard"
            )
        ),
        Product(
            id = 5,
            name = "Hamburger",
            price = 0.89,
            image = "/product/images/hamburger.jpg",
            description = "The original burger starts with a 100% pure beef burger seasoned with just a pinch of salt and pepper. Then, the McDonald’s burger is topped with a tangy pickle, chopped onions, ketchup and mustard.",
            category = "Burgers",
            favorite = false,
            calories = "250 Cal.",
            protein = "12 g",
            carbs = "31 g",
            fat = "9 g",
            ingredients = listOf(
                "Regular Bun",
                "Beef Patty",
                "Pickle Slices",
                "Ketchup",
                "Onions",
                "Mustard"
            )
        ),
        Product(
            id = 6,
            name = "Crispy Chicken Sandwich",
            price = 1.29,
            image = "/product/images/crispy_chicken_sandwich.jpg",
            description = "McDonald's Crispy Chicken Sandwich is a southern style fried chicken sandwich that's crispy, juicy and tender perfection. It’s topped with crinkle-cut pickles and served on a toasted, buttered potato roll. ",
            category = "Chicken",
            favorite = false,
            calories = "470 Cal.",
            protein = "26 g",
            carbs = "46 g",
            fat = "20 g",
            ingredients = listOf(
                "Potato Roll",
                "Crispy Chicken Fillet",
                "Crinkle Cut Pickle",
                "Salted Butter"
            )
        ),
        Product(
            id = 7,
            name = "Spicy Deluxe Crispy Chicken Sandwich",
            price = 2.69,
            image = "/product/images/Spicy_deluxe_crispy_chicken_sandwich.jpg",
            description = "The Spicy Deluxe Crispy Chicken is big on everything, including heat. Our southern-style fried chicken fillet on a potato roll, topped with shredded lettuce, Roma tomatoes and Spicy Pepper Sauce kicks crispy, juicy and tender up to the highest level.",
            category = "Chicken",
            favorite = true,
            calories = "530 Cal.",
            protein = "27 g",
            carbs = "49 g",
            fat = "26 g",
            ingredients = listOf(
                "Potato Roll",
                "Crispy Chicken Fillet",
                "Shredded Lettuce",
                "Roma Tomato",
                "Spicy Pepper Sauce",
            )
        )
    )

    override val page2: List<Product> = listOf(
        Product(
            id = 8,
            name = "McChicken",
            price = 1.10,
            image = "/product/images/mcchicken.jpg",
            description = "It’s a classic for a reason. Savor the satisfying crunch of our juicy chicken patty, topped with shredded lettuce and just the right amount of creamy mayonnaise, all served on a perfectly toasted bun.",
            category = "Chicken",
            favorite = false,
            calories = "400 Cal.",
            protein = "15 g",
            carbs = "40 g",
            fat = "21 g",
            ingredients = listOf(
                "Regular Bun",
                "McChicken patty",
                "Shredded Lettuce",
                "Mayonnaise"
            )
        ),
        Product(
            id = 9,
            name = "Chicken McNuggets",
            price = 1.00,
            image = "/product/images/mcnugget.jpg",
            description = "Our tender, juicy Chicken McNuggets® are made with all white meat chicken and no artificial colors, flavors or preservatives.",
            category = "Chicken",
            favorite = true,
            calories = "170 cal.",
            protein = "9 g",
            carbs = "10 g",
            fat = "10 g",
            ingredients = listOf(
                "Chicken Nugget"
            )
        ),
        Product(
            id = 10,
            name = "Filet-O-Fish",
            price = 1.00,
            image = "/product/images/fillet_o_fish.jpg",
            description = "Dive into our wild-caught Filet-O-Fish®! This McDonald’s fish sandwich has fish sourced from sustainably managed fisheries, on melty American cheese and topped with creamy McDonald’s tartar sauce, all served on a soft, steamed bun. ",
            category = "Chicken",
            favorite = false,
            calories = "380 Cal.",
            protein = "16 g",
            carbs = "339g",
            fat = "18 g",
            ingredients = listOf(
                "Regular Bun",
                "Fish Filet Patty",
                "Pasteurized Process American Cheese Half Slice",
                "Tartar Sauce"
            )
        ),
        Product(
            id = 11,
            name = "Egg McMuffin",
            price = 1.10,
            image = "/product/images/egg_muffin.jpg",
            description = "Our Egg McMuffin® breakfast sandwich is an excellent source of protein and oh so delicious. We place a freshly cracked Grade A egg on a toasted English Muffin topped with real butter and add lean Canadian bacon and melty American cheese. ",
            category = "Breakfast",
            favorite = true,
            calories = "310 Cal.",
            protein = "17 g",
            carbs = "30 g",
            fat = "13 g",
            ingredients = listOf(
                "English Muffin",
                "Egg",
                "Canadian Bacon",
                "Pasteurized Process American Cheese",
                "Salted Butter",
                "Clarified Butter"
            )
        ),
        Product(
            id = 12,
            name = "Sausage McMuffin",
            price = 1.19,
            image = "/product/images/sausage_muffin.jpg",
            description = "McDonald's Sausage McMuffin® recipe features a warm, freshly toasted English muffin, topped with a savory hot sausage patty and a slice of melty American cheese. There are 400 calories in a Sausage McMuffin® at McDonald's. ",
            category = "Breakfast",
            favorite = false,
            calories = "400 Cal.",
            protein = "14 g",
            carbs = "29 g",
            fat = "26 g",
            ingredients = listOf(
                "English Muffin",
                "Sausage Patty",
                "Pasteurized Process American Cheese",
                "Salted Butter",
            )
        ),
        Product(
            id = 13,
            name = "Bacon, Egg & Cheese McGriddles",
            price = 1.20,
            image = "/product/images/egg_mcgriddles.jpg",
            description = "Bacon, Egg & Cheese McGriddles® feature soft, warm griddle cakes with the sweet taste of maple. McDonald's McGriddles® recipe features thick-cut Applewood smoked bacon, a fluffy folded egg, and a slice of melty American cheese.  ",
            category = "Breakfast",
            favorite = false,
            calories = "430 Cal.",
            protein = "17 g",
            carbs = "44 g",
            fat = "21 g",
            ingredients = listOf(
                "Griddle Cakes",
                "Folded Egg",
                "Pasteurized Process American Cheese",
                "Thick Cut Applewood Smoked Bacon",
                "Clarified Butter"
            )
        ),
        Product(
            id = 14,
            name = "Sausage McGriddles",
            price = 1.29,
            image = "/product/images/sausage_mcgriddles.jpg",
            description = "Our Sausage McGriddles® breakfast sandwich features soft, warm griddle cakes—with the taste of sweet maple—that hold our savory, sizzling hot sausage. McGriddles® cakes have no artificial preservatives or flavors and no colors from artificial sources. ",
            category = "Breakfast",
            favorite = false,
            calories = "430 Cal.",
            protein = "11 g",
            carbs = "41 g",
            fat = "24 g",
            ingredients = listOf(
                "Griddle Cakes",
                "Sausage Patty",
            )
        )
    )

    override val page3: List<Product> = listOf(
        Product(
            id = 15,
            name = "Hotcakes",
            price = 2.39,
            image = "/product/images/hotcakes.jpg",
            description = "If you love pancakes, you've got to try McDonald's hotcakes with a side of real butter and sweet maple flavored hotcake syrup. This McDonald's breakfast comes with 3 golden brown hotcakes.  ",
            category = "Breakfast",
            favorite = false,
            calories = "550 Cal.",
            protein = "9 g",
            carbs = "101 g",
            fat = "15 g",
            ingredients = listOf(
                "Hotcakes",
                "Hotcakes Syrup",
                "SSalted Whipped Butter"
            )
        ),
        Product(
            id = 16,
            name = "Sausage Burrito",
            price = 1.20,
            image = "/product/images/burrito.jpg",
            description = "The Sausage Burrito is McDonald's Breakfast Burrito and is loaded with fluffy scrambled egg, pork sausage, melty cheese, green chiles and onion! It's wrapped in a soft tortilla, making it the perfect grab and go breakfast.",
            category = "Breakfast",
            favorite = false,
            calories = "310 cal.",
            protein = "15 g",
            carbs = "27 g",
            fat = "17 g",
            ingredients = listOf(
                "Flour Tortila",
                "Scrambled Egg Sausage And Vegetable Mix",
                "Pasteurized Process American Cheese",
            )
        ),
        Product(
            id = 17,
            name = "Hash Browns",
            price = 1.00,
            image = "/product/images/hashbrowns.jpg",
            description = "Our Hash Browns are deliciously tasty and perfectly crispy. These shredded potato hash brown patties are prepared so they’re fluffy on the inside and crispy and toasty on the outside. ",
            category = "Breakfast",
            favorite = false,
            calories = "140 Cal.",
            protein = "2 g",
            carbs = "18 g",
            fat = "8 g",
            ingredients = listOf(
                "Has Browns"
            )
        ),
        Product(
            id = 18,
            name = "Fruit & Maple Oatmeal",
            price = 2.00,
            image = "/product/images/oatmeal_fruit.jpg",
            description = "Our Fruit and Maple Oatmeal has two full servings of whole-grain oats with a touch of cream and brown sugar. Loaded with red and green apples, cranberries and two varieties of raisins, our oatmeal makes for a hearty, wholesome breakfast of whole grains and fruit.",
            category = "Breakfast",
            favorite = false,
            calories = "320 Cal.",
            protein = "5 g",
            carbs = "64 g",
            fat = "3 g",
            ingredients = listOf(
                "Oatmeal",
                "Diced Apples",
                "Cranberry Raisin Blend",
                "Light Cream",
            )
        ),
        Product(
            id = 19,
            name = "World Famous Fries",
            price = 1.00,
            image = "/product/images/world_famous_fries.jpg",
            description = "McDonald's World Famous Fries® are made with premium potatoes such as the Russet Burbank and the Shepody. ",
            category = "Snacks ",
            favorite = true,
            calories = "320 Cal.",
            protein = "4 g",
            carbs = "43 g",
            fat = "15 g",
            ingredients = listOf(
                "Potato Fries",
            )
        ),
        Product(
            id = 20,
            name = "Baked Apple Pie",
            price = 0.80,
            image = "/product/images/baked_apple_pie.jpg",
            description = "McDonald's Baked Apple Pie recipe features 100% American-grown apples, and a lattice crust baked to perfection and topped with sprinkled sugar.",
            category = "Snacks",
            favorite = false,
            calories = "230 Cal.",
            protein = "2 g",
            carbs = "33 g",
            fat = "11 g",
            ingredients = listOf(
                "Apple Pie",
            )
        ),
        Product(
            id = 21,
            name = "Chocolate Chip Cookie",
            price = 0.50,
            image = "/product/images/cookie.jpg",
            description = "McDonald's classic chocolate chip cookie, loaded with chocolate chips. It's a soft baked cookie and warmed to perfection.",
            category = "Snacks",
            favorite = false,
            calories = "170 Cal.",
            protein = "2 g",
            carbs = "22 g",
            fat = "8 g",
            ingredients = listOf(
                "Cookie Chip"
            )
        )
    )

    override val page4: List<Product> = listOf(
        Product(
            id = 22,
            name = "McFlurry with OREO® cookies",
            price = 1.49,
            image = "/product/images/mcflurry_oreo.jpg",
            description = "The McDonald’s McFlurry® with OREO® Cookies is an popular combination of OREO® pieces and vanilla soft  ",
            category = "Dessert",
            favorite = true,
            calories = "510 Cal.",
            protein = "10 g",
            carbs = "86 g",
            fat = "16 g",
            ingredients = listOf(
                "Vanila Reduced Fat Ice Cream",
                "Oreo Cookie Pieces"
            )
        ),
        Product(
            id = 23,
            name = "McFlurry with M&M'S® Candies",
            price = 1.49,
            image = "/product/images/mcflurry_mm.jpg",
            description = "The McDonald’s M&M ® McFlurry® is a sweet, creamy M&M’S® dessert of vanilla soft serve with M&M’S® chocolate candies swirled in. ",
            category = "Dessert",
            favorite = false,
            calories = "650 Cal.",
            protein = "12 g",
            carbs = "96 g",
            fat = "21 g",
            ingredients = listOf(
                "Vanila Reduced Fat Ice Cream",
                "M&M Mini Milk Chocolate Candies"
            )
        ),
        Product(
            id = 24,
            name = "Vanilla Cone",
            price = 0.5,
            image = "/product/images/vanila_cone.jpg",
            description = "Enjoy our creamy vanilla soft serve in a crispy cone!",
            category = "Dessert",
            favorite = true,
            calories = "200 cal.",
            protein = "5 g",
            carbs = "34 g",
            fat = "5 g",
            ingredients = listOf(
                "Vanila Reduced Fat Ice Cream",
                "Cone"
            )
        ),
        Product(
            id = 25,
            name = "Chocolate Shake",
            price = 2.50,
            image = "/product/images/chocolate_shake.jpg",
            description = "Try the McDonald’s Chocolate Shake, the perfect sweet treat for any time of the day. ",
            category = "Dessert",
            favorite = false,
            calories = "620 Cal.",
            protein = "14 g",
            carbs = "102 g",
            fat = "16 g",
            ingredients = listOf(
                "Chocolate Shake Syrup",
                "Vanila Reduced Fat Ice Cream",
                "Whipped Light Cream"
            )
        ),
        Product(
            id = 26,
            name = "Strawberry  Shake",
            price = 2.50,
            image = "/product/images/strawberry_shake.jpg",
            description = "Try the McDonald’s Strawberry Shake, the perfect sweet treat for any time of the day. ",
            category = "Dessert",
            favorite = false,
            calories = "620 Cal.",
            protein = "14 g",
            carbs = "102 g",
            fat = "16 g",
            ingredients = listOf(
                "Strawberry Shake Syrup",
                "Vanila Reduced Fat Ice Cream",
                "Whipped Light Cream"
            )
        ),
        Product(
            id = 27,
            name = "Vanila Shake",
            price = 2.50,
            image = "/product/images/vanila_shake.jpg",
            description = "Try the McDonald’s Vanila Shake, the perfect sweet treat for any time of the day. ",
            category = "Dessert",
            favorite = false,
            calories = "620 Cal.",
            protein = "14 g",
            carbs = "102 g",
            fat = "16 g",
            ingredients = listOf(
                "Vanila Shake Syrup",
                "Vanila Reduced Fat Ice Cream",
                "Whipped Light Cream"
            )
        ),
        Product(
            id = 28,
            name = "Hot Fudge Sundae",
            price = 1.29,
            image = "/product/images/sundae.jpg",
            description = "Our classic hot fudge sundae is made with creamy vanilla soft serve and smothered in chocolaty hot fudge topping. ",
            category = "Dessert",
            favorite = false,
            calories = "330 Cal.",
            protein = "6 g",
            carbs = "56 g",
            fat = "15 g",
            ingredients = listOf(
                "Vanila Reduced Fat Ice Cream",
                "Hot Fudge Topping"
            )
        )
    )

    override val page5: List<Product> = listOf(
        Product(
            id = 29,
            name = "Caramel Macchiato",
            price = 1.99,
            image = "/product/images/caramel_macchiato.jpg",
            description = "Our McCafé® Caramel Macchiato recipe features rich, dark-roast espresso served with steamed whole milk, mixed with sweet caramel syrup, and topped with ribbons of buttery caramel. ",
            category = "McCafe",
            favorite = true,
            calories = "260 Cal.",
            protein = "8 g",
            carbs = "41 g",
            fat = "12 g",
            ingredients = listOf(
                "Whole Milk",
                "Caramel Syrup",
                "Water",
                "Espresso",
                "Caramel Drizzle"
            )
        ),
        Product(
            id = 30,
            name = "Ice Caramel Macchiato",
            price = 1.89,
            image = "/product/images/iced_caramel_macchiato.jpg",
            description = "Our McCafé® Caramel Macchiato recipe features rich, dark-roast espresso served with steamed whole milk, mixed with sweet caramel syrup, and topped with ribbons of buttery caramel. ",
            category = "McCafe",
            favorite = false,
            calories = "270 Cal.",
            protein = "8 g",
            carbs = "45 g",
            fat = "12 g",
            ingredients = listOf(
                "Whole Milk",
                "Iced",
                "Caramel Syrup",
                "Water",
                "Espresso",
                "Caramel Drizzle"
            )
        ),
        Product(
            id = 31,
            name = "Cappuccino",
            price = 1.99,
            image = "/product/images/cappuccino.jpg",
            description = "McCafé® Cappuccino is made with whole steamed milk, bold espresso made from sustainably sourced beans, foamed milk, and your choice of flavor. ",
            category = "McCafe",
            favorite = false,
            calories = "120 Cal.",
            protein = "6 g",
            carbs = "9 g",
            fat = "6 g",
            ingredients = listOf(
                "Whole Milk",
                "Water",
                "Espresso",
            )
        ),
        Product(
            id = 32,
            name = "Latte",
            price = 1.99,
            image = "/product/images/latte.jpg",
            description = "Our McCafé® Latte is made from Rainforest Alliance Certified™ espresso and steamed milk. Customize the Latte that’s made fresh just for you with whole milk, mixed with your choice of flavor at certain locations.",
            category = "McCafe",
            favorite = false,
            calories = "140 Cal.",
            protein = "6 g",
            carbs = "12 g",
            fat = "8 g",
            ingredients = listOf(
                "Whole Milk",
                "Water",
                "Espresso",
            )
        ),
        Product(
            id = 33,
            name = "Iced Coffe",
            price = 1.60,
            image = "/product/images/iced_coffe.jpg",
            description = "McCafé Iced Coffee is refreshingly cool and made with 100% Arabica beans, cream and your choice of flavored coffee syrup – caramel, hazelnut, French vanilla and sugar-free French vanilla. ",
            category = "McCafe",
            favorite = false,
            calories = "180 Cal.",
            protein = "2 g",
            carbs = "30 g",
            fat = "8 g",
            ingredients = listOf(
                "Liquid Sugar",
                "Iced",
                "Brewed Coffee",
            )
        ),
        Product(
            id = 34,
            name = "Hot Chocolate",
            price = 1.29,
            image = "/product/images/hot_chocolate.jpg",
            description = "Taste the delicious chocolatey flavor of a McCafé® Hot Chocolate. Hot chocolate made with steamed whole milk, rich chocolate syrup and topped with whipped topping and chocolate drizzle. ",
            category = "McCafe",
            favorite = false,
            calories = "370 Cal.",
            protein = "12 g",
            carbs = "56 g",
            fat = "20 g",
            ingredients = listOf(
                "Whole Milk",
                "Chocolate Syrup",
                "Chocolate Drizzle",
                "Whipped Light Cream"
            )
        ),
        Product(
            id = 35,
            name = "Strawberry Banana Smoothie",
            price = 2.69,
            image = "/product/images/strawberry_smoothie.jpg",
            description = "The McCafé® Strawberry Banana Smoothie recipe features the perfect combination of fruit purees and fruit juices, such as strawberry and banana, blended with creamy low fat yogurt and ice.",
            category = "McCafe",
            favorite = false,
            calories = "240 Cal.",
            protein = "3 g",
            carbs = "55 g",
            fat = "1 g",
            ingredients = listOf(
                "Banana",
                "Strawberry",
                "Water",
                "Sugar",
            )
        )
    )

    override val page6: List<Product> = listOf(
        Product(
            id = 36,
            name = "Mango Pineapple Smoothie",
            price = 2.69,
            image = "/product/images/manggo_smoothie.jpg",
            description = "The McCafé® Strawberry Banana Smoothie recipe features the perfect combination of fruit purees and fruit juices, such as strawberry and banana, blended with creamy low fat yogurt and ice.",
            category = "McCafe",
            favorite = false,
            calories = "240 Cal.",
            protein = "3 g",
            carbs = "55 g",
            fat = "1 g",
            ingredients = listOf(
                "Mango",
                "Pineapple",
                "Water",
                "Sugar",
            )
        ),
        Product(
            id = 37,
            name = "Coca-Cola",
            price = 0.69,
            image = "/product/images/coca_cola.jpg",
            description = "Coca-Cola® is a refreshing McDonald's soda option that complements all of your menu favorites. ",
            category = "Beverages",
            favorite = true,
            calories = "210 cal.",
            protein = "0 g",
            carbs = "56 g",
            fat = "2 g",
            ingredients = listOf(
                "Coca-Cola",
                "Ice"
            )
        ),
        Product(
            id = 38,
            name = "Sprite",
            price = 0.69,
            image = "/product/images/sprite.jpg",
            description = "Sprite® is a delicious lemon-lime fountain drink  ",
            category = "Beverages",
            favorite = false,
            calories = "210 cal.",
            protein = "0 g",
            carbs = "56 g",
            fat = "2 g",
            ingredients = listOf(
                "Sprite",
                "Ice"
            )
        ),
        Product(
            id = 39,
            name = "Fanta® Orange",
            price = 0.69,
            image = "/product/imagesfanta_orange.jpg",
            description = "McDonald’s Fanta® Orange is a caffeine-free soft drink full of bubbly, refreshing orange flavor. ",
            category = "Beverages",
            favorite = true,
            calories = "210 cal.",
            protein = "0 g",
            carbs = "56 g",
            fat = "2 g",
            ingredients = listOf(
                "Fanta Orange",
                "Ice"
            )
        ),
        Product(
            id = 40,
            name = "Minute Maid® Tropical Mango Slushie",
            price = 0.79,
            image = "/product/images/minute_maid.jpg",
            description = "Sweet tropical mango taste with a hint of passion fruit flavor for an unexpected twist ",
            category = "Beverages",
            favorite = true,
            calories = "210 cal.",
            protein = "0 g",
            carbs = "56 g",
            fat = "0 g",
            ingredients = listOf(
                "Minute Maid Manggo",
                "Ice"
            )
        ),
        Product(
            id = 41,
            name = "Water",
            price = 0.59,
            image = "/product/images/water.jpg",
            description = "DASANI is purified water enhanced with minerals for a pure, fresh taste. ",
            category = "Beverages",
            favorite = true,
            calories = "0 cal.",
            protein = "0 g",
            carbs = "0 g",
            fat = "0 g",
            ingredients = listOf(
                "Water"
            )
        ),
        Product(
            id = 42,
            name = "Sweet Tea",
            price = 0.69,
            image = "/product/images/sweet_tea.jpg",
            description = "McDonald’s Sweet Tea is made from a briskly refreshing blend of orange pekoe and pekoe cut black tea, sweetened to perfection. ",
            category = "Beverages",
            favorite = true,
            calories = "100 cal.",
            protein = "0 g",
            carbs = "56 g",
            fat = "0 g",
            ingredients = listOf(
                "Tea",
                "Sugar",
                "Ice"
            )
        )
    )

    override suspend fun getAllProducts(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREV_PAGE],
            nextPage = calculatePage(page = page)[NEXT_PAGE],
            product = product[page]!!
        )
    }
    private fun calculatePage(page : Int) : Map<String , Int?>{
        var prevPage : Int? = page
        var nextPage : Int? = page
        if(page in 1..5){
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..6) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 6) {
            nextPage = null
        }
        return mapOf(PREV_PAGE to prevPage, NEXT_PAGE to nextPage)
    }


    override suspend fun searchProduct(query: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            product = findProductByName(name = query)
        )
    }
    private fun findProductByName(name: String?) : List<Product>{
        val founded = mutableListOf<Product>()
        if (!name.isNullOrEmpty()){
            product.forEach{ ( _ , product ) ->
                product.forEach{ products ->
                    if(products.name.lowercase().contains(name.lowercase())){
                        founded.add(products)
                    }
                }
            }
            return founded
        } else{
            return emptyList()
        }
    }

    override suspend fun getProductByCategory(category: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            product = findProductByCategory(name = category)
        )
        //            println("menu category must be Burgers, Chicken, Breakfast, Snacks, Desserts, McCafe, and Beverages")
    }
    private fun findProductByCategory(name : String?) : List<Product>{
        val founded = mutableListOf<Product>()
        if (!name.isNullOrEmpty()){
            product.forEach{ ( _ , product ) ->
                product.forEach{ products ->
                    if(products.category.lowercase().contains(name.lowercase())){
                        founded.add(products)
                    }
                }
            }
            return founded
        } else{
            return emptyList()
        }
    }
}
