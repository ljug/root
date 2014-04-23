service=http://localhost:8080/serviceMag/webresources

cho $service/net.cofares.magasin
curl -X DELETE -H "Content-Type: application/xml" $service/net.cofares.$2/$1 




