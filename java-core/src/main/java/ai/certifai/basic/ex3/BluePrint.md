# Construction of Class

## **Background**
### Analogy 1: Cloning
 <p align="center">
   <img width="300" height="400" src="metadata/cloning.gif">
 </p>  

### Analogy 2: Create identical items out of the blueprint design

 What is **blueprint**?  
 Reproduction of technical drawing to allow rapid and accurate production of an unlimited number of copies.


 <p align="center">
   <img width="550" height="400" src="metadata/spaceX.jpg">
 </p>  
 
  <p align="center">
    <img width="550" height="400" src="metadata/spaceXengine.jpg">
  </p>  
 

**What To Do**  
1. Uncomment 3 lines of code [_from line 59 to 61_](https://github.com/CertifaiAI/learn-java-the-certifai-way/blob/master/java-core/src/main/java/ai/certifai/basic/ex3/BluePrint.java#L59-L61)  
2. Add functions in the class [_PersonalProfile.class_](https://github.com/CertifaiAI/learn-java-the-certifai-way/blob/master/java-core/src/main/java/ai/certifai/basic/ex3/BluePrint.java#L40-L42) to support item 1 to works.  

**Example Code**  
```
public {returning format} {function name}()      
{        
     return {variable name};      
}    
```


**Expected Output** 
```
Total Number: 1  
Name: John Doe  
Height: 165    
Width: 100   
```

**Key Takeaways**
- Did you changed the modifier of the variable _name_, _height_, _width_ to make it works? 

 <p align="center">
   <img src="metadata/public.png">
 </p> 
 
 # **Don't do it. Why?**
  <p align="center">
   <img src="metadata/tenor.gif">
 </p> 
 
 The **private** prevent outside entities from access the variables.  
 You can only deal with the **private** members through getter and setter functions. 
 
- **void**: Returns no value.  

- There are access modifiers to select on the class, package, function, variables level.  

| Access Modifiers | Function |
| --- | ----------- |
| public | Visible to everywhere. The method / variable can be called from anywhere from outside the program as well. |
| protected | The member can only be accessed by its own class, and subclass of its class in its own package  |
| private | The member can only be accessed by own class |
 
- **Always** provide variable's name which express it's purpose and meaning clearly.  

## **Quiz** 

1. Is .java program equal to machine code?  
