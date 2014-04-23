service=http://localhost:8080/serviceMag/webresources

echo $service/net.cofares.magasin
curl -X GET -H "Accept: application/$1"  $service/net.cofares.$2 | xmllint --format -


curl -X GET -H "Accept: application/$1"  $service/net.cofares.$2  | python -mjson.tool 


