# Contributions

Feel free to contribute to this course by submitting pull requests or opening issues.

## Development Guide

We use `npm` to manage our dependencies.

    npm install

### Develop the presentation

Embed code snippets into the content files with [embedme](https://www.npmjs.com/package/embedme), then render the page with [Vite](https://vitejs.dev/).  
Source code changes are automatically reflected in the browser.

    npm run embed
    npm run dev

### Build the presentation

Bundle the final presentation into a single deployment.  
Optionally check that all snippets have been embedded.

    npm run embed-verify
    npm run build
