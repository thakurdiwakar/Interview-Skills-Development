# What is Walrus Operator in Python?

The walrus operator in Python, denoted by :=, is a relatively new addition to the language (introduced in Python 3.8) that allows you to assign a value to a variable as part of an expression.
    
       
         
           
                               # Without the walrus operator
                    my_list = [1, 2, 3, 4, 5]
                    if len(my_list) > 3:
                        print("List is too long, processing may take a while...")
                        filtered_list = [x for x in my_list if x % 2 == 0]
                        print(filtered_list)

                    # With the walrus operator
                    my_list = [1, 2, 3, 4, 5]
                    if (n := len(my_list)) > 3:
                        print(f"List is too long ({n} elements), processing may take a while...")
                        print(filtered_list := [x for x in my_list if x % 2 == 0])
