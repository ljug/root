service=http://localhost:8080/serviceMag/webresources

cho $service/net.cofares.magasin
curl -X POST -H "Content-Type: application/xml" -H "Accept: application/xml" -d @$1 $service/net.cofares.$2 | xmllint --format -




