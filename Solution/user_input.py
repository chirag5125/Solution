#comment: ask user for name.
name= input("Enter name : ")
print(name)

#ask for age
age=input("Enter age : ")
print(age)
#ask address
city=input("Which city do you live in?: " )
print(city)
#ask hobby
hobby=input("What do you like to do?: ")
print(hobby)
#create and print output
output="Hi,{} you are {} years old, you live in {} and your hobby is to {}".format(name,age,city,hobby)
print(output)
