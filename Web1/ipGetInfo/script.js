const ip = '191.42.150.171'
const url = `http://127.0.0.1:5000/get_ip_info/${ip}`


// async function getData() {
//     try {
//         const rest = await fetch(url)
//         const data = await rest.json()
//         console.log(url)
//         console.log(data)
//         document.getElementById('ip').innerText = data.ip
//     } catch (error) {
//         console.error('Error fetching data:', error)
//     }
// }

fetch(url)
  .then(response => response.json())
  .then(data => {
    console.log(data);
    document.getElementById('ip').innerText = data.ip;
    document.getElementById('City').innerText = data.city;
    document.getElementById('Region').innerText = data.region;
    document.getElementById('Country').innerText = data.country;
    document.getElementById('Loc').innerText = data.loc;
    document.getElementById('Org').innerText = data.org;
    document.getElementById('Postal').innerText = data.postal;
    document.getElementById('TimeZone').innerText = data.timezone;
  })
  .catch(error => console.error('Error:', error));


// getData()


/*
This code will fetch the data from the API and log it to the console. 
Conclusion 
In this tutorial, you learned how to use the IPinfo API to get information about an IP address. You also learned how to use the API to get information about your own IP address. 
If you want to learn more about the IPinfo API, you can check out the  official documentation. 
Happy coding! 
Peer Review Contributions by:  Lalithnarayan C
*/
