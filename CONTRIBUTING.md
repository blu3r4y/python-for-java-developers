# Contributions

Feel free to contribute to this course by submitting pull requests or opening issues.

## Development Guide

We use `npm` to manage our dependencies.

    npm install

### Develop the presentation

Embed code snippets into the content files with [EmbedMe](https://www.npmjs.com/package/embedme), then render the page with [Vite](https://vitejs.dev/).  
Source code changes are automatically reflected in the browser.

    npm run embed
    npm run dev

### Build the presentation

Bundle the final presentation into a single deployment.  
Optionally check that all snippets have been embedded.

    npm run embed-verify
    npm run build

### Build the excerpt

If you have [Pandoc](https://pandoc.org/) installed, you can directly use the script from within the `slides` directory.

    cd slides
    ./excerpt.sh

Alternatively, you can utilize a small Docker container to build the excerpt.

    docker run --rm -v "$(pwd)/slides:/data" --entrypoint "./excerpt.sh" pandoc/core:2.16.1

Find the final excerpt at `./slides/dist/excerpt.html`.
