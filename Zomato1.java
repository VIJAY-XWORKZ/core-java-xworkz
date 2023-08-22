class Zomato1 {
 public static double search (String foodName ) {
   double price =0.0;
		   System.out.println("invoked search: foodName (String)");
		  
		  if (foodName == "tomato soup") {
			    price=60.00;
              }
				 if (foodName == "leg soup") {
			   price=90.00;
                }
				 if (foodName == "vegetable soup") {
			    price=60.00;
                }
				if (foodName == "cream soup") {
			    price=60.00;
                }
		   if (foodName == "crunchy non veg Burger") {
			    price=90.00;
                 }
				 if (foodName == "chicken fried rice") {
			   price=160.00;
                }
				 if (foodName == "egg fried rice") {
			    price=160.00;
                }
				if (foodName == "kimchi friedrice") {
			    price=180.00;
                }
				 if (foodName == "mushroom friedrice") {
			   price=190.00;
               }
               if (foodName == "brown rice") {
			    price=210.00;
                 }
		      if (foodName == "pizza") {
			   price=180.00;
               }
               if (foodName == "Burger") {
			    price=90.00;
                 }
				 if (foodName == "french fries") {
			   price=60.00;
                }
				 if (foodName == "pasta") {
			    price=210.00;
                }
				if (foodName == "thali") {
			    price=220.00;
                }
				 if (foodName == "biryani") {
			   price=160.00;
               }
               if (foodName == "fried rice") {
			    price=110.00;
                 }
				 if (foodName == "cheese french fries") {
			   price=100.00;
                }
				 if (foodName == "masala french fries") {
			    price=260.00;
                }
				if (foodName == "crinckle cut fries") {
			    price=260.00;
                }
				 if (foodName == " smileys") {
			   price=160.00;
               }
               if (foodName == "wedges") {
			    price=90.00;
                 }
				 if (foodName == "shoestring fries") {
			   price=60.00;
                }
				 if (foodName == "waffle") {
			    price=260.00;
                }
				if (foodName == "steak cut fries") {
			    price=260.00;
                }
				 if (foodName == "tatar tats") {
			   price=160.00;
               }
               if (foodName == "lasanga") {
			    price=90.60;
                 }
				 if (foodName == "cheese pasta") {
			   price=110.00;
                }
				 if (foodName == "chicken pasta") {
			    price=260.00;
                }
				if (foodName == "spaghetti") {
			    price=260.00;
                }
				 if (foodName == "shrimp alfredo") {
			   price=160.20;
               }
               if (foodName == "double cheese Burger") {
			    price=120.00;
                 }
				 if (foodName == "veg burger") {
			   price=90.00;
                }
				 if (foodName == "chicken burger") {
			    price=110.00;
                }
				if (foodName == "lamb burger") {
			    price=160.00;
                }
				 if (foodName == "crunchy veg burger") {
			   price=150.00;
               }
               
				 if (foodName == "pork fried rice") {
			   price=110.00;
                }
				 if (foodName == "mexican friedrice") {
			    price=160.00;
                }
				if (foodName == "Hyderbadi biryani") {
			    price=220.00;
                }
				 if (foodName == "veg biryani") {
			   price=160.00;
               }
               if (foodName == "chicken biryani") {
			    price=220.00;
                 }
				 if (foodName == "mutton biryani") {
			   price=280.00;
                }
				 if (foodName == "veg dum biryani") {
			    price=160.20;
                }
				if (foodName == "prawn biryani") {
			    price=260.20;
                }
				 if (foodName == "mughlai biryani") {
			   price=260.00;
               }
               if (foodName == "mushroom biryani") {
			    price=190.00;
                 }
				 if (foodName == "egg biryani") {
			   price=160.00;
                }
				 if (foodName == "ambur biryani") {
			    price=260.00;
                }
				if (foodName == "north indian thali") {
			    price=260.00;
                }
				 if (foodName == "south indian thali") {
			   price=260.00;
               }
               
				System.out.println("end of search with one parameter");
				return price;
				
}


 public static double search (String foodName,int quantity ) {
   double price =0.0*quantity;
		   System.out.println("invoked search: foodName (String)");
		  
		  if (foodName == "tomato soup") {
			    price=60.00*quantity;
                  }
				 if (foodName == "leg soup") {
			   price=90.00*quantity;
                 }
				 if (foodName == "vegetable soup") {
			    price=60.00*quantity;
                 }
				if (foodName == "cream soup") {
			    price=60.00*quantity;
                 }
		   if (foodName == "crunchy non veg Burger") {
			    price=90.00*quantity;
                  }
				 if (foodName == "chicken fried rice") {
			   price=160.00*quantity;
                 }
				 if (foodName == "egg fried rice") {
			    price=160.00*quantity;
                 }
				if (foodName == "kimchi friedrice") {
			    price=180.00*quantity;
                 }
				 if (foodName == "mushroom friedrice") {
			   price=190.00*quantity;
                }
               if (foodName == "brown rice") {
			    price=210.00*quantity;
                  }
		      if (foodName == "pizza") {
			   price=180.00*quantity;
                }
               if (foodName == "Burger") {
			    price=90.00*quantity;
                  }
				 if (foodName == "french fries") {
			   price=60.00*quantity;
                 }
				 if (foodName == "pasta") {
			    price=210.00*quantity;
                 }
				if (foodName == "thali") {
			    price=220.00*quantity;
                 }
				 if (foodName == "biryani") {
			   price=160.00*quantity;
                }
               if (foodName == "fried rice") {
			    price=110.00*quantity;
                  }
				 if (foodName == "cheese french fries") {
			   price=100.00*quantity;
                 }
				 if (foodName == "masala french fries") {
			    price=260.00*quantity;
                 }
				if (foodName == "crinckle cut fries") {
			    price=260.00*quantity;
                 }
				 if (foodName == " smileys") {
			   price=160.00*quantity;
                }
               if (foodName == "wedges") {
			    price=90.00*quantity;
                  }
				 if (foodName == "shoestring fries") {
			   price=60.00*quantity;
                 }
				 if (foodName == "waffle") {
			    price=260.00*quantity;
                 }
				if (foodName == "steak cut fries") {
			    price=260.00*quantity;
                 }
				 if (foodName == "tatar tats") {
			   price=160.00*quantity;
                }
               if (foodName == "lasanga") {
			    price=90.60*quantity;
                  }
				 if (foodName == "cheese pasta") {
			   price=110.00*quantity;
                 }
				 if (foodName == "chicken pasta") {
			    price=260.00*quantity;
                 }
				if (foodName == "spaghetti") {
			    price=260.00*quantity;
                 }
				 if (foodName == "shrimp alfredo") {
			   price=160.20*quantity;
                }
               if (foodName == "double cheese Burger") {
			    price=120.00*quantity;
                  }
				 if (foodName == "veg burger") {
			   price=90.00*quantity;
                 }
				 if (foodName == "chicken burger") {
			    price=110.00*quantity;
                 }
				if (foodName == "lamb burger") {
			    price=160.00*quantity;
                 }
				 if (foodName == "crunchy veg burger") {
			   price=150.00*quantity;
                }
               
				 if (foodName == "pork fried rice") {
			   price=110.00*quantity;
                 }
				 if (foodName == "mexican friedrice") {
			    price=160.00*quantity;
                 }
				if (foodName == "Hyderbadi biryani") {
			    price=220.00*quantity;
                 }
				 if (foodName == "veg biryani") {
			   price=160.00*quantity;
                }
               if (foodName == "chicken biryani") {
			    price=220.00*quantity;
                  }
				 if (foodName == "mutton biryani") {
			   price=280.00*quantity;
                 }
				 if (foodName == "veg dum biryani") {
			    price=160.20*quantity;
                 }
				if (foodName == "prawn biryani") {
			    price=260.20*quantity;
                 }
				 if (foodName == "mughlai biryani") {
			   price=260.00*quantity;
                }
               if (foodName == "mushroom biryani") {
			    price=190.00*quantity;
                  }
				 if (foodName == "egg biryani") {
			   price=160.00*quantity;
                 }
				 if (foodName == "ambur biryani") {
			    price=260.00*quantity;
                 }
				if (foodName == "north indian thali") {
			    price=260.00*quantity;
                 }
				 if (foodName == "south indian thali") {
			   price=260.00*quantity;
                }
               
				System.out.println("end of search with two parameter");
				 
}
}