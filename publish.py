from nbconvert import SlidesExporter, HTMLExporter

slides = SlidesExporter()
slides.reveal_scroll = True
slides_body, _ = slides.from_filename("presentation.ipynb")

# stores an interactive slideshow of this presentation
with open("./docs/index.html", "w", encoding="utf8") as f:
    f.write(slides_body)

html = HTMLExporter()
html_body, _ = html.from_filename("presentation.ipynb")

# stores an html render of this presentation
with open("./docs/excerpt.html", "w", encoding="utf8") as f:
    f.write(html_body)
