import React from 'react';
import { InMemoryCache } from 'apollo-cache-inmemory';
import { HttpLink } from 'apollo-link-http';
import { ApolloClient } from 'apollo-client';
import { ApolloProvider } from '@apollo/react-hooks';


const cache = new InMemoryCache();
const client = new ApolloClient({
    link: new HttpLink({
        uri: 'http://localhost:8080/graphql'
    }),
    cache,
});

cache.writeData({
    data: {

    },
});

function App() {
    return (
        <ApolloProvider client={client}>
            <div>Runnign Demo</div>
        </ApolloProvider>
    );
}
export default App;
