/*
Function<String, Function<String, String>> greeting = (greetingText) -> {
    return (name) -> {
        return greetingText + " " + name;
    };
};

Function<String, String> hello = greeting.apply("Hello");
Function<String, String> hi = greeting.apply("HI");

System.out.println(hello.apply("무명소졸"));
System.out.println(hi.apply("무명소졸"));
*/
