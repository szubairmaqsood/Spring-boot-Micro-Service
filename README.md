# Spring-boot-Micro-Service
The link of youtube

https://www.youtube.com/watch?v=sd3BaQr2nxA&list=PLqq-6Pq4lTTZSKAFG6aCDVDP86Qx4lNas&index=9

Use of stream

ratings.stream().map { rating->
            CatalogItem("Transformers","Test",5)
        }.collect(Collectors.toList())

Each element in array is passed through a sequance of function where each element is a parameter
then you collect into a specific kind of data structure