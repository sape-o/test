package main

import( 
   "fmt" 
   "time"
)

func cal() int{
 t := 0
 num := 200000000000
 for i := 0; i < num ; i++{
	t++
 }
 return t
}

func main(){
 start := time.Now()
 total := cal()
 elapsed := time.Since(start)
 fmt.Println("Total is",total,"in",elapsed)
}

