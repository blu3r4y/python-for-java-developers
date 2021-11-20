export default {
  plugins: [watch_markdown_files()],
  /* final site will reside under this sub-path */
  base: "./",
  /* the reveal project root */
  root: "./slides",
  /* relative to 'root' - the markdown content */
  publicDir: "./content",
  /* the embedded highlight.js are allowed to be large */
  build: {
    chunkSizeWarningLimit: 2048,
  },
};

function watch_markdown_files() {
  return {
    name: "watch_markdown_files",
    handleHotUpdate({ file, server }) {
      if (file.endsWith(".md")) {
        server.ws.send({
          type: "full-reload",
          path: "*",
        });
      }
    },
  };
}
