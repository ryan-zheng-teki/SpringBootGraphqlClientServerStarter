import gql from 'graphql-tag';


/*
show the latest five blogs.If current categor is empty, then show the latest 5 blogs.
After i click the category, i should send a request to server to get all the blog files
for the category. And show the blogs for the file
*/

const GET_POSTS = gql`
  query Posts{
    posts {
        content
    }
  }
`;