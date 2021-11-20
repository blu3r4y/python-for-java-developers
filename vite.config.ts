export default {
  plugins: [watch_markdown_files()],
  root: "./slides",
  publicDir: "./content", // this is relative to 'root'
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
