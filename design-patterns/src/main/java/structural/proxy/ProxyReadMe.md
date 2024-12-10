## Scenario

### Problem

When people hear the term proxy, they usually think of proxy servers. In networking, a proxy is a server that acts as a go-between for users and the websites they visit. When you use a proxy server, your request goes through that server to reach the website, and any response comes back through the same proxy to you. While this might seem simple, proxy servers do more than just pass along requests; they also serve as firewalls and web filters, provide shared network connections, and cache data to speed up frequent requests. A good proxy server protects users and the network from harmful content, ensuring privacy and security. Additionally, in a programming example, if the Internet is a class and users connect to websites, a new requirement is to restrict access to certain banned websites for specific users without blocking them entirely on the internet.

### Solution

We need an intermediary server, a proxy, that checks user requests against a list of banned websites. If the user tries to access one of these sites, an error will appear. This reflects the proxy pattern, a structural design pattern that provides a substitute for another object and controls access to it.
