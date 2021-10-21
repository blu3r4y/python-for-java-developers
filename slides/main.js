import Reveal from 'reveal.js';
import RevealMarkdown from 'reveal.js/plugin/markdown/markdown.esm.js';
import RevealHighlight from 'reveal.js/plugin/highlight/highlight.esm.js';

import 'reveal.js/dist/reveal.css';
import 'reveal.js/dist/theme/simple.css';
import 'highlight.js/styles/idea.css';
import './style.css';

let deck = new Reveal({
  plugins: [RevealMarkdown, RevealHighlight]
});

deck.initialize({
  width: 960,
  height: 720,
  center: false,
  hash: true,
  markdown: {
    smartypants: true
  }
});
